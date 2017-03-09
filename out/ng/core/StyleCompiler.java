package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\style_compiler.d.ts
  * Package ng.core
  * Name StyleCompiler
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StyleCompiler  {
    public Object _urlResolver;
    public Object _shadowCss;
    @JsConstructor
    public StyleCompiler(UrlResolver _urlResolver) {}
    public native  StylesCompileResult compileComponent(CompileDirectiveMetadata comp);
    public native  void _compileStyles();
    public native  void _shimIfNeeded();
}
