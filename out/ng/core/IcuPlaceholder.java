package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name IcuPlaceholder
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class IcuPlaceholder extends Node {
    public Icu value;
    public String name;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public IcuPlaceholder(Icu value,String name,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object /* optional */ context);
}
