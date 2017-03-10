package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileIdentifierMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\deps.d.ts
  * Package ng.core
  * Name DirectiveWrapperDependency
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DirectiveWrapperDependency  {
    @JsProperty(name="dir")
    CompileIdentifierMetadata getDir();
    @JsProperty(name="dir")
    void setDir(CompileIdentifierMetadata value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="placeholder")
    CompileIdentifierMetadata getPlaceholder();
    @JsProperty(name="placeholder")
    void setPlaceholder(CompileIdentifierMetadata value);
    @JsConstructor
    public DirectiveWrapperDependency(CompileIdentifierMetadata dir,String name,CompileIdentifierMetadata placeholder) {}
}
