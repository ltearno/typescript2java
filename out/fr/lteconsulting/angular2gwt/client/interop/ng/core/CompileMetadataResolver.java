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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileMetadataResolver  {
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
    public CompileMetadataResolver(NgModuleResolver _ngModuleResolver,DirectiveResolver _directiveResolver,PipeResolver _pipeResolver,SummaryResolver<Object> _summaryResolver,ElementSchemaRegistry _schemaRegistry,DirectiveNormalizer _directiveNormalizer,ReflectorReader /* optional */ _reflector,ErrorCollector /* optional */ _errorCollector) {}
     void clearCacheFor(Type<Object> type);
     void clearCache();
     CompileAnimationEntryMetadata getAnimationEntryMetadata(AnimationEntryMetadata entry);
     void _getAnimationStateMetadata();
     void _getAnimationStyleMetadata();
     void _getAnimationMetadata();
     void _loadSummary();
     void _loadDirectiveMetadata();
     /* TypeLiteral */ Object getNonNormalizedDirectiveMetadata(Object directiveType);
     CompileDirectiveMetadata getDirectiveMetadata(Object directiveType);
     CompileDirectiveSummary getDirectiveSummary(Object dirType);
     boolean isDirective(Object type);
     boolean isPipe(Object type);
     CompileNgModuleSummary getNgModuleSummary(Object moduleType);
     Promise<Object> loadNgModuleDirectiveAndPipeMetadata(Object moduleType,boolean isSync,boolean /* optional */ throwIfNotFound);
     CompileNgModuleMetadata getNgModuleMetadata(Object moduleType,boolean /* optional */ throwIfNotFound);
     void _getTypeDescriptor();
     void _addTypeToModule();
     void _getTransitiveNgModuleMetadata();
     void _getIdentifierMetadata();
     boolean isInjectable(Object type);
     CompileTypeSummary getInjectableSummary(Object type);
     void _getInjectableMetadata(UNKNOWN_TYPE_NAME_QuestionToken dependencies);
     void _getTypeMetadata(UNKNOWN_TYPE_NAME_QuestionToken dependencies);
     void _getFactoryMetadata(UNKNOWN_TYPE_NAME_QuestionToken dependencies);
     CompilePipeMetadata getPipeMetadata(Object pipeType);
     CompilePipeSummary getPipeSummary(Object pipeType);
     CompilePipeMetadata getOrLoadPipeMetadata(Object pipeType);
     void _loadPipeMetadata();
     void _getDependenciesMetadata();
     void _getTokenMetadata();
     void _getProvidersMetadata(UNKNOWN_TYPE_NAME_QuestionToken debugInfo,UNKNOWN_TYPE_NAME_QuestionToken compileProviders,UNKNOWN_TYPE_NAME_QuestionToken type);
     void _getEntryComponentsFromProvider(UNKNOWN_TYPE_NAME_QuestionToken type);
     CompileProviderMetadata getProviderMetadata(ProviderMeta provider);
     void _getQueriesMetadata();
     void _queryVarBindings();
     void _getQueryMetadata();
     void _reportError(UNKNOWN_TYPE_NAME_QuestionToken type,UNKNOWN_TYPE_NAME_QuestionToken otherType);
}
