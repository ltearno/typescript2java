package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Message;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.Node;
import ng.core.PlaceholderMapper;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xtb.d.ts
  * Package ng.core
  * Name Xtb
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Xtb extends Serializer {
     String write(JsArray<Message> messages);
     JsTypedObject<String,JsArray<Node>> load(String content,String url);
     String digest(Message message);
     PlaceholderMapper createNameMapper(Message message);
}
