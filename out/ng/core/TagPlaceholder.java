package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name TagPlaceholder
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TagPlaceholder extends Node {
    public String tag;
    public JsTypedObject<String,String> attrs;
    public String startName;
    public String closeName;
    public JsArray<Node> children;
    public boolean isVoid;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public TagPlaceholder(String tag,JsTypedObject<String,String> attrs,String startName,String closeName,JsArray<Node> children,boolean isVoid,ParseSourceSpan sourceSpan) {}
    public native  Object visit(Visitor visitor,Object /* optional */ context);
}
