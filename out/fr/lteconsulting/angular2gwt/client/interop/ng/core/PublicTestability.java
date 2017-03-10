package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\testability\testability.d.ts
  * Package ng.core
  * Name PublicTestability
  * Testability API.
  * `declare` keyword causes tsickle to generate externs, so these methods are
  * not renamed by Closure Compiler.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PublicTestability  {
     boolean isStable();
     void whenStable(Function callback);
     JsArray<Object> findProviders(Object using,String provider,boolean exactMatch);
}
