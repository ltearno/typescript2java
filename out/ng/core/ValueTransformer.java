package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\util.d.ts
  * Package ng.core
  * Name ValueTransformer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ValueTransformer extends ValueVisitor {
    public native  Object visitArray(JsArray<Object> arr,Object context);
    public native  Object visitStringMap(JsTypedObject<String,Object> map,Object context);
    public native  Object visitPrimitive(Object value,Object context);
    public native  Object visitOther(Object value,Object context);
}
