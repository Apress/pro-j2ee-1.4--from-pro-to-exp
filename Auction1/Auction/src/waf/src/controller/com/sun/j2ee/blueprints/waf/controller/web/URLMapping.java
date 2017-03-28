/* Copyright 2002 Sun Microsystems, Inc. All rights reserved.
 
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 
 - Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
 
 - Redistribution in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in
   the documentation and/or other materials provided with the
   distribution.
 
 Neither the name of Sun Microsystems, Inc. or the names of
 contributors may be used to endorse or promote products derived
 from this software without specific prior written permission.
 
 This software is provided "AS IS," without a warranty of any
 kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES
 SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN
 OR ITS LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR
 FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR
 PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF
 LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO USE SOFTWARE,
 EVEN IF SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 
 You acknowledge that Software is not designed, licensed or intended
 for use in the design, construction, operation or maintenance of
 any nuclear facility.
 $Id: URLMapping.java,v 1.2 2002/11/19 20:37:39 gmurray Exp $ */

package com.sun.j2ee.blueprints.waf.controller.web;

import java.util.HashMap;

public class URLMapping implements java.io.Serializable {

    private String url;
    private boolean isAction = false;
    private boolean useFlowHandler = false;
    private String flowHandler = null;
    private String webActionClass = null;
    private String ejbActionClass = null;
    private HashMap resultMappings;
    private String screen;

    public URLMapping(String url, String screen) {
        this.url = url;
        this.screen = screen;
    }

    public URLMapping(String url, 
                                    String screen,
                                    boolean isAction,
                                    boolean useFlowHandler,
                                    String webActionClass,
                                    String flowHandler,
                                    HashMap resultMappings) {
        this.url = url;
        this.flowHandler = flowHandler;
        this.webActionClass = webActionClass;
        this.isAction = isAction;
        this.useFlowHandler = useFlowHandler ;
        this.resultMappings = resultMappings;
        this.screen = screen;
    }

    public boolean useFlowHandler() {
        return useFlowHandler;
    }

    public boolean isAction() {
        return isAction;
    }

    public String getWebAction() {
        return webActionClass;
    }
    
    public String getFlowHandler() {
        return flowHandler;
    }

    public String getScreen() {
        return screen;
    }

    public String getResultScreen(String key) {
        if (resultMappings != null) {
            return (String)resultMappings.get(key);
        } else {
            return null;
        } 
    }

    public HashMap getResultMappings() {
        return resultMappings;
    }

    public String toString() {
        return "[URLMapping: url=" + url +
                ", isAction=" + isAction +
                ", useFlowHandler=" + useFlowHandler +
                ", webActionClass=" + webActionClass +
                ", ejbActionClass=" + ejbActionClass +
                ", flowHandler=" + flowHandler +
                ", resultMappings=" + resultMappings +
                "]";
    }
}


