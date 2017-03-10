package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileNgModuleMetadata;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileProviderMetadata;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.ProviderAst;

/**
  * Generated from tests\@angular\compiler\src\provider_analyzer.d.ts
  * Package ng.core
  * Name NgModuleProviderAnalyzer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgModuleProviderAnalyzer  {
    @JsProperty(name="_transformedProviders")
    Object get_transformedProviders();
    @JsProperty(name="_transformedProviders")
    void set_transformedProviders(Object value);
    @JsProperty(name="_seenProviders")
    Object get_seenProviders();
    @JsProperty(name="_seenProviders")
    void set_seenProviders(Object value);
    @JsProperty(name="_allProviders")
    Object get_allProviders();
    @JsProperty(name="_allProviders")
    void set_allProviders(Object value);
    @JsProperty(name="_errors")
    Object get_errors();
    @JsProperty(name="_errors")
    void set_errors(Object value);
    @JsConstructor
    public NgModuleProviderAnalyzer(CompileNgModuleMetadata ngModule,JsArray<CompileProviderMetadata> extraProviders,ParseSourceSpan sourceSpan) {}
     JsArray<ProviderAst> parse();
     void _getOrCreateLocalProvider();
     void _getDependency();
}
