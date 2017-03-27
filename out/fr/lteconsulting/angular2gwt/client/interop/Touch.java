package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Touch
  * Typescript fqn Touch
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Touch {
    @JsProperty(name="clientX")
    Number getClientX();

    @JsProperty(name="clientX")
    void setClientX(Number value);

    @JsProperty(name="clientY")
    Number getClientY();

    @JsProperty(name="clientY")
    void setClientY(Number value);

    @JsProperty(name="identifier")
    Number getIdentifier();

    @JsProperty(name="identifier")
    void setIdentifier(Number value);

    @JsProperty(name="pageX")
    Number getPageX();

    @JsProperty(name="pageX")
    void setPageX(Number value);

    @JsProperty(name="pageY")
    Number getPageY();

    @JsProperty(name="pageY")
    void setPageY(Number value);

    @JsProperty(name="screenX")
    Number getScreenX();

    @JsProperty(name="screenX")
    void setScreenX(Number value);

    @JsProperty(name="screenY")
    Number getScreenY();

    @JsProperty(name="screenY")
    void setScreenY(Number value);

    @JsProperty(name="target")
    EventTarget getTarget();

    @JsProperty(name="target")
    void setTarget(EventTarget value);
}
