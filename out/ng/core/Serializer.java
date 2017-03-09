package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\serializer.d.ts
  * Package ng.core
  * Name Serializer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface Serializer  {
     String write(JsArray<Message> messages);
     JsTypedObject<String,JsArray<Node>> load(String content,String url);
     String digest(Message message);
     PlaceholderMapper createNameMapper(Message message);
}
