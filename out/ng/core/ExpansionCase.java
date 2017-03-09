package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name ExpansionCase
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ExpansionCase extends Node {
    public String value;
    public JsArray<Node> expression;
    public ParseSourceSpan sourceSpan;
    public ParseSourceSpan valueSourceSpan;
    public ParseSourceSpan expSourceSpan;
    @JsConstructor
    public ExpansionCase(String value,JsArray<Node> expression,ParseSourceSpan sourceSpan,ParseSourceSpan valueSourceSpan,ParseSourceSpan expSourceSpan) {}
    public native  Object visit(Visitor visitor,Object context);
}
