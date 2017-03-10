package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsProperty;
import ng.core.StylesCompileDependency;
import ng.core.CompileStylesheetMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\style_compiler.d.ts
  * Package ng.core
  * Name CompiledStylesheet
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompiledStylesheet" )
public class CompiledStylesheetImpl  {
    @JsProperty(name="statements")
    JsArray<Statement> getStatements();
    @JsProperty(name="statements")
    void setStatements(JsArray<Statement> value);
    @JsProperty(name="stylesVar")
    String getStylesVar();
    @JsProperty(name="stylesVar")
    void setStylesVar(String value);
    @JsProperty(name="dependencies")
    JsArray<StylesCompileDependency> getDependencies();
    @JsProperty(name="dependencies")
    void setDependencies(JsArray<StylesCompileDependency> value);
    @JsProperty(name="isShimmed")
    boolean getIsShimmed();
    @JsProperty(name="isShimmed")
    void setIsShimmed(boolean value);
    @JsProperty(name="meta")
    CompileStylesheetMetadata getMeta();
    @JsProperty(name="meta")
    void setMeta(CompileStylesheetMetadata value);
    @JsConstructor
    public CompiledStylesheetImpl(JsArray<Statement> statements,String stylesVar,JsArray<StylesCompileDependency> dependencies,boolean isShimmed,CompileStylesheetMetadata meta) {}
}
