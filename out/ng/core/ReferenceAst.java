package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name ReferenceAst
  * A reference declaration on an element (e.g. `let someName="expression"`).
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ReferenceAst extends TemplateAst {
    public String name;
    public CompileTokenMetadata value;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public ReferenceAst(String name,CompileTokenMetadata value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
