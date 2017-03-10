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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DefaultKeyValueDifferFactory extends KeyValueDifferFactory {
    @JsConstructor
    public DefaultKeyValueDifferFactory() {}
     boolean supports(Object obj);
     KeyValueDiffer create(ChangeDetectorRef cdRef);
}
