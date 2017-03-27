package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGPointList
  * Typescript fqn SVGPointList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGPointList {
    @JsProperty(name="numberOfItems")
    Number getNumberOfItems();

    @JsProperty(name="numberOfItems")
    void setNumberOfItems(Number value);

    SVGPoint appendItem(SVGPoint newItem);

    void clear();

    SVGPoint getItem(Number index);

    SVGPoint initialize(SVGPoint newItem);

    SVGPoint insertItemBefore(SVGPoint newItem, Number index);

    SVGPoint removeItem(Number index);

    SVGPoint replaceItem(SVGPoint newItem, Number index);
}
