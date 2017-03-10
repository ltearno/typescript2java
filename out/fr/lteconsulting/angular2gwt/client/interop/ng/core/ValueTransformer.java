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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ValueTransformer extends ValueVisitor {
     Object visitArray(JsArray<Object> arr,Object context);
     Object visitStringMap(JsTypedObject<String,Object> map,Object context);
     Object visitPrimitive(Object value,Object context);
     Object visitOther(Object value,Object context);
}
