package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ExpansionCase;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Expansion
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Expansion extends Node {
    @JsProperty(name="switchValue")
    String getSwitchValue();
    @JsProperty(name="switchValue")
    void setSwitchValue(String value);
    @JsProperty(name="type")
    String getType();
    @JsProperty(name="type")
    void setType(String value);
    @JsProperty(name="cases")
    JsArray<ExpansionCase> getCases();
    @JsProperty(name="cases")
    void setCases(JsArray<ExpansionCase> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsProperty(name="switchValueSourceSpan")
    ParseSourceSpan getSwitchValueSourceSpan();
    @JsProperty(name="switchValueSourceSpan")
    void setSwitchValueSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public Expansion(String switchValue,String type,JsArray<ExpansionCase> cases,ParseSourceSpan sourceSpan,ParseSourceSpan switchValueSourceSpan) {}
     Object visit(Visitor visitor,Object context);
}
