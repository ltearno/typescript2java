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
  * Name BoundEventAst
  * A binding for an element event (e.g. `(event)="handler()"`) or an animation trigger event (e.g.
  * `(@trigger.phase)="callback($event)"`).
  **/
@JsType( isNative=true, namespace="ng.core", name="BoundEventAst" )
public class BoundEventAstImpl extends TemplateAst {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="target")
    String getTarget();
    @JsProperty(name="target")
    void setTarget(String value);
    @JsProperty(name="phase")
    String getPhase();
    @JsProperty(name="phase")
    void setPhase(String value);
    @JsProperty(name="handler")
    AST getHandler();
    @JsProperty(name="handler")
    void setHandler(AST value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    public static native  String calcFullName(String name,String target,String phase);
    @JsConstructor
    public BoundEventAstImpl(String name,String target,String phase,AST handler,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
    @JsProperty(name="fullName")
    String getFullName();
    @JsProperty(name="fullName")
    void setFullName(String value);
    @JsProperty(name="isAnimation")
    boolean getIsAnimation();
    @JsProperty(name="isAnimation")
    void setIsAnimation(boolean value);
}
