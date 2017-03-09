package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Element
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Element extends Node {
    public String name;
    public JsArray<Attribute> attrs;
    public JsArray<Node> children;
    public ParseSourceSpan sourceSpan;
    public ParseSourceSpan startSourceSpan;
    public ParseSourceSpan endSourceSpan;
    @JsConstructor
    public Element(String name,JsArray<Attribute> attrs,JsArray<Node> children,ParseSourceSpan sourceSpan,ParseSourceSpan startSourceSpan,ParseSourceSpan endSourceSpan) {}
    public native  Object visit(Visitor visitor,Object context);
}
