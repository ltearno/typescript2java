package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RequestInit
  * Typescript fqn RequestInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RequestInit {
    /* optional property method*/    @JsProperty(name="method")
    String getMethod();

    @JsProperty(name="method")
    void setMethod(String value);

    /* optional property headers*/    @JsProperty(name="headers")
    Object getHeaders();

    @JsProperty(name="headers")
    void setHeaders(Object value);

    /* optional property body*/    @JsProperty(name="body")
    Object getBody();

    @JsProperty(name="body")
    void setBody(Object value);

    /* optional property referrer*/    @JsProperty(name="referrer")
    String getReferrer();

    @JsProperty(name="referrer")
    void setReferrer(String value);

    /* optional property referrerPolicy*/    @JsProperty(name="referrerPolicy")
    String getReferrerPolicy();

    @JsProperty(name="referrerPolicy")
    void setReferrerPolicy(String value);

    /* optional property mode*/    @JsProperty(name="mode")
    String getMode();

    @JsProperty(name="mode")
    void setMode(String value);

    /* optional property credentials*/    @JsProperty(name="credentials")
    String getCredentials();

    @JsProperty(name="credentials")
    void setCredentials(String value);

    /* optional property cache*/    @JsProperty(name="cache")
    String getCache();

    @JsProperty(name="cache")
    void setCache(String value);

    /* optional property redirect*/    @JsProperty(name="redirect")
    String getRedirect();

    @JsProperty(name="redirect")
    void setRedirect(String value);

    /* optional property integrity*/    @JsProperty(name="integrity")
    String getIntegrity();

    @JsProperty(name="integrity")
    void setIntegrity(String value);

    /* optional property keepalive*/    @JsProperty(name="keepalive")
    boolean getKeepalive();

    @JsProperty(name="keepalive")
    void setKeepalive(boolean value);

    /* optional property window*/    @JsProperty(name="window")
    Object getWindow();

    @JsProperty(name="window")
    void setWindow(Object value);
}
