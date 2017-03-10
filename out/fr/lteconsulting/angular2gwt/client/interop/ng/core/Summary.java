package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileTypeSummary;

/**
  * Generated from tests\@angular\compiler\src\summary_resolver.d.ts
  * Package ng.core
  * Name Summary
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Summary<T>  {
    @JsProperty(name="symbol")
    T symbol();
    @JsProperty(name="symbol")
    void symbol(T value);
    @JsProperty(name="metadata")
    Object metadata();
    @JsProperty(name="metadata")
    void metadata(Object value);
    /* optional property type*/    @JsProperty(name="type")
    CompileTypeSummary type();
    @JsProperty(name="type")
    void type(CompileTypeSummary value);
}
