package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\core\src\change_detection\change_detector_ref.d.ts
  * Package ng.core
  * Name ChangeDetectorRef
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ChangeDetectorRef  {
     void markForCheck();
     void detach();
     void detectChanges();
     void checkNoChanges();
     void reattach();
}
