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
@JsType( isNative=true, namespace="ng.core", name="Xtb" )
public class XtbImpl extends Serializer {
    public native  String write(JsArray<Message> messages);
    public native  JsTypedObject<String,JsArray<Node>> load(String content,String url);
    public native  String digest(Message message);
    public native  PlaceholderMapper createNameMapper(Message message);
}
