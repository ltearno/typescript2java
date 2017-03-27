package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RegExpMatchArray
  * Typescript fqn RegExpMatchArray
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RegExpMatchArray extends ArrayConstructor {
    /* optional property index*/    @JsProperty(name="index")
    Number getIndex();

    @JsProperty(name="index")
    void setIndex(Number value);

    /* optional property input*/    @JsProperty(name="input")
    String getInput();

    @JsProperty(name="input")
    void setInput(String value);
}
