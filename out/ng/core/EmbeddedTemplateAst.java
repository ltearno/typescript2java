package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name EmbeddedTemplateAst
  * A `<template>` element included in an Angular template.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class EmbeddedTemplateAst extends TemplateAst {
    public JsArray<AttrAst> attrs;
    public JsArray<BoundEventAst> outputs;
    public JsArray<ReferenceAst> references;
    public JsArray<VariableAst> variables;
    public JsArray<DirectiveAst> directives;
    public JsArray<ProviderAst> providers;
    public boolean hasViewContainer;
    public JsArray<TemplateAst> children;
    public int ngContentIndex;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public EmbeddedTemplateAst(JsArray<AttrAst> attrs,JsArray<BoundEventAst> outputs,JsArray<ReferenceAst> references,JsArray<VariableAst> variables,JsArray<DirectiveAst> directives,JsArray<ProviderAst> providers,boolean hasViewContainer,JsArray<TemplateAst> children,int ngContentIndex,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
