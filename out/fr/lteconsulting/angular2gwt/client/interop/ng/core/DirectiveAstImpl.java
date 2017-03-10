package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileDirectiveSummary;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.BoundDirectivePropertyAst;
import ng.core.BoundElementPropertyAst;
import ng.core.BoundEventAst;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name DirectiveAst
  * A directive declared on an element.
  **/
@JsType( isNative=true, namespace="ng.core", name="DirectiveAst" )
public class DirectiveAstImpl extends TemplateAst {
    @JsProperty(name="directive")
    CompileDirectiveSummary getDirective();
    @JsProperty(name="directive")
    void setDirective(CompileDirectiveSummary value);
    @JsProperty(name="inputs")
    JsArray<BoundDirectivePropertyAst> getInputs();
    @JsProperty(name="inputs")
    void setInputs(JsArray<BoundDirectivePropertyAst> value);
    @JsProperty(name="hostProperties")
    JsArray<BoundElementPropertyAst> getHostProperties();
    @JsProperty(name="hostProperties")
    void setHostProperties(JsArray<BoundElementPropertyAst> value);
    @JsProperty(name="hostEvents")
    JsArray<BoundEventAst> getHostEvents();
    @JsProperty(name="hostEvents")
    void setHostEvents(JsArray<BoundEventAst> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public DirectiveAstImpl(CompileDirectiveSummary directive,JsArray<BoundDirectivePropertyAst> inputs,JsArray<BoundElementPropertyAst> hostProperties,JsArray<BoundEventAst> hostEvents,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
