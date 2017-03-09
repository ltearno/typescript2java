package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\serializer.d.ts
  * Package ng.core
  * Name PlaceholderMapper
  * A `PlaceholderMapper` converts placeholder names from internal to serialized representation and
  * back.
  * 
  * It should be used for serialization format that put constraints on the placeholder names.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class PlaceholderMapper  {
    public native  String toPublicName(String internalName);
    public native  String toInternalName(String publicName);
}
