package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ExtractorHost;
import jsinterop.annotations.JsProperty;
import ng.core.StaticSymbolResolver;
import ng.core.MessageBundle;
import ng.core.CompileMetadataResolver;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\i18n\extractor.d.ts
  * Package ng.core
  * Name Extractor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Extractor  {
    @JsProperty(name="host")
    ExtractorHost getHost();
    @JsProperty(name="host")
    void setHost(ExtractorHost value);
    @JsProperty(name="staticSymbolResolver")
    Object getStaticSymbolResolver();
    @JsProperty(name="staticSymbolResolver")
    void setStaticSymbolResolver(Object value);
    @JsProperty(name="messageBundle")
    Object getMessageBundle();
    @JsProperty(name="messageBundle")
    void setMessageBundle(Object value);
    @JsProperty(name="metadataResolver")
    Object getMetadataResolver();
    @JsProperty(name="metadataResolver")
    void setMetadataResolver(Object value);
    @JsConstructor
    public Extractor(ExtractorHost host,StaticSymbolResolver staticSymbolResolver,MessageBundle messageBundle,CompileMetadataResolver metadataResolver) {}
     Promise<MessageBundle> extract(JsArray<String> rootFiles);
}
