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
package org.grails.web.sitemesh;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import com.opensymphony.module.sitemesh.html.util.CharArray;
import com.opensymphony.module.sitemesh.parser.TokenizedHTMLPage;

public class GrailsTokenizedHTMLPage extends TokenizedHTMLPage {

    private final CharArray body;

    private final CharArray head;

    private final char[] data;

    public GrailsTokenizedHTMLPage(char[] data, CharArray body, CharArray head) {
        super(data, body, head);
        this.data = data;
        this.body = body;
        this.head = head;
    }

    @Override
    public void writeHead(Writer out) throws IOException {
        if (out instanceof PrintWriter) {
            this.head.writeTo((PrintWriter) out);
        }
        else {
            super.writeHead(out);
        }
    }

    @Override
    public void writeBody(Writer out) throws IOException {
        if (out instanceof PrintWriter) {
            this.body.writeTo((PrintWriter) out);
        }
        else {
            super.writeBody(out);
        }
    }

    public char[] getData() {
        return this.data;
    }

}
