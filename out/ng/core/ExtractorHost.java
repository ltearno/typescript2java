package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\i18n\extractor.d.ts
  * Package ng.core
  * Name ExtractorHost
  * The host of the Extractor disconnects the implementation from TypeScript / other language
  * services and from underlying file systems.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class ExtractorHost extends StaticSymbolResolverHost {
    public native  Promise<String> loadResource(String path);
}
