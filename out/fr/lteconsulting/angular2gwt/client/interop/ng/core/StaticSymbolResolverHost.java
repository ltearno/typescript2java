package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StaticSymbolResolverHost  {
     JsArray<JsTypedObject<String,Object>> getMetadataFor(String modulePath);
     String moduleNameToFileName(String moduleName,String containingFile);
}
