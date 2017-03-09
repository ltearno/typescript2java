package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\message_bundle.d.ts
  * Package ng.core
  * Name MessageBundle
  * A container for message extracted from the templates.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MessageBundle  {
    public Object _htmlParser;
    public Object _implicitTags;
    public Object _implicitAttrs;
    public Object _messages;
    @JsConstructor
    public MessageBundle(HtmlParser _htmlParser,JsArray<String> _implicitTags,JsTypedObject<String,JsArray<String>> _implicitAttrs) {}
    public native  JsArray<ParseError> updateFromTemplate(String html,String url,InterpolationConfig interpolationConfig);
    public native  JsArray<Message> getMessages();
    public native  String write(Serializer serializer);
}
