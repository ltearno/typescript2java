package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.UrlResolver;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveMetadata;
import ng.core.StylesCompileResult;

/**
  * Generated from tests\@angular\compiler\src\style_compiler.d.ts
  * Package ng.core
  * Name StyleCompiler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StyleCompiler  {
    @JsProperty(name="_urlResolver")
    Object get_urlResolver();
    @JsProperty(name="_urlResolver")
    void set_urlResolver(Object value);
    @JsProperty(name="_shadowCss")
    Object get_shadowCss();
    @JsProperty(name="_shadowCss")
    void set_shadowCss(Object value);
    @JsConstructor
    public StyleCompiler(UrlResolver _urlResolver) {}
     StylesCompileResult compileComponent(CompileDirectiveMetadata comp);
     void _compileStyles();
     void _shimIfNeeded();
}
