package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StaticSymbol  {
    @JsProperty(name="filePath")
    String getFilePath();
    @JsProperty(name="filePath")
    void setFilePath(String value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="members")
    JsArray<String> getMembers();
    @JsProperty(name="members")
    void setMembers(JsArray<String> value);
    @JsConstructor
    public StaticSymbol(String filePath,String name,JsArray<String> /* optional */ members) {}
}
