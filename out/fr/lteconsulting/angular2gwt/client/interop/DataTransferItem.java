package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DataTransferItem
  * Typescript fqn DataTransferItem
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DataTransferItem {
    @JsProperty(name="kind")
    String getKind();

    @JsProperty(name="kind")
    void setKind(String value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    Object /* UnionType */ getAsFile();

    void getAsString(Object /* UnionType */ _callback);

    Object webkitGetAsEntry();
}
