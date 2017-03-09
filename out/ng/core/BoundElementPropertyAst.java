package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name BoundElementPropertyAst
  * A binding for an element property (e.g. `[property]="expression"`) or an animation trigger (e.g.
  * `[@trigger]="stateExp"`)
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BoundElementPropertyAst extends TemplateAst {
    public String name;
    public /* ng.core.PropertyBindingType */ int type;
    public /* ng.core.SecurityContext */ int securityContext;
    public boolean needsRuntimeSecurityContext;
    public AST value;
    public String unit;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public BoundElementPropertyAst(String name,/* ng.core.PropertyBindingType */ int type,/* ng.core.SecurityContext */ int securityContext,boolean needsRuntimeSecurityContext,AST value,String unit,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
    public boolean isAnimation;
}
