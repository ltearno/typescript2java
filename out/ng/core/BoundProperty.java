package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\binding_parser.d.ts
  * Package ng.core
  * Name BoundProperty
  * Represents a parsed property.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BoundProperty  {
    public String name;
    public ASTWithSource expression;
    public /* ng.core.BoundPropertyType */ int type;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public BoundProperty(String name,ASTWithSource expression,/* ng.core.BoundPropertyType */ int type,ParseSourceSpan sourceSpan) {}
    public boolean isLiteral;
    public boolean isAnimation;
}
