package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ChangeDetectorRef;
import ng.core.TrackByFn;
import ng.core.IterableDiffer;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\iterable_differs.d.ts
  * Package ng.core
  * Name IterableDifferFactory
  * Provides a factory for {@link IterableDiffer}.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IterableDifferFactory  {
     boolean supports(Object objects);
     IterableDiffer create(ChangeDetectorRef cdRef,TrackByFn /* optional */ trackByFn);
}
