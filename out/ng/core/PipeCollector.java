package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\compiler\src\template_parser\binding_parser.d.ts
  * Package ng.core
  * Name PipeCollector
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class PipeCollector extends RecursiveAstVisitor {
    public Map<String,BindingPipe> pipes;
    public native  Object visitPipe(BindingPipe ast,Object context);
}
