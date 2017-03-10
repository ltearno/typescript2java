package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.StaticSymbol;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\aot\static_symbol_resolver.d.ts
  * Package ng.core
  * Name ResolvedStaticSymbol
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ResolvedStaticSymbol" )
public class ResolvedStaticSymbolImpl  {
    @JsProperty(name="symbol")
    StaticSymbol getSymbol();
    @JsProperty(name="symbol")
    void setSymbol(StaticSymbol value);
    @JsProperty(name="metadata")
    Object getMetadata();
    @JsProperty(name="metadata")
    void setMetadata(Object value);
    @JsConstructor
    public ResolvedStaticSymbolImpl(StaticSymbol symbol,Object metadata) {}
}
