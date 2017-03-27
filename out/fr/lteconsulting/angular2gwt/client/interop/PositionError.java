package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PositionError
  * Typescript fqn PositionError
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PositionError {
    @JsProperty(name="code")
    Number getCode();

    @JsProperty(name="code")
    void setCode(Number value);

    @JsProperty(name="message")
    String getMessage();

    @JsProperty(name="message")
    void setMessage(String value);

    @JsProperty(name="PERMISSION_DENIED")
    Number getPERMISSION_DENIED();

    @JsProperty(name="PERMISSION_DENIED")
    void setPERMISSION_DENIED(Number value);

    @JsProperty(name="POSITION_UNAVAILABLE")
    Number getPOSITION_UNAVAILABLE();

    @JsProperty(name="POSITION_UNAVAILABLE")
    void setPOSITION_UNAVAILABLE(Number value);

    @JsProperty(name="TIMEOUT")
    Number getTIMEOUT();

    @JsProperty(name="TIMEOUT")
    void setTIMEOUT(Number value);

    String toString();
}
