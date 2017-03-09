package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\common\src\directives\ng_style.d.ts
  * Package ng.core
  * Name NgStyle
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgStyle extends DoCheck {
    public Object _differs;
    public Object _ngEl;
    public Object _renderer;
    public Object _ngStyle;
    public Object _differ;
    @JsConstructor
    public NgStyle(KeyValueDiffers _differs,ElementRef _ngEl,Renderer _renderer) {}
    public JsTypedObject<String,String> ngStyle;
    public native  void ngDoCheck();
    public native  void _applyChanges();
    public native  void _setStyle();
}
