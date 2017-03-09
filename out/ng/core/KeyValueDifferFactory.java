package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\keyvalue_differs.d.ts
  * Package ng.core
  * Name KeyValueDifferFactory
  * Provides a factory for {@link KeyValueDiffer}.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class KeyValueDifferFactory  {
    public native  boolean supports(Object objects);
    public native  KeyValueDiffer create(ChangeDetectorRef cdRef);
}
