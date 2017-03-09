package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\aot\compiler.d.ts
  * Package ng.core
  * Name AotCompiler
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AotCompiler  {
    public Object _host;
    public Object _metadataResolver;
    public Object _templateParser;
    public Object _styleCompiler;
    public Object _viewCompiler;
    public Object _dirWrapperCompiler;
    public Object _ngModuleCompiler;
    public Object _outputEmitter;
    public Object _summaryResolver;
    public Object _localeId;
    public Object _translationFormat;
    public Object _animationParser;
    public Object _symbolResolver;
    public Object _animationCompiler;
    @JsConstructor
    public AotCompiler(AotCompilerHost _host,CompileMetadataResolver _metadataResolver,TemplateParser _templateParser,StyleCompiler _styleCompiler,ViewCompiler _viewCompiler,DirectiveWrapperCompiler _dirWrapperCompiler,NgModuleCompiler _ngModuleCompiler,OutputEmitter _outputEmitter,SummaryResolver<StaticSymbol> _summaryResolver,String _localeId,String _translationFormat,AnimationParser _animationParser,StaticSymbolResolver _symbolResolver) {}
    public native  void clearCache();
    public native  Promise<JsArray<GeneratedFile>> compileAll(JsArray<String> rootFiles);
    public native  void _compileSrcFile();
    public native  void _createSummary();
    public native  void _compileModule();
    public native  void _compileDirectiveWrapper();
    public native  void _compileComponentFactory();
    public native  void _compileComponent();
    public native  void _codgenStyles();
    public native  void _codegenSourceModule();
}
