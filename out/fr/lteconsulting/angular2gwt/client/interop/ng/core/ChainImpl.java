package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name Chain
  * Multiple expressions separated by a semicolon.
  **/
@JsType( isNative=true, namespace="ng.core", name="Chain" )
public class ChainImpl extends AST {
    @JsProperty(name="expressions")
    JsArray<Object> getExpressions();
    @JsProperty(name="expressions")
    void setExpressions(JsArray<Object> value);
    @JsConstructor
    public ChainImpl(ParseSpan span,JsArray<Object> expressions) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
