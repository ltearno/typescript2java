package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Message;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.Node;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xliff.d.ts
  * Package ng.core
  * Name Xliff
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Xliff" )
public class XliffImpl extends Serializer {
    public native  String write(JsArray<Message> messages);
    public native  JsTypedObject<String,JsArray<Node>> load(String content,String url);
    public native  String digest(Message message);
}
