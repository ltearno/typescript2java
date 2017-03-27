package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IntersectionObserverEntry
  * Typescript fqn IntersectionObserverEntry
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IntersectionObserverEntry {
    @JsProperty(name="boundingClientRect")
    ClientRect getBoundingClientRect();

    @JsProperty(name="boundingClientRect")
    void setBoundingClientRect(ClientRect value);

    @JsProperty(name="intersectionRatio")
    Number getIntersectionRatio();

    @JsProperty(name="intersectionRatio")
    void setIntersectionRatio(Number value);

    @JsProperty(name="intersectionRect")
    ClientRect getIntersectionRect();

    @JsProperty(name="intersectionRect")
    void setIntersectionRect(ClientRect value);

    @JsProperty(name="rootBounds")
    ClientRect getRootBounds();

    @JsProperty(name="rootBounds")
    void setRootBounds(ClientRect value);

    @JsProperty(name="target")
    Element getTarget();

    @JsProperty(name="target")
    void setTarget(Element value);

    @JsProperty(name="time")
    Number getTime();

    @JsProperty(name="time")
    void setTime(Number value);
}
