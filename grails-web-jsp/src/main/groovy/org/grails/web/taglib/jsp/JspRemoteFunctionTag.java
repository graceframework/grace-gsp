/*
 * Copyright 2004-2022 the original author or authors.
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
package org.grails.web.taglib.jsp;

/**
 * @author Graeme Rocher
 */
public class JspRemoteFunctionTag extends JspInvokeGrailsTagLibTag {

    private static final long serialVersionUID = -4345166429867722872L;

    private static final String TAG_NAME = "remoteFunction";

    private String controller;

    private String action;

    private String id;

    private String update;

    private String before;

    private String after;

    private String method;

    private String asynchronous;

    private String url;

    private String params;

    private String onSuccess;

    private String onFailure;

    private String onComplete;

    private String onLoading;

    private String onLoaded;

    private String onInteractive;

    public JspRemoteFunctionTag() {
        setTagName(TAG_NAME);
    }

    public String getParams() {
        return this.params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getOnSuccess() {
        return this.onSuccess;
    }

    public void setOnSuccess(String onSuccess) {
        this.onSuccess = onSuccess;
    }

    public String getOnFailure() {
        return this.onFailure;
    }

    public void setOnFailure(String onFailure) {
        this.onFailure = onFailure;
    }

    public String getOnComplete() {
        return this.onComplete;
    }

    public void setOnComplete(String onComplete) {
        this.onComplete = onComplete;
    }

    public String getOnLoading() {
        return this.onLoading;
    }

    public void setOnLoading(String onLoading) {
        this.onLoading = onLoading;
    }

    public String getOnLoaded() {
        return this.onLoaded;
    }

    public void setOnLoaded(String onLoaded) {
        this.onLoaded = onLoaded;
    }

    public String getOnInteractive() {
        return this.onInteractive;
    }

    public void setOnInteractive(String onInteractive) {
        this.onInteractive = onInteractive;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getController() {
        return this.controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getUpdate() {
        return this.update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getBefore() {
        return this.before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getAfter() {
        return this.after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getAsynchronous() {
        return this.asynchronous;
    }

    public void setAsynchronous(String asynchronous) {
        this.asynchronous = asynchronous;
    }

}
