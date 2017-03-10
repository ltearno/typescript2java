package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\render\api.d.ts
  * Package ng.core
  * Name RenderComponentType
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="RenderComponentType" )
public class RenderComponentTypeImpl  {
    @JsProperty(name="id")
    String getId();
    @JsProperty(name="id")
    void setId(String value);
    @JsProperty(name="templateUrl")
    String getTemplateUrl();
    @JsProperty(name="templateUrl")
    void setTemplateUrl(String value);
    @JsProperty(name="slotCount")
    int getSlotCount();
    @JsProperty(name="slotCount")
    void setSlotCount(int value);
    @JsProperty(name="encapsulation")
    /* ng.core.ViewEncapsulation */ int getEncapsulation();
    @JsProperty(name="encapsulation")
    void setEncapsulation(/* ng.core.ViewEncapsulation */ int value);
    @JsProperty(name="styles")
    Array<Object /* UnionType */> getStyles();
    @JsProperty(name="styles")
    void setStyles(Array<Object /* UnionType */> value);
    @JsProperty(name="animations")
    JsTypedObject<String,Function> getAnimations();
    @JsProperty(name="animations")
    void setAnimations(JsTypedObject<String,Function> value);
    @JsConstructor
    public RenderComponentTypeImpl(String id,String templateUrl,int slotCount,/* ng.core.ViewEncapsulation */ int encapsulation,Array<Object /* UnionType */> styles,JsTypedObject<String,Function> animations) {}
}
