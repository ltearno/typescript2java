package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\core\src\change_detection\change_detector_ref.d.ts
  * Package ng.core
  * Name ChangeDetectorRef
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ChangeDetectorRef" )
public abstract class ChangeDetectorRefImpl  {
    public native  void markForCheck();
    public native  void detach();
    public native  void detectChanges();
    public native  void checkNoChanges();
    public native  void reattach();
}
