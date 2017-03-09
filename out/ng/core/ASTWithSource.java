package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name ASTWithSource
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ASTWithSource extends AST {
    public AST ast;
    public String source;
    public String location;
    public JsArray<ParserError> errors;
    @JsConstructor
    public ASTWithSource(AST ast,String source,String location,JsArray<ParserError> errors) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
    public native  String toString();
}
