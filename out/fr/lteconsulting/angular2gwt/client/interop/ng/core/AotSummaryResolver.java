package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.StaticSymbol;
import jsinterop.annotations.JsProperty;
import ng.core.AotSummaryResolverHost;
import ng.core.StaticSymbolCache;
import jsinterop.annotations.JsConstructor;
import ng.core.Summary;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\aot\summary_resolver.d.ts
  * Package ng.core
  * Name AotSummaryResolver
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AotSummaryResolver extends SummaryResolver<StaticSymbol> {
    @JsProperty(name="host")
    Object getHost();
    @JsProperty(name="host")
    void setHost(Object value);
    @JsProperty(name="staticSymbolCache")
    Object getStaticSymbolCache();
    @JsProperty(name="staticSymbolCache")
    void setStaticSymbolCache(Object value);
    @JsProperty(name="summaryCache")
    Object getSummaryCache();
    @JsProperty(name="summaryCache")
    void setSummaryCache(Object value);
    @JsProperty(name="loadedFilePaths")
    Object getLoadedFilePaths();
    @JsProperty(name="loadedFilePaths")
    void setLoadedFilePaths(Object value);
    @JsConstructor
    public AotSummaryResolver(AotSummaryResolverHost host,StaticSymbolCache staticSymbolCache) {}
     void _assertNoMembers();
     Summary<StaticSymbol> resolveSummary(StaticSymbol staticSymbol);
     JsArray<StaticSymbol> getSymbolsOf(String filePath);
     void _loadSummaryFile();
}
