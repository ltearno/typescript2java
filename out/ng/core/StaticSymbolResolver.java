package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\aot\static_symbol_resolver.d.ts
  * Package ng.core
  * Name StaticSymbolResolver
  * This class is responsible for loading metadata per symbol,
  * and normalizing references between symbols.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StaticSymbolResolver  {
    public Object host;
    public Object staticSymbolCache;
    public Object summaryResolver;
    public Object errorRecorder;
    public Object metadataCache;
    public Object resolvedSymbols;
    public Object resolvedFilePaths;
    @JsConstructor
    public StaticSymbolResolver(StaticSymbolResolverHost host,StaticSymbolCache staticSymbolCache,SummaryResolver<StaticSymbol> summaryResolver,JsFunction2<Object,String,Void> /* optional */ errorRecorder) {}
    public native  ResolvedStaticSymbol resolveSymbol(StaticSymbol staticSymbol);
    public native  void _resolveSymbolMembers();
    public native  void _resolveSymbolFromSummary();
    public native  StaticSymbol getStaticSymbol(String declarationFile,String name,JsArray<String> /* optional */ members);
    public native  JsArray<StaticSymbol> getSymbolsOf(String filePath);
    public native  void _createSymbolsOf();
    public native  void createResolvedSymbol();
    public native  void reportError(UNKNOWN_TYPE_NAME_QuestionToken path);
    public native  void getModuleMetadata();
    public native  StaticSymbol getSymbolByModule(String module,String symbolName,String /* optional */ containingFile);
    public native  void resolveModule();
}
