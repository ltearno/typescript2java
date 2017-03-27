package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStreamError
  * Typescript fqn MediaStreamError
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStreamError {
    @JsProperty(name="constraintName")
    String getConstraintName();

    @JsProperty(name="constraintName")
    void setConstraintName(String value);

    @JsProperty(name="message")
    String getMessage();

    @JsProperty(name="message")
    void setMessage(String value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);
}
