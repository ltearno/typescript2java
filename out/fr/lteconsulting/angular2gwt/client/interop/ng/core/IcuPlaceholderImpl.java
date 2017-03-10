package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Icu;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name IcuPlaceholder
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="IcuPlaceholder" )
public class IcuPlaceholderImpl extends Node {
    @JsProperty(name="value")
    Icu getValue();
    @JsProperty(name="value")
    void setValue(Icu value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public IcuPlaceholderImpl(Icu value,String name,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object /* optional */ context);
}
