package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.IterableDiffers;
import ng.core.KeyValueDiffers;
import ng.core.ElementRef;
import ng.core.Renderer;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_class.d.ts
  * Package ng.core
  * Name NgClass
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="NgClass" )
public class NgClassImpl extends DoCheck {
    @JsProperty(name="_iterableDiffers")
    Object get_iterableDiffers();
    @JsProperty(name="_iterableDiffers")
    void set_iterableDiffers(Object value);
    @JsProperty(name="_keyValueDiffers")
    Object get_keyValueDiffers();
    @JsProperty(name="_keyValueDiffers")
    void set_keyValueDiffers(Object value);
    @JsProperty(name="_ngEl")
    Object get_ngEl();
    @JsProperty(name="_ngEl")
    void set_ngEl(Object value);
    @JsProperty(name="_renderer")
    Object get_renderer();
    @JsProperty(name="_renderer")
    void set_renderer(Object value);
    @JsProperty(name="_iterableDiffer")
    Object get_iterableDiffer();
    @JsProperty(name="_iterableDiffer")
    void set_iterableDiffer(Object value);
    @JsProperty(name="_keyValueDiffer")
    Object get_keyValueDiffer();
    @JsProperty(name="_keyValueDiffer")
    void set_keyValueDiffer(Object value);
    @JsProperty(name="_initialClasses")
    Object get_initialClasses();
    @JsProperty(name="_initialClasses")
    void set_initialClasses(Object value);
    @JsProperty(name="_rawClass")
    Object get_rawClass();
    @JsProperty(name="_rawClass")
    void set_rawClass(Object value);
    @JsConstructor
    public NgClassImpl(IterableDiffers _iterableDiffers,KeyValueDiffers _keyValueDiffers,ElementRef _ngEl,Renderer _renderer) {}
    @JsProperty(name="klass")
    String getKlass();
    @JsProperty(name="klass")
    void setKlass(String value);
    @JsProperty(name="ngClass")
    Object /* UnionType */ getNgClass();
    @JsProperty(name="ngClass")
    void setNgClass(Object /* UnionType */ value);
    public native  void ngDoCheck();
    public native  void _cleanupClasses();
    public native  void _applyKeyValueChanges();
    public native  void _applyIterableChanges();
    public native  void _applyInitialClasses();
    public native  void _applyClasses();
    public native  void _toggleClass();
}
