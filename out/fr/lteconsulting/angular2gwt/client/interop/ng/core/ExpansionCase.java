package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name ExpansionCase
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpansionCase extends Node {
    @JsProperty(name="value")
    String getValue();
    @JsProperty(name="value")
    void setValue(String value);
    @JsProperty(name="expression")
    JsArray<Node> getExpression();
    @JsProperty(name="expression")
    void setExpression(JsArray<Node> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsProperty(name="valueSourceSpan")
    ParseSourceSpan getValueSourceSpan();
    @JsProperty(name="valueSourceSpan")
    void setValueSourceSpan(ParseSourceSpan value);
    @JsProperty(name="expSourceSpan")
    ParseSourceSpan getExpSourceSpan();
    @JsProperty(name="expSourceSpan")
    void setExpSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public ExpansionCase(String value,JsArray<Node> expression,ParseSourceSpan sourceSpan,ParseSourceSpan valueSourceSpan,ParseSourceSpan expSourceSpan) {}
     Object visit(Visitor visitor,Object context);
}
