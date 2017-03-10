package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.Visitor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name TagPlaceholder
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TagPlaceholder extends Node {
    @JsProperty(name="tag")
    String getTag();
    @JsProperty(name="tag")
    void setTag(String value);
    @JsProperty(name="attrs")
    JsTypedObject<String,String> getAttrs();
    @JsProperty(name="attrs")
    void setAttrs(JsTypedObject<String,String> value);
    @JsProperty(name="startName")
    String getStartName();
    @JsProperty(name="startName")
    void setStartName(String value);
    @JsProperty(name="closeName")
    String getCloseName();
    @JsProperty(name="closeName")
    void setCloseName(String value);
    @JsProperty(name="children")
    JsArray<Node> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<Node> value);
    @JsProperty(name="isVoid")
    boolean getIsVoid();
    @JsProperty(name="isVoid")
    void setIsVoid(boolean value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public TagPlaceholder(String tag,JsTypedObject<String,String> attrs,String startName,String closeName,JsArray<Node> children,boolean isVoid,ParseSourceSpan sourceSpan) {}
     Object visit(Visitor visitor,Object /* optional */ context);
}
