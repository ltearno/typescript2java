package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Container
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Container extends Node {
    public JsArray<Node> children;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public Container(JsArray<Node> children,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object /* optional */ context);
}
