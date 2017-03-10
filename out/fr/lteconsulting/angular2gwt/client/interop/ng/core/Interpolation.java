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
  * Name Interpolation
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Interpolation extends AST {
    @JsProperty(name="strings")
    JsArray<Object> getStrings();
    @JsProperty(name="strings")
    void setStrings(JsArray<Object> value);
    @JsProperty(name="expressions")
    JsArray<Object> getExpressions();
    @JsProperty(name="expressions")
    void setExpressions(JsArray<Object> value);
    @JsConstructor
    public Interpolation(ParseSpan span,JsArray<Object> strings,JsArray<Object> expressions) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
}
