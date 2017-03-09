package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name TemplateBinding
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TemplateBinding  {
    public ParseSpan span;
    public String key;
    public boolean keyIsVar;
    public String name;
    public ASTWithSource expression;
    @JsConstructor
    public TemplateBinding(ParseSpan span,String key,boolean keyIsVar,String name,ASTWithSource expression) {}
}
