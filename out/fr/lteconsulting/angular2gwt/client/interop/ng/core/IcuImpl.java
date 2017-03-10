package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.Node;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Icu
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Icu" )
public class IcuImpl extends Node {
    @JsProperty(name="expression")
    String getExpression();
    @JsProperty(name="expression")
    void setExpression(String value);
    @JsProperty(name="type")
    String getType();
    @JsProperty(name="type")
    void setType(String value);
    @JsProperty(name="cases")
    JsTypedObject<String,Node> getCases();
    @JsProperty(name="cases")
    void setCases(JsTypedObject<String,Node> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsProperty(name="expressionPlaceholder")
    String getExpressionPlaceholder();
    @JsProperty(name="expressionPlaceholder")
    void setExpressionPlaceholder(String value);
    @JsConstructor
    public IcuImpl(String expression,String type,JsTypedObject<String,Node> cases,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object /* optional */ context);
}
