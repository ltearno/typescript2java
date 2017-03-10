package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.ChangeDetectorRef;
import ng.core.KeyValueDiffer;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_keyvalue_differ.d.ts
  * Package ng.core
  * Name DefaultKeyValueDifferFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DefaultKeyValueDifferFactory" )
public class DefaultKeyValueDifferFactoryImpl extends KeyValueDifferFactory {
    @JsConstructor
    public DefaultKeyValueDifferFactoryImpl() {}
    public native  boolean supports(Object obj);
    public native  KeyValueDiffer create(ChangeDetectorRef cdRef);
}
