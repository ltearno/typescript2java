package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.TemplateAst;
import ng.core.NgContentAst;
import ng.core.EmbeddedTemplateAst;
import ng.core.ElementAst;
import ng.core.ReferenceAst;
import ng.core.VariableAst;
import ng.core.BoundEventAst;
import ng.core.BoundElementPropertyAst;
import ng.core.AttrAst;
import ng.core.BoundTextAst;
import ng.core.TextAst;
import ng.core.DirectiveAst;
import ng.core.BoundDirectivePropertyAst;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name TemplateAstVisitor
  * A visitor for {@link TemplateAst} trees that will process each node.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TemplateAstVisitor  {
     /* optional */ Object visit(TemplateAst ast,Object context);
     Object visitNgContent(NgContentAst ast,Object context);
     Object visitEmbeddedTemplate(EmbeddedTemplateAst ast,Object context);
     Object visitElement(ElementAst ast,Object context);
     Object visitReference(ReferenceAst ast,Object context);
     Object visitVariable(VariableAst ast,Object context);
     Object visitEvent(BoundEventAst ast,Object context);
     Object visitElementProperty(BoundElementPropertyAst ast,Object context);
     Object visitAttr(AttrAst ast,Object context);
     Object visitBoundText(BoundTextAst ast,Object context);
     Object visitText(TextAst ast,Object context);
     Object visitDirective(DirectiveAst ast,Object context);
     Object visitDirectiveProperty(BoundDirectivePropertyAst ast,Object context);
}
