package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGLengthList
  * Typescript fqn SVGLengthList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGLengthList {
    @JsProperty(name="numberOfItems")
    Number getNumberOfItems();

    @JsProperty(name="numberOfItems")
    void setNumberOfItems(Number value);

    SVGLength appendItem(SVGLength newItem);

    void clear();

    SVGLength getItem(Number index);

    SVGLength initialize(SVGLength newItem);

    SVGLength insertItemBefore(SVGLength newItem, Number index);

    SVGLength removeItem(Number index);

    SVGLength replaceItem(SVGLength newItem, Number index);
}
