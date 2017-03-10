package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.ChangeDetectorRef;
import ng.core.TrackByFn;
import ng.core.DefaultIterableDiffer;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_iterable_differ.d.ts
  * Package ng.core
  * Name DefaultIterableDifferFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DefaultIterableDifferFactory" )
public class DefaultIterableDifferFactoryImpl extends IterableDifferFactory {
    @JsConstructor
    public DefaultIterableDifferFactoryImpl() {}
    public native  boolean supports(Object obj);
    public native  DefaultIterableDiffer create(ChangeDetectorRef cdRef,TrackByFn /* optional */ trackByFn);
}
