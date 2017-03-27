package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGPathSegList
  * Typescript fqn SVGPathSegList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGPathSegList {
    @JsProperty(name="numberOfItems")
    Number getNumberOfItems();

    @JsProperty(name="numberOfItems")
    void setNumberOfItems(Number value);

    SVGPathSeg appendItem(SVGPathSeg newItem);

    void clear();

    SVGPathSeg getItem(Number index);

    SVGPathSeg initialize(SVGPathSeg newItem);

    SVGPathSeg insertItemBefore(SVGPathSeg newItem, Number index);

    SVGPathSeg removeItem(Number index);

    SVGPathSeg replaceItem(SVGPathSeg newItem, Number index);
}
