package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name TextAst
  * A segment of text within the template.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TextAst extends TemplateAst {
    public String value;
    public int ngContentIndex;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public TextAst(String value,int ngContentIndex,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
