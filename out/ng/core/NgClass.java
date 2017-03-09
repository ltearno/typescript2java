package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_class.d.ts
  * Package ng.core
  * Name NgClass
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgClass extends DoCheck {
    public Object _iterableDiffers;
    public Object _keyValueDiffers;
    public Object _ngEl;
    public Object _renderer;
    public Object _iterableDiffer;
    public Object _keyValueDiffer;
    public Object _initialClasses;
    public Object _rawClass;
    @JsConstructor
    public NgClass(IterableDiffers _iterableDiffers,KeyValueDiffers _keyValueDiffers,ElementRef _ngEl,Renderer _renderer) {}
    public String klass;
    public Object /* UnionType */ ngClass;
    public native  void ngDoCheck();
    public native  void _cleanupClasses();
    public native  void _applyKeyValueChanges();
    public native  void _applyIterableChanges();
    public native  void _applyInitialClasses();
    public native  void _applyClasses();
    public native  void _toggleClass();
}
