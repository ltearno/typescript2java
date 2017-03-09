package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\render\api.d.ts
  * Package ng.core
  * Name RenderComponentType
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class RenderComponentType  {
    public String id;
    public String templateUrl;
    public int slotCount;
    public /* ng.core.ViewEncapsulation */ int encapsulation;
    public Array<Object /* UnionType */> styles;
    public JsTypedObject<String,Function> animations;
    @JsConstructor
    public RenderComponentType(String id,String templateUrl,int slotCount,/* ng.core.ViewEncapsulation */ int encapsulation,Array<Object /* UnionType */> styles,JsTypedObject<String,Function> animations) {}
}
