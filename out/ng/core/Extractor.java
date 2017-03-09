package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\i18n\extractor.d.ts
  * Package ng.core
  * Name Extractor
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Extractor  {
    public ExtractorHost host;
    public Object staticSymbolResolver;
    public Object messageBundle;
    public Object metadataResolver;
    @JsConstructor
    public Extractor(ExtractorHost host,StaticSymbolResolver staticSymbolResolver,MessageBundle messageBundle,CompileMetadataResolver metadataResolver) {}
    public native  Promise<MessageBundle> extract(JsArray<String> rootFiles);
    public static native  /* TypeLiteral */ Object create(ExtractorHost host);
}
