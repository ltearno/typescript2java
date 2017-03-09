package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\provider_analyzer.d.ts
  * Package ng.core
  * Name NgModuleProviderAnalyzer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgModuleProviderAnalyzer  {
    public Object _transformedProviders;
    public Object _seenProviders;
    public Object _allProviders;
    public Object _errors;
    @JsConstructor
    public NgModuleProviderAnalyzer(CompileNgModuleMetadata ngModule,JsArray<CompileProviderMetadata> extraProviders,ParseSourceSpan sourceSpan) {}
    public native  JsArray<ProviderAst> parse();
    public native  void _getOrCreateLocalProvider();
    public native  void _getDependency();
}
