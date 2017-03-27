package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ErrorEvent
  * Typescript fqn ErrorEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ErrorEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="colno")
    Number getColno();

    @JsProperty(name="colno")
    void setColno(Number value);

    @JsProperty(name="error")
    Object getError();

    @JsProperty(name="error")
    void setError(Object value);

    @JsProperty(name="filename")
    String getFilename();

    @JsProperty(name="filename")
    void setFilename(String value);

    @JsProperty(name="lineno")
    Number getLineno();

    @JsProperty(name="lineno")
    void setLineno(Number value);

    @JsProperty(name="message")
    String getMessage();

    @JsProperty(name="message")
    void setMessage(String value);

    void initErrorEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, String messageArg, String filenameArg, Number linenoArg);
}
