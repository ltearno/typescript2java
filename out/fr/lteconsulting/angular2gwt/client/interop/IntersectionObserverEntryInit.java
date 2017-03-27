package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IntersectionObserverEntryInit
  * Typescript fqn IntersectionObserverEntryInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IntersectionObserverEntryInit {
    /* optional property time*/    @JsProperty(name="time")
    Number getTime();

    @JsProperty(name="time")
    void setTime(Number value);

    /* optional property rootBounds*/    @JsProperty(name="rootBounds")
    DOMRectInit getRootBounds();

    @JsProperty(name="rootBounds")
    void setRootBounds(DOMRectInit value);

    /* optional property boundingClientRect*/    @JsProperty(name="boundingClientRect")
    DOMRectInit getBoundingClientRect();

    @JsProperty(name="boundingClientRect")
    void setBoundingClientRect(DOMRectInit value);

    /* optional property intersectionRect*/    @JsProperty(name="intersectionRect")
    DOMRectInit getIntersectionRect();

    @JsProperty(name="intersectionRect")
    void setIntersectionRect(DOMRectInit value);

    /* optional property target*/    @JsProperty(name="target")
    Element getTarget();

    @JsProperty(name="target")
    void setTarget(Element value);
}
