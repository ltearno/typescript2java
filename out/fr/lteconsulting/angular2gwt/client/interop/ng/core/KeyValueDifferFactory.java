package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ChangeDetectorRef;
import ng.core.KeyValueDiffer;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\keyvalue_differs.d.ts
  * Package ng.core
  * Name KeyValueDifferFactory
  * Provides a factory for {@link KeyValueDiffer}.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface KeyValueDifferFactory  {
     boolean supports(Object objects);
     KeyValueDiffer create(ChangeDetectorRef cdRef);
}
