package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\aot\compiler_host.d.ts
  * Package ng.core
  * Name AotCompilerHost
  * The host of the AotCompiler disconnects the implementation from TypeScript / other language
  * services and from underlying file systems.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class AotCompilerHost extends StaticSymbolResolverHost {
    public native  Promise<String> loadResource(String path);
}
