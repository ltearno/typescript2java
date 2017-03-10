package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\testing\metadata_overrider.d.ts
  * Package ng.core
  * Name MetadataOverrider
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MetadataOverrider  {
    @JsProperty(name="_references")
    Object get_references();
    @JsProperty(name="_references")
    void set_references(Object value);
    <C,T> C overrideMetadata(/* TypeLiteral */ Object metadataClass,C oldMetadata,MetadataOverride<T> override);
}
