package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileIdentifierMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\style_compiler.d.ts
  * Package ng.core
  * Name StylesCompileDependency
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="StylesCompileDependency" )
public class StylesCompileDependencyImpl  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="moduleUrl")
    String getModuleUrl();
    @JsProperty(name="moduleUrl")
    void setModuleUrl(String value);
    @JsProperty(name="isShimmed")
    boolean getIsShimmed();
    @JsProperty(name="isShimmed")
    void setIsShimmed(boolean value);
    @JsProperty(name="valuePlaceholder")
    CompileIdentifierMetadata getValuePlaceholder();
    @JsProperty(name="valuePlaceholder")
    void setValuePlaceholder(CompileIdentifierMetadata value);
    @JsConstructor
    public StylesCompileDependencyImpl(String name,String moduleUrl,boolean isShimmed,CompileIdentifierMetadata valuePlaceholder) {}
}
