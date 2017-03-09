package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name DirectiveAst
  * A directive declared on an element.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DirectiveAst extends TemplateAst {
    public CompileDirectiveSummary directive;
    public JsArray<BoundDirectivePropertyAst> inputs;
    public JsArray<BoundElementPropertyAst> hostProperties;
    public JsArray<BoundEventAst> hostEvents;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public DirectiveAst(CompileDirectiveSummary directive,JsArray<BoundDirectivePropertyAst> inputs,JsArray<BoundElementPropertyAst> hostProperties,JsArray<BoundEventAst> hostEvents,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
