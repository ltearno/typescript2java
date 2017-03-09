package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name VariableAst
  * A variable declaration on a <template> (e.g. `var-someName="someLocalName"`).
  **/
@JsType( isNative=true, namespace="ng.core" )
public class VariableAst extends TemplateAst {
    public String name;
    public String value;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public VariableAst(String name,String value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
