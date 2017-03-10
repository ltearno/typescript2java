package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name NgContentAst
  * Position where content is to be projected (instance of `<ng-content>` in a template).
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgContentAst extends TemplateAst {
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsProperty(name="ngContentIndex")
    int getNgContentIndex();
    @JsProperty(name="ngContentIndex")
    void setNgContentIndex(int value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public NgContentAst(int index,int ngContentIndex,ParseSourceSpan sourceSpan) {}
     Object visit(TemplateAstVisitor visitor,Object context);
}
