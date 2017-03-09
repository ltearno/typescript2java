package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name Quote
  * Represents a quoted expression of the form:
  * 
  * quote = prefix `:` uninterpretedExpression
  * prefix = identifier
  * uninterpretedExpression = arbitrary string
  * 
  * A quoted expression is meant to be pre-processed by an AST transformer that
  * converts it into another AST that no longer contains quoted expressions.
  * It is meant to allow third-party developers to extend Angular template
  * expression language. The `uninterpretedExpression` part of the quote is
  * therefore not interpreted by the Angular's own expression parser.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Quote extends AST {
    public String prefix;
    public String uninterpretedExpression;
    public Object location;
    @JsConstructor
    public Quote(ParseSpan span,String prefix,String uninterpretedExpression,Object location) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
    public native  String toString();
}
