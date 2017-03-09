package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name TemplateAstVisitor
  * A visitor for {@link TemplateAst} trees that will process each node.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class TemplateAstVisitor  {
    public native  /* optional */ Object visit(TemplateAst ast,Object context);
    public native  Object visitNgContent(NgContentAst ast,Object context);
    public native  Object visitEmbeddedTemplate(EmbeddedTemplateAst ast,Object context);
    public native  Object visitElement(ElementAst ast,Object context);
    public native  Object visitReference(ReferenceAst ast,Object context);
    public native  Object visitVariable(VariableAst ast,Object context);
    public native  Object visitEvent(BoundEventAst ast,Object context);
    public native  Object visitElementProperty(BoundElementPropertyAst ast,Object context);
    public native  Object visitAttr(AttrAst ast,Object context);
    public native  Object visitBoundText(BoundTextAst ast,Object context);
    public native  Object visitText(TextAst ast,Object context);
    public native  Object visitDirective(DirectiveAst ast,Object context);
    public native  Object visitDirectiveProperty(BoundDirectivePropertyAst ast,Object context);
}
