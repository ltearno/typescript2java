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
@JsType( isNative=true, namespace="ng.core", name="ReflectorReader" )
public abstract class ReflectorReaderImpl  {
    public native  JsArray<JsArray<Object>> parameters(Object typeOrFunc);
    public native  JsArray<Object> annotations(Object typeOrFunc);
    public native  JsTypedObject<String,JsArray<Object>> propMetadata(Object typeOrFunc);
    public native  String importUri(Object typeOrFunc);
    public native  Object resolveIdentifier(String name,String moduleUrl,Object runtime);
    public native  Object resolveEnum(Object identifier,String name);
}
