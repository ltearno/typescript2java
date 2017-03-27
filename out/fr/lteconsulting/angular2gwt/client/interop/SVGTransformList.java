package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGTransformList
  * Typescript fqn SVGTransformList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGTransformList {
    @JsProperty(name="numberOfItems")
    Number getNumberOfItems();

    @JsProperty(name="numberOfItems")
    void setNumberOfItems(Number value);

    SVGTransform appendItem(SVGTransform newItem);

    void clear();

    SVGTransform consolidate();

    SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);

    SVGTransform getItem(Number index);

    SVGTransform initialize(SVGTransform newItem);

    SVGTransform insertItemBefore(SVGTransform newItem, Number index);

    SVGTransform removeItem(Number index);

    SVGTransform replaceItem(SVGTransform newItem, Number index);
}
