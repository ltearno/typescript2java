package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\compiler\src\i18n\extractor.d.ts
  * Package ng.core
  * Name ExtractorHost
  * The host of the Extractor disconnects the implementation from TypeScript / other language
  * services and from underlying file systems.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExtractorHost extends StaticSymbolResolverHost {
     Promise<String> loadResource(String path);
}
