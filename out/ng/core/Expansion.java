package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Expansion
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Expansion extends Node {
    public String switchValue;
    public String type;
    public JsArray<ExpansionCase> cases;
    public ParseSourceSpan sourceSpan;
    public ParseSourceSpan switchValueSourceSpan;
    @JsConstructor
    public Expansion(String switchValue,String type,JsArray<ExpansionCase> cases,ParseSourceSpan sourceSpan,ParseSourceSpan switchValueSourceSpan) {}
    public native  Object visit(Visitor visitor,Object context);
}
