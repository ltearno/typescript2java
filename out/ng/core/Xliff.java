package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xliff.d.ts
  * Package ng.core
  * Name Xliff
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Xliff extends Serializer {
    public native  String write(JsArray<Message> messages);
    public native  JsTypedObject<String,JsArray<Node>> load(String content,String url);
    public native  String digest(Message message);
}
