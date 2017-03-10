package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Container
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Container extends Node {
    @JsProperty(name="children")
    JsArray<Node> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<Node> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public Container(JsArray<Node> children,ParseSourceSpan sourceSpan) {}
     Object visit(Visitor visitor,Object /* optional */ context);
}
