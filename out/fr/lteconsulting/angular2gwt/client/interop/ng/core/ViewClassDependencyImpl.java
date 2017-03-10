package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileIdentifierMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\deps.d.ts
  * Package ng.core
  * Name ViewClassDependency
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewClassDependency" )
public class ViewClassDependencyImpl  {
    @JsProperty(name="comp")
    CompileIdentifierMetadata getComp();
    @JsProperty(name="comp")
    void setComp(CompileIdentifierMetadata value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="placeholder")
    CompileIdentifierMetadata getPlaceholder();
    @JsProperty(name="placeholder")
    void setPlaceholder(CompileIdentifierMetadata value);
    @JsConstructor
    public ViewClassDependencyImpl(CompileIdentifierMetadata comp,String name,CompileIdentifierMetadata placeholder) {}
}
