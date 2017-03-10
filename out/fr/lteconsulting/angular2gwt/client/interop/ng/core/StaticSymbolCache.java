package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.StaticSymbol;

/**
  * Generated from tests\@angular\compiler\src\aot\static_symbol.d.ts
  * Package ng.core
  * Name StaticSymbolCache
  * A cache of static symbol used by the StaticReflector to return the same symbol for the
  * same symbol values.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StaticSymbolCache  {
    @JsProperty(name="cache")
    Object getCache();
    @JsProperty(name="cache")
    void setCache(Object value);
     StaticSymbol get(String declarationFile,String name,JsArray<String> /* optional */ members);
}
