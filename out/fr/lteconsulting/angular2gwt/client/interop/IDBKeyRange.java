package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBKeyRange
  * Typescript fqn IDBKeyRange
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBKeyRange {
    @JsProperty(name="lower")
    Object getLower();

    @JsProperty(name="lower")
    void setLower(Object value);

    @JsProperty(name="lowerOpen")
    boolean getLowerOpen();

    @JsProperty(name="lowerOpen")
    void setLowerOpen(boolean value);

    @JsProperty(name="upper")
    Object getUpper();

    @JsProperty(name="upper")
    void setUpper(Object value);

    @JsProperty(name="upperOpen")
    boolean getUpperOpen();

    @JsProperty(name="upperOpen")
    void setUpperOpen(boolean value);
}
