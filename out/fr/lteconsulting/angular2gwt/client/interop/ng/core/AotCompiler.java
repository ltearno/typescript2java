package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AotCompilerHost;
import ng.core.CompileMetadataResolver;
import ng.core.TemplateParser;
import ng.core.StyleCompiler;
import ng.core.ViewCompiler;
import ng.core.DirectiveWrapperCompiler;
import ng.core.NgModuleCompiler;
import ng.core.OutputEmitter;
import ng.core.SummaryResolver;
import ng.core.StaticSymbol;
import ng.core.AnimationParser;
import ng.core.StaticSymbolResolver;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.GeneratedFile;

/**
  * Generated from tests\@angular\compiler\src\aot\compiler.d.ts
  * Package ng.core
  * Name AotCompiler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AotCompiler  {
    @JsProperty(name="_host")
    Object get_host();
    @JsProperty(name="_host")
    void set_host(Object value);
    @JsProperty(name="_metadataResolver")
    Object get_metadataResolver();
    @JsProperty(name="_metadataResolver")
    void set_metadataResolver(Object value);
    @JsProperty(name="_templateParser")
    Object get_templateParser();
    @JsProperty(name="_templateParser")
    void set_templateParser(Object value);
    @JsProperty(name="_styleCompiler")
    Object get_styleCompiler();
    @JsProperty(name="_styleCompiler")
    void set_styleCompiler(Object value);
    @JsProperty(name="_viewCompiler")
    Object get_viewCompiler();
    @JsProperty(name="_viewCompiler")
    void set_viewCompiler(Object value);
    @JsProperty(name="_dirWrapperCompiler")
    Object get_dirWrapperCompiler();
    @JsProperty(name="_dirWrapperCompiler")
    void set_dirWrapperCompiler(Object value);
    @JsProperty(name="_ngModuleCompiler")
    Object get_ngModuleCompiler();
    @JsProperty(name="_ngModuleCompiler")
    void set_ngModuleCompiler(Object value);
    @JsProperty(name="_outputEmitter")
    Object get_outputEmitter();
    @JsProperty(name="_outputEmitter")
    void set_outputEmitter(Object value);
    @JsProperty(name="_summaryResolver")
    Object get_summaryResolver();
    @JsProperty(name="_summaryResolver")
    void set_summaryResolver(Object value);
    @JsProperty(name="_localeId")
    Object get_localeId();
    @JsProperty(name="_localeId")
    void set_localeId(Object value);
    @JsProperty(name="_translationFormat")
    Object get_translationFormat();
    @JsProperty(name="_translationFormat")
    void set_translationFormat(Object value);
    @JsProperty(name="_animationParser")
    Object get_animationParser();
    @JsProperty(name="_animationParser")
    void set_animationParser(Object value);
    @JsProperty(name="_symbolResolver")
    Object get_symbolResolver();
    @JsProperty(name="_symbolResolver")
    void set_symbolResolver(Object value);
    @JsProperty(name="_animationCompiler")
    Object get_animationCompiler();
    @JsProperty(name="_animationCompiler")
    void set_animationCompiler(Object value);
    @JsConstructor
    public AotCompiler(AotCompilerHost _host,CompileMetadataResolver _metadataResolver,TemplateParser _templateParser,StyleCompiler _styleCompiler,ViewCompiler _viewCompiler,DirectiveWrapperCompiler _dirWrapperCompiler,NgModuleCompiler _ngModuleCompiler,OutputEmitter _outputEmitter,SummaryResolver<StaticSymbol> _summaryResolver,String _localeId,String _translationFormat,AnimationParser _animationParser,StaticSymbolResolver _symbolResolver) {}
     void clearCache();
     Promise<JsArray<GeneratedFile>> compileAll(JsArray<String> rootFiles);
     void _compileSrcFile();
     void _createSummary();
     void _compileModule();
     void _compileDirectiveWrapper();
     void _compileComponentFactory();
     void _compileComponent();
     void _codgenStyles();
     void _codegenSourceModule();
}
