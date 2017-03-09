package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\style_compiler.d.ts
  * Package ng.core
  * Name StylesCompileResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StylesCompileResult  {
    public CompiledStylesheet componentStylesheet;
    public JsArray<CompiledStylesheet> externalStylesheets;
    @JsConstructor
    public StylesCompileResult(CompiledStylesheet componentStylesheet,JsArray<CompiledStylesheet> externalStylesheets) {}
}
