package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name NgContentAst
  * Position where content is to be projected (instance of `<ng-content>` in a template).
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgContentAst extends TemplateAst {
    public int index;
    public int ngContentIndex;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public NgContentAst(int index,int ngContentIndex,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
