package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MessageEvent
  * Typescript fqn MessageEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MessageEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="data")
    Object getData();

    @JsProperty(name="data")
    void setData(Object value);

    @JsProperty(name="origin")
    String getOrigin();

    @JsProperty(name="origin")
    void setOrigin(String value);

    @JsProperty(name="ports")
    Object getPorts();

    @JsProperty(name="ports")
    void setPorts(Object value);

    @JsProperty(name="source")
    Window getSource();

    @JsProperty(name="source")
    void setSource(Window value);

    void initMessageEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Object dataArg, String originArg, String lastEventIdArg, Window sourceArg);
}
