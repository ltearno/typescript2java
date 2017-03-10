package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompiledStylesheet;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\style_compiler.d.ts
  * Package ng.core
  * Name StylesCompileResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="StylesCompileResult" )
public class StylesCompileResultImpl  {
    @JsProperty(name="componentStylesheet")
    CompiledStylesheet getComponentStylesheet();
    @JsProperty(name="componentStylesheet")
    void setComponentStylesheet(CompiledStylesheet value);
    @JsProperty(name="externalStylesheets")
    JsArray<CompiledStylesheet> getExternalStylesheets();
    @JsProperty(name="externalStylesheets")
    void setExternalStylesheets(JsArray<CompiledStylesheet> value);
    @JsConstructor
    public StylesCompileResultImpl(CompiledStylesheet componentStylesheet,JsArray<CompiledStylesheet> externalStylesheets) {}
}
