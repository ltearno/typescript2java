package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsProperty;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name TemplateAst
  * An Abstract Syntax Tree node representing part of a parsed Angular template.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TemplateAst  {
    @JsProperty(name="sourceSpan")
    ParseSourceSpan sourceSpan();
    @JsProperty(name="sourceSpan")
    void sourceSpan(ParseSourceSpan value);
     Object visit(TemplateAstVisitor visitor,Object context);
}
