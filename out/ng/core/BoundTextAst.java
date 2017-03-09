package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name BoundTextAst
  * A bound expression within the text of a template.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BoundTextAst extends TemplateAst {
    public AST value;
    public int ngContentIndex;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public BoundTextAst(AST value,int ngContentIndex,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
