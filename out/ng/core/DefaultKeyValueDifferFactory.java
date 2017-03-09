package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_keyvalue_differ.d.ts
  * Package ng.core
  * Name DefaultKeyValueDifferFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DefaultKeyValueDifferFactory extends KeyValueDifferFactory {
    @JsConstructor
    public DefaultKeyValueDifferFactory() {}
    public native  boolean supports(Object obj);
    public native  KeyValueDiffer create(ChangeDetectorRef cdRef);
}
