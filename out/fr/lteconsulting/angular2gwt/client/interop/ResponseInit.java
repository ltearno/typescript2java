package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ResponseInit
  * Typescript fqn ResponseInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ResponseInit {
    /* optional property status*/    @JsProperty(name="status")
    Number getStatus();

    @JsProperty(name="status")
    void setStatus(Number value);

    /* optional property statusText*/    @JsProperty(name="statusText")
    String getStatusText();

    @JsProperty(name="statusText")
    void setStatusText(String value);

    /* optional property headers*/    @JsProperty(name="headers")
    Object getHeaders();

    @JsProperty(name="headers")
    void setHeaders(Object value);
}
