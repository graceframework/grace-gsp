/*
 * Copyright 2011-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.gsp.io;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.core.io.Resource;

import grails.util.CacheEntry;

/**
 * Extends {@link GroovyPageStaticResourceLocator} adding caching of the result
 * of {@link GroovyPageStaticResourceLocator#findResourceForURI(String)}.
 *
 * @author Graeme Rocher
 * @since 2.0
 */
public class CachingGroovyPageStaticResourceLocator extends GroovyPageStaticResourceLocator {

    private ConcurrentMap<String, CacheEntry<Resource>> uriResolveCache = new ConcurrentHashMap<>();

    private long cacheTimeout = -1;

    @Override
    public Resource findResourceForURI(final String uri) {
        Callable<Resource> updater = new Callable<Resource>() {
            public Resource call() {
                Resource resource = CachingGroovyPageStaticResourceLocator.super.findResourceForURI(uri);
                if (resource == null) {
                    resource = NULL_RESOURCE;
                }
                return resource;
            }
        };

        Resource resource = CacheEntry.getValue(this.uriResolveCache, uri, this.cacheTimeout, updater);
        return resource == NULL_RESOURCE ? null : resource;
    }

    public long getCacheTimeout() {
        return this.cacheTimeout;
    }

    public void setCacheTimeout(long cacheTimeout) {
        this.cacheTimeout = cacheTimeout;
    }

}
