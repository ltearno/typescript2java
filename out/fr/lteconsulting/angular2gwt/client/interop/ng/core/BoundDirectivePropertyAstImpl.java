package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AST;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name BoundDirectivePropertyAst
  * A directive property with a bound value (e.g. `*ngIf="condition").
  **/
@JsType( isNative=true, namespace="ng.core", name="BoundDirectivePropertyAst" )
public class BoundDirectivePropertyAstImpl extends TemplateAst {
    @JsProperty(name="directiveName")
    String getDirectiveName();
    @JsProperty(name="directiveName")
    void setDirectiveName(String value);
    @JsProperty(name="templateName")
    String getTemplateName();
    @JsProperty(name="templateName")
    void setTemplateName(String value);
    @JsProperty(name="value")
    AST getValue();
    @JsProperty(name="value")
    void setValue(AST value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public BoundDirectivePropertyAstImpl(String directiveName,String templateName,AST value,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
