package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ASTWithSource;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\binding_parser.d.ts
  * Package ng.core
  * Name BoundProperty
  * Represents a parsed property.
  **/
@JsType( isNative=true, namespace="ng.core", name="BoundProperty" )
public class BoundPropertyImpl  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="expression")
    ASTWithSource getExpression();
    @JsProperty(name="expression")
    void setExpression(ASTWithSource value);
    @JsProperty(name="type")
    /* ng.core.BoundPropertyType */ int getType();
    @JsProperty(name="type")
    void setType(/* ng.core.BoundPropertyType */ int value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public BoundPropertyImpl(String name,ASTWithSource expression,/* ng.core.BoundPropertyType */ int type,ParseSourceSpan sourceSpan) {}
    @JsProperty(name="isLiteral")
    boolean getIsLiteral();
    @JsProperty(name="isLiteral")
    void setIsLiteral(boolean value);
    @JsProperty(name="isAnimation")
    boolean getIsAnimation();
    @JsProperty(name="isAnimation")
    void setIsAnimation(boolean value);
}
