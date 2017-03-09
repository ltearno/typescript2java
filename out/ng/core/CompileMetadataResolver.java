package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\metadata_resolver.d.ts
  * Package ng.core
  * Name CompileMetadataResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileMetadataResolver  {
    public Object _ngModuleResolver;
    public Object _directiveResolver;
    public Object _pipeResolver;
    public Object _summaryResolver;
    public Object _schemaRegistry;
    public Object _directiveNormalizer;
    public Object _reflector;
    public Object _errorCollector;
    public Object _directiveCache;
    public Object _summaryCache;
    public Object _pipeCache;
    public Object _ngModuleCache;
    public Object _ngModuleOfTypes;
    @JsConstructor
    public CompileMetadataResolver(NgModuleResolver _ngModuleResolver,DirectiveResolver _directiveResolver,PipeResolver _pipeResolver,SummaryResolver<Object> _summaryResolver,ElementSchemaRegistry _schemaRegistry,DirectiveNormalizer _directiveNormalizer,ReflectorReader /* optional */ _reflector,ErrorCollector /* optional */ _errorCollector) {}
    public native  void clearCacheFor(Type<Object> type);
    public native  void clearCache();
    public native  CompileAnimationEntryMetadata getAnimationEntryMetadata(AnimationEntryMetadata entry);
    public native  void _getAnimationStateMetadata();
    public native  void _getAnimationStyleMetadata();
    public native  void _getAnimationMetadata();
    public native  void _loadSummary();
    public native  void _loadDirectiveMetadata();
    public native  /* TypeLiteral */ Object getNonNormalizedDirectiveMetadata(Object directiveType);
    public native  CompileDirectiveMetadata getDirectiveMetadata(Object directiveType);
    public native  CompileDirectiveSummary getDirectiveSummary(Object dirType);
    public native  boolean isDirective(Object type);
    public native  boolean isPipe(Object type);
    public native  CompileNgModuleSummary getNgModuleSummary(Object moduleType);
    public native  Promise<Object> loadNgModuleDirectiveAndPipeMetadata(Object moduleType,boolean isSync,boolean /* optional */ throwIfNotFound);
    public native  CompileNgModuleMetadata getNgModuleMetadata(Object moduleType,boolean /* optional */ throwIfNotFound);
    public native  void _getTypeDescriptor();
    public native  void _addTypeToModule();
    public native  void _getTransitiveNgModuleMetadata();
    public native  void _getIdentifierMetadata();
    public native  boolean isInjectable(Object type);
    public native  CompileTypeSummary getInjectableSummary(Object type);
    public native  void _getInjectableMetadata(UNKNOWN_TYPE_NAME_QuestionToken dependencies);
    public native  void _getTypeMetadata(UNKNOWN_TYPE_NAME_QuestionToken dependencies);
    public native  void _getFactoryMetadata(UNKNOWN_TYPE_NAME_QuestionToken dependencies);
    public native  CompilePipeMetadata getPipeMetadata(Object pipeType);
    public native  CompilePipeSummary getPipeSummary(Object pipeType);
    public native  CompilePipeMetadata getOrLoadPipeMetadata(Object pipeType);
    public native  void _loadPipeMetadata();
    public native  void _getDependenciesMetadata();
    public native  void _getTokenMetadata();
    public native  void _getProvidersMetadata(UNKNOWN_TYPE_NAME_QuestionToken debugInfo,UNKNOWN_TYPE_NAME_QuestionToken compileProviders,UNKNOWN_TYPE_NAME_QuestionToken type);
    public native  void _getEntryComponentsFromProvider(UNKNOWN_TYPE_NAME_QuestionToken type);
    public native  CompileProviderMetadata getProviderMetadata(ProviderMeta provider);
    public native  void _getQueriesMetadata();
    public native  void _queryVarBindings();
    public native  void _getQueryMetadata();
    public native  void _reportError(UNKNOWN_TYPE_NAME_QuestionToken type,UNKNOWN_TYPE_NAME_QuestionToken otherType);
}
