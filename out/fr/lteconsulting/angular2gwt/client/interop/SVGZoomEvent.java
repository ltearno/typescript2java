package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGZoomEvent
  * Typescript fqn SVGZoomEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGZoomEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="newScale")
    Number getNewScale();

    @JsProperty(name="newScale")
    void setNewScale(Number value);

    @JsProperty(name="newTranslate")
    SVGPoint getNewTranslate();

    @JsProperty(name="newTranslate")
    void setNewTranslate(SVGPoint value);

    @JsProperty(name="previousScale")
    Number getPreviousScale();

    @JsProperty(name="previousScale")
    void setPreviousScale(Number value);

    @JsProperty(name="previousTranslate")
    SVGPoint getPreviousTranslate();

    @JsProperty(name="previousTranslate")
    void setPreviousTranslate(SVGPoint value);

    @JsProperty(name="zoomRectScreen")
    SVGRect getZoomRectScreen();

    @JsProperty(name="zoomRectScreen")
    void setZoomRectScreen(SVGRect value);
}
