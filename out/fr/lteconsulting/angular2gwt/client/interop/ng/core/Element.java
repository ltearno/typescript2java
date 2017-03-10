package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Attribute;
import ng.core.Node;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\ast.d.ts
  * Package ng.core
  * Name Element
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Element extends Node {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="attrs")
    JsArray<Attribute> getAttrs();
    @JsProperty(name="attrs")
    void setAttrs(JsArray<Attribute> value);
    @JsProperty(name="children")
    JsArray<Node> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<Node> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsProperty(name="startSourceSpan")
    ParseSourceSpan getStartSourceSpan();
    @JsProperty(name="startSourceSpan")
    void setStartSourceSpan(ParseSourceSpan value);
    @JsProperty(name="endSourceSpan")
    ParseSourceSpan getEndSourceSpan();
    @JsProperty(name="endSourceSpan")
    void setEndSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public Element(String name,JsArray<Attribute> attrs,JsArray<Node> children,ParseSourceSpan sourceSpan,ParseSourceSpan startSourceSpan,ParseSourceSpan endSourceSpan) {}
     Object visit(Visitor visitor,Object context);
}
