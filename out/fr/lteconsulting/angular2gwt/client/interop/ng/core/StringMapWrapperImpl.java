package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\facade\collection.d.ts
  * Package ng.core
  * Name StringMapWrapper
  * Wraps Javascript Objects
  **/
@JsType( isNative=true, namespace="ng.core", name="StringMapWrapper" )
public class StringMapWrapperImpl  {
    public static native <V> JsTypedObject<String,V> merge(JsTypedObject<String,V> m1,JsTypedObject<String,V> m2);
    public static native <V> boolean equals(JsTypedObject<String,V> m1,JsTypedObject<String,V> m2);
}
