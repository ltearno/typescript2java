package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Comment
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Comment" )
public class CommentImpl extends Node {
    @JsProperty(name="value")
    String getValue();
    @JsProperty(name="value")
    void setValue(String value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public CommentImpl(String value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object context);
}
