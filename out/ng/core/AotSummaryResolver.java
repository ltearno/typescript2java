package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\aot\summary_resolver.d.ts
  * Package ng.core
  * Name AotSummaryResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AotSummaryResolver extends SummaryResolver<StaticSymbol> {
    public Object host;
    public Object staticSymbolCache;
    public Object summaryCache;
    public Object loadedFilePaths;
    @JsConstructor
    public AotSummaryResolver(AotSummaryResolverHost host,StaticSymbolCache staticSymbolCache) {}
    public native  void _assertNoMembers();
    public native  Summary<StaticSymbol> resolveSummary(StaticSymbol staticSymbol);
    public native  JsArray<StaticSymbol> getSymbolsOf(String filePath);
    public native  void _loadSummaryFile();
}
