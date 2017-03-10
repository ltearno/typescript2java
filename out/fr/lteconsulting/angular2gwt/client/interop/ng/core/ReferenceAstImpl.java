package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileTokenMetadata;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name ReferenceAst
  * A reference declaration on an element (e.g. `let someName="expression"`).
  **/
@JsType( isNative=true, namespace="ng.core", name="ReferenceAst" )
public class ReferenceAstImpl extends TemplateAst {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="value")
    CompileTokenMetadata getValue();
    @JsProperty(name="value")
    void setValue(CompileTokenMetadata value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public ReferenceAstImpl(String name,CompileTokenMetadata value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
