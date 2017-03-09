package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name TemplateAst
  * An Abstract Syntax Tree node representing part of a parsed Angular template.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class TemplateAst  {
    public ParseSourceSpan sourceSpan;
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
