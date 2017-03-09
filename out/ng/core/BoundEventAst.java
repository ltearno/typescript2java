package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name BoundEventAst
  * A binding for an element event (e.g. `(event)="handler()"`) or an animation trigger event (e.g.
  * `(@trigger.phase)="callback($event)"`).
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BoundEventAst extends TemplateAst {
    public String name;
    public String target;
    public String phase;
    public AST handler;
    public ParseSourceSpan sourceSpan;
    public static native  String calcFullName(String name,String target,String phase);
    @JsConstructor
    public BoundEventAst(String name,String target,String phase,AST handler,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
    public String fullName;
    public boolean isAnimation;
}
