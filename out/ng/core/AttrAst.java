package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name AttrAst
  * A plain attribute on an element.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AttrAst extends TemplateAst {
    public String name;
    public String value;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public AttrAst(String name,String value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
