package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\style_compiler.d.ts
  * Package ng.core
  * Name CompiledStylesheet
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompiledStylesheet  {
    public JsArray<Statement> statements;
    public String stylesVar;
    public JsArray<StylesCompileDependency> dependencies;
    public boolean isShimmed;
    public CompileStylesheetMetadata meta;
    @JsConstructor
    public CompiledStylesheet(JsArray<Statement> statements,String stylesVar,JsArray<StylesCompileDependency> dependencies,boolean isShimmed,CompileStylesheetMetadata meta) {}
}
