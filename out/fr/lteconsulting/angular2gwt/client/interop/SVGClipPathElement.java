package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGClipPathElement
  * Typescript fqn SVGClipPathElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGClipPathElement extends Object /* no JavaNode for symbol */, SVGUnitTypes {
    @JsProperty(name="clipPathUnits")
    SVGAnimatedEnumeration getClipPathUnits();

    @JsProperty(name="clipPathUnits")
    void setClipPathUnits(SVGAnimatedEnumeration value);

    <K> void addEventListener(K type, JsFunction2<SVGClipPathElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
