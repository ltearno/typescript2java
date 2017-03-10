package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSpan;
import jsinterop.annotations.JsProperty;
import ng.core.ASTWithSource;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name TemplateBinding
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="TemplateBinding" )
public class TemplateBindingImpl  {
    @JsProperty(name="span")
    ParseSpan getSpan();
    @JsProperty(name="span")
    void setSpan(ParseSpan value);
    @JsProperty(name="key")
    String getKey();
    @JsProperty(name="key")
    void setKey(String value);
    @JsProperty(name="keyIsVar")
    boolean getKeyIsVar();
    @JsProperty(name="keyIsVar")
    void setKeyIsVar(boolean value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="expression")
    ASTWithSource getExpression();
    @JsProperty(name="expression")
    void setExpression(ASTWithSource value);
    @JsConstructor
    public TemplateBindingImpl(ParseSpan span,String key,boolean keyIsVar,String name,ASTWithSource expression) {}
}
