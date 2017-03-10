package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\compiler\src\aot\compiler_host.d.ts
  * Package ng.core
  * Name AotCompilerHost
  * The host of the AotCompiler disconnects the implementation from TypeScript / other language
  * services and from underlying file systems.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AotCompilerHost extends StaticSymbolResolverHost {
     Promise<String> loadResource(String path);
}
