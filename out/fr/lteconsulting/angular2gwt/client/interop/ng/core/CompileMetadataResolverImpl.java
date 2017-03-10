package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.NgModuleResolver;
import ng.core.DirectiveResolver;
import ng.core.PipeResolver;
import ng.core.SummaryResolver;
import ng.core.ElementSchemaRegistry;
import ng.core.DirectiveNormalizer;
import ng.core.ReflectorReader;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.AnimationEntryMetadata;
import ng.core.CompileAnimationEntryMetadata;
import ng.core.CompileDirectiveMetadata;
import ng.core.CompileDirectiveSummary;
import ng.core.CompileNgModuleSummary;
import ng.core.CompileNgModuleMetadata;
import ng.core.CompileTypeSummary;
import ng.core.CompilePipeMetadata;
import ng.core.CompilePipeSummary;
import ng.core.ProviderMeta;
import ng.core.CompileProviderMetadata;

/**
  * Generated from tests\@angular\compiler\src\metadata_resolver.d.ts
  * Package ng.core
  * Name CompileMetadataResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileMetadataResolver" )
public class CompileMetadataResolverImpl  {
    @JsProperty(name="_ngModuleResolver")
    Object get_ngModuleResolver();
    @JsProperty(name="_ngModuleResolver")
    void set_ngModuleResolver(Object value);
    @JsProperty(name="_directiveResolver")
    Object get_directiveResolver();
    @JsProperty(name="_directiveResolver")
    void set_directiveResolver(Object value);
    @JsProperty(name="_pipeResolver")
    Object get_pipeResolver();
    @JsProperty(name="_pipeResolver")
    void set_pipeResolver(Object value);
    @JsProperty(name="_summaryResolver")
    Object get_summaryResolver();
    @JsProperty(name="_summaryResolver")
    void set_summaryResolver(Object value);
    @JsProperty(name="_schemaRegistry")
    Object get_schemaRegistry();
    @JsProperty(name="_schemaRegistry")
    void set_schemaRegistry(Object value);
    @JsProperty(name="_directiveNormalizer")
    Object get_directiveNormalizer();
    @JsProperty(name="_directiveNormalizer")
    void set_directiveNormalizer(Object value);
    @JsProperty(name="_reflector")
    Object get_reflector();
    @JsProperty(name="_reflector")
    void set_reflector(Object value);
    @JsProperty(name="_errorCollector")
    Object get_errorCollector();
    @JsProperty(name="_errorCollector")
    void set_errorCollector(Object value);
    @JsProperty(name="_directiveCache")
    Object get_directiveCache();
    @JsProperty(name="_directiveCache")
    void set_directiveCache(Object value);
    @JsProperty(name="_summaryCache")
    Object get_summaryCache();
    @JsProperty(name="_summaryCache")
    void set_summaryCache(Object value);
    @JsProperty(name="_pipeCache")
    Object get_pipeCache();
    @JsProperty(name="_pipeCache")
    void set_pipeCache(Object value);
    @JsProperty(name="_ngModuleCache")
    Object get_ngModuleCache();
    @JsProperty(name="_ngModuleCache")
    void set_ngModuleCache(Object value);
    @JsProperty(name="_ngModuleOfTypes")
    Object get_ngModuleOfTypes();
    @JsProperty(name="_ngModuleOfTypes")
    void set_ngModuleOfTypes(Object value);
    @JsConstructor
    public CompileMetadataResolverImpl(NgModuleResolver _ngModuleResolver,DirectiveResolver _directiveResolver,PipeResolver _pipeResolver,SummaryResolver<Object> _summaryResolver,ElementSchemaRegistry _schemaRegistry,DirectiveNormalizer _directiveNormalizer,ReflectorReader /* optional */ _reflector,ErrorCollector /* optional */ _errorCollector) {}
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
