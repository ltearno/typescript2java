package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.StaticSymbolResolverHost;
import ng.core.StaticSymbolCache;
import ng.core.SummaryResolver;
import ng.core.StaticSymbol;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import ng.core.ResolvedStaticSymbol;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\aot\static_symbol_resolver.d.ts
  * Package ng.core
  * Name StaticSymbolResolver
  * This class is responsible for loading metadata per symbol,
  * and normalizing references between symbols.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StaticSymbolResolver  {
    @JsProperty(name="host")
    Object getHost();
    @JsProperty(name="host")
    void setHost(Object value);
    @JsProperty(name="staticSymbolCache")
    Object getStaticSymbolCache();
    @JsProperty(name="staticSymbolCache")
    void setStaticSymbolCache(Object value);
    @JsProperty(name="summaryResolver")
    Object getSummaryResolver();
    @JsProperty(name="summaryResolver")
    void setSummaryResolver(Object value);
    @JsProperty(name="errorRecorder")
    Object getErrorRecorder();
    @JsProperty(name="errorRecorder")
    void setErrorRecorder(Object value);
    @JsProperty(name="metadataCache")
    Object getMetadataCache();
    @JsProperty(name="metadataCache")
    void setMetadataCache(Object value);
    @JsProperty(name="resolvedSymbols")
    Object getResolvedSymbols();
    @JsProperty(name="resolvedSymbols")
    void setResolvedSymbols(Object value);
    @JsProperty(name="resolvedFilePaths")
    Object getResolvedFilePaths();
    @JsProperty(name="resolvedFilePaths")
    void setResolvedFilePaths(Object value);
    @JsConstructor
    public StaticSymbolResolver(StaticSymbolResolverHost host,StaticSymbolCache staticSymbolCache,SummaryResolver<StaticSymbol> summaryResolver,JsFunction2<Object,String,Void> /* optional */ errorRecorder) {}
     ResolvedStaticSymbol resolveSymbol(StaticSymbol staticSymbol);
     void _resolveSymbolMembers();
     void _resolveSymbolFromSummary();
     StaticSymbol getStaticSymbol(String declarationFile,String name,JsArray<String> /* optional */ members);
     JsArray<StaticSymbol> getSymbolsOf(String filePath);
     void _createSymbolsOf();
     void createResolvedSymbol();
     void reportError(UNKNOWN_TYPE_NAME_QuestionToken path);
     void getModuleMetadata();
     StaticSymbol getSymbolByModule(String module,String symbolName,String /* optional */ containingFile);
     void resolveModule();
}
