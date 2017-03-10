package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralMapEntry
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="LiteralMapEntry" )
public class LiteralMapEntryImpl  {
    @JsProperty(name="key")
    String getKey();
    @JsProperty(name="key")
    void setKey(String value);
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsProperty(name="quoted")
    boolean getQuoted();
    @JsProperty(name="quoted")
    void setQuoted(boolean value);
    @JsConstructor
    public LiteralMapEntryImpl(String key,Expression value,boolean /* optional */ quoted) {}
}
