package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\iterable_differs.d.ts
  * Package ng.core
  * Name IterableDifferFactory
  * Provides a factory for {@link IterableDiffer}.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class IterableDifferFactory  {
    public native  boolean supports(Object objects);
    public native  IterableDiffer create(ChangeDetectorRef cdRef,TrackByFn /* optional */ trackByFn);
}
