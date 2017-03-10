package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.BindingPipe;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\template_parser\binding_parser.d.ts
  * Package ng.core
  * Name PipeCollector
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PipeCollector extends RecursiveAstVisitor {
    @JsProperty(name="pipes")
    Map<String,BindingPipe> getPipes();
    @JsProperty(name="pipes")
    void setPipes(Map<String,BindingPipe> value);
     Object visitPipe(BindingPipe ast,Object context);
}
