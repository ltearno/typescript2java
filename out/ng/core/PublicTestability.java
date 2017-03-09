package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\testability\testability.d.ts
  * Package ng.core
  * Name PublicTestability
  * Testability API.
  * `declare` keyword causes tsickle to generate externs, so these methods are
  * not renamed by Closure Compiler.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class PublicTestability  {
    public native  boolean isStable();
    public native  void whenStable(Function callback);
    public native  JsArray<Object> findProviders(Object using,String provider,boolean exactMatch);
}
