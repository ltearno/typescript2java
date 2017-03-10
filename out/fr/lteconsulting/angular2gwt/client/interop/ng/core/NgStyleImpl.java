package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.KeyValueDiffers;
import ng.core.ElementRef;
import ng.core.Renderer;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\common\src\directives\ng_style.d.ts
  * Package ng.core
  * Name NgStyle
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="NgStyle" )
public class NgStyleImpl extends DoCheck {
    @JsProperty(name="_differs")
    Object get_differs();
    @JsProperty(name="_differs")
    void set_differs(Object value);
    @JsProperty(name="_ngEl")
    Object get_ngEl();
    @JsProperty(name="_ngEl")
    void set_ngEl(Object value);
    @JsProperty(name="_renderer")
    Object get_renderer();
    @JsProperty(name="_renderer")
    void set_renderer(Object value);
    @JsProperty(name="_ngStyle")
    Object get_ngStyle();
    @JsProperty(name="_ngStyle")
    void set_ngStyle(Object value);
    @JsProperty(name="_differ")
    Object get_differ();
    @JsProperty(name="_differ")
    void set_differ(Object value);
    @JsConstructor
    public NgStyleImpl(KeyValueDiffers _differs,ElementRef _ngEl,Renderer _renderer) {}
    @JsProperty(name="ngStyle")
    JsTypedObject<String,String> getNgStyle();
    @JsProperty(name="ngStyle")
    void setNgStyle(JsTypedObject<String,String> value);
    public native  void ngDoCheck();
    public native  void _applyChanges();
    public native  void _setStyle();
}
