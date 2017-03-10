package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.AST;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ParserError;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name ASTWithSource
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ASTWithSource" )
public class ASTWithSourceImpl extends AST {
    @JsProperty(name="ast")
    AST getAst();
    @JsProperty(name="ast")
    void setAst(AST value);
    @JsProperty(name="source")
    String getSource();
    @JsProperty(name="source")
    void setSource(String value);
    @JsProperty(name="location")
    String getLocation();
    @JsProperty(name="location")
    void setLocation(String value);
    @JsProperty(name="errors")
    JsArray<ParserError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<ParserError> value);
    @JsConstructor
    public ASTWithSourceImpl(AST ast,String source,String location,JsArray<ParserError> errors) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
    public native  String toString();
}
