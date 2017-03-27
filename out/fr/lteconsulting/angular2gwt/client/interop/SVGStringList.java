package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGStringList
  * Typescript fqn SVGStringList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGStringList {
    @JsProperty(name="numberOfItems")
    Number getNumberOfItems();

    @JsProperty(name="numberOfItems")
    void setNumberOfItems(Number value);

    String appendItem(String newItem);

    void clear();

    String getItem(Number index);

    String initialize(String newItem);

    String insertItemBefore(String newItem, Number index);

    String removeItem(Number index);

    String replaceItem(String newItem, Number index);
}
