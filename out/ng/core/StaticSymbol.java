package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\aot\static_symbol.d.ts
  * Package ng.core
  * Name StaticSymbol
  * A token representing the a reference to a static type.
  * 
  * This token is unique for a filePath and name and can be used as a hash table key.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StaticSymbol  {
    public String filePath;
    public String name;
    public JsArray<String> members;
    @JsConstructor
    public StaticSymbol(String filePath,String name,JsArray<String> /* optional */ members) {}
}
