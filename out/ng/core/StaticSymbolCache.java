package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\aot\static_symbol.d.ts
  * Package ng.core
  * Name StaticSymbolCache
  * A cache of static symbol used by the StaticReflector to return the same symbol for the
  * same symbol values.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StaticSymbolCache  {
    public Object cache;
    public native  StaticSymbol get(String declarationFile,String name,JsArray<String> /* optional */ members);
}
