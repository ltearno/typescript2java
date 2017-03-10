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
  * Name BoundElementPropertyAst
  * A binding for an element property (e.g. `[property]="expression"`) or an animation trigger (e.g.
  * `[@trigger]="stateExp"`)
  **/
@JsType( isNative=true, namespace="ng.core", name="BoundElementPropertyAst" )
public class BoundElementPropertyAstImpl extends TemplateAst {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="type")
    /* ng.core.PropertyBindingType */ int getType();
    @JsProperty(name="type")
    void setType(/* ng.core.PropertyBindingType */ int value);
    @JsProperty(name="securityContext")
    /* ng.core.SecurityContext */ int getSecurityContext();
    @JsProperty(name="securityContext")
    void setSecurityContext(/* ng.core.SecurityContext */ int value);
    @JsProperty(name="needsRuntimeSecurityContext")
    boolean getNeedsRuntimeSecurityContext();
    @JsProperty(name="needsRuntimeSecurityContext")
    void setNeedsRuntimeSecurityContext(boolean value);
    @JsProperty(name="value")
    AST getValue();
    @JsProperty(name="value")
    void setValue(AST value);
    @JsProperty(name="unit")
    String getUnit();
    @JsProperty(name="unit")
    void setUnit(String value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public BoundElementPropertyAstImpl(String name,/* ng.core.PropertyBindingType */ int type,/* ng.core.SecurityContext */ int securityContext,boolean needsRuntimeSecurityContext,AST value,String unit,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
    @JsProperty(name="isAnimation")
    boolean getIsAnimation();
    @JsProperty(name="isAnimation")
    void setIsAnimation(boolean value);
}
