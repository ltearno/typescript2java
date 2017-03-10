package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AttrAst;
import ng.core.BoundElementPropertyAst;
import ng.core.BoundEventAst;
import ng.core.ReferenceAst;
import ng.core.DirectiveAst;
import ng.core.ProviderAst;
import ng.core.TemplateAst;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name ElementAst
  * An element declaration in a template.
  **/
@JsType( isNative=true, namespace="ng.core", name="ElementAst" )
public class ElementAstImpl extends TemplateAst {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="attrs")
    JsArray<AttrAst> getAttrs();
    @JsProperty(name="attrs")
    void setAttrs(JsArray<AttrAst> value);
    @JsProperty(name="inputs")
    JsArray<BoundElementPropertyAst> getInputs();
    @JsProperty(name="inputs")
    void setInputs(JsArray<BoundElementPropertyAst> value);
    @JsProperty(name="outputs")
    JsArray<BoundEventAst> getOutputs();
    @JsProperty(name="outputs")
    void setOutputs(JsArray<BoundEventAst> value);
    @JsProperty(name="references")
    JsArray<ReferenceAst> getReferences();
    @JsProperty(name="references")
    void setReferences(JsArray<ReferenceAst> value);
    @JsProperty(name="directives")
    JsArray<DirectiveAst> getDirectives();
    @JsProperty(name="directives")
    void setDirectives(JsArray<DirectiveAst> value);
    @JsProperty(name="providers")
    JsArray<ProviderAst> getProviders();
    @JsProperty(name="providers")
    void setProviders(JsArray<ProviderAst> value);
    @JsProperty(name="hasViewContainer")
    boolean getHasViewContainer();
    @JsProperty(name="hasViewContainer")
    void setHasViewContainer(boolean value);
    @JsProperty(name="children")
    JsArray<TemplateAst> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<TemplateAst> value);
    @JsProperty(name="ngContentIndex")
    int getNgContentIndex();
    @JsProperty(name="ngContentIndex")
    void setNgContentIndex(int value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsProperty(name="endSourceSpan")
    ParseSourceSpan getEndSourceSpan();
    @JsProperty(name="endSourceSpan")
    void setEndSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public ElementAstImpl(String name,JsArray<AttrAst> attrs,JsArray<BoundElementPropertyAst> inputs,JsArray<BoundEventAst> outputs,JsArray<ReferenceAst> references,JsArray<DirectiveAst> directives,JsArray<ProviderAst> providers,boolean hasViewContainer,JsArray<TemplateAst> children,int ngContentIndex,ParseSourceSpan sourceSpan,ParseSourceSpan endSourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
