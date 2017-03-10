package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Placeholder
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Placeholder" )
public class PlaceholderImpl extends Node {
    @JsProperty(name="value")
    String getValue();
    @JsProperty(name="value")
    void setValue(String value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public PlaceholderImpl(String value,String name,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object /* optional */ context);
}
