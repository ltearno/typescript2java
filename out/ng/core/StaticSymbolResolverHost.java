package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\aot\static_symbol_resolver.d.ts
  * Package ng.core
  * Name StaticSymbolResolverHost
  * The host of the SymbolResolverHost disconnects the implementation from TypeScript / other
  * language
  * services and from underlying file systems.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class StaticSymbolResolverHost  {
    public native  JsArray<JsTypedObject<String,Object>> getMetadataFor(String modulePath);
    public native  String moduleNameToFileName(String moduleName,String containingFile);
}
