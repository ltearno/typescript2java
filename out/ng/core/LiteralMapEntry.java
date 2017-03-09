package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralMapEntry
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class LiteralMapEntry  {
    public String key;
    public Expression value;
    public boolean quoted;
    @JsConstructor
    public LiteralMapEntry(String key,Expression value,boolean /* optional */ quoted) {}
}
