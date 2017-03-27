package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGFEMergeNodeElement
  * Typescript fqn SVGFEMergeNodeElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGFEMergeNodeElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="in1")
    SVGAnimatedString getIn1();

    @JsProperty(name="in1")
    void setIn1(SVGAnimatedString value);

    <K> void addEventListener(K type, JsFunction2<SVGFEMergeNodeElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
