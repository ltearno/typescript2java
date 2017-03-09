package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Icu
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Icu extends Node {
    public String expression;
    public String type;
    public JsTypedObject<String,Node> cases;
    public ParseSourceSpan sourceSpan;
    public String expressionPlaceholder;
    @JsConstructor
    public Icu(String expression,String type,JsTypedObject<String,Node> cases,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object /* optional */ context);
}
