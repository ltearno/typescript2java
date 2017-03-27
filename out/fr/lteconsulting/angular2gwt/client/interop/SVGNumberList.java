package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGNumberList
  * Typescript fqn SVGNumberList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGNumberList {
    @JsProperty(name="numberOfItems")
    Number getNumberOfItems();

    @JsProperty(name="numberOfItems")
    void setNumberOfItems(Number value);

    SVGNumber appendItem(SVGNumber newItem);

    void clear();

    SVGNumber getItem(Number index);

    SVGNumber initialize(SVGNumber newItem);

    SVGNumber insertItemBefore(SVGNumber newItem, Number index);

    SVGNumber removeItem(Number index);

    SVGNumber replaceItem(SVGNumber newItem, Number index);
}
