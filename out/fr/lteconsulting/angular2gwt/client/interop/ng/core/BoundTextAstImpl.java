package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.AST;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name BoundTextAst
  * A bound expression within the text of a template.
  **/
@JsType( isNative=true, namespace="ng.core", name="BoundTextAst" )
public class BoundTextAstImpl extends TemplateAst {
    @JsProperty(name="value")
    AST getValue();
    @JsProperty(name="value")
    void setValue(AST value);
    @JsProperty(name="ngContentIndex")
    int getNgContentIndex();
    @JsProperty(name="ngContentIndex")
    void setNgContentIndex(int value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public BoundTextAstImpl(AST value,int ngContentIndex,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
