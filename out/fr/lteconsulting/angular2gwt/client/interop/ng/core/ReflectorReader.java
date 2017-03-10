package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\reflection\reflector_reader.d.ts
  * Package ng.core
  * Name ReflectorReader
  * Provides read-only access to reflection data about symbols. Used internally by Angular
  * to power dependency injection and compilation.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReflectorReader  {
     JsArray<JsArray<Object>> parameters(Object typeOrFunc);
     JsArray<Object> annotations(Object typeOrFunc);
     JsTypedObject<String,JsArray<Object>> propMetadata(Object typeOrFunc);
     String importUri(Object typeOrFunc);
     Object resolveIdentifier(String name,String moduleUrl,Object runtime);
     Object resolveEnum(Object identifier,String name);
}
