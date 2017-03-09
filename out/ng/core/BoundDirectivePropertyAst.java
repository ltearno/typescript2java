package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name BoundDirectivePropertyAst
  * A directive property with a bound value (e.g. `*ngIf="condition").
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BoundDirectivePropertyAst extends TemplateAst {
    public String directiveName;
    public String templateName;
    public AST value;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public BoundDirectivePropertyAst(String directiveName,String templateName,AST value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
