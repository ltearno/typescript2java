package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.HtmlParser;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;
import ng.core.InterpolationConfig;
import ng.core.ParseError;
import ng.core.Message;
import ng.core.Serializer;

/**
  * Generated from tests\@angular\compiler\src\i18n\message_bundle.d.ts
  * Package ng.core
  * Name MessageBundle
  * A container for message extracted from the templates.
  **/
@JsType( isNative=true, namespace="ng.core", name="MessageBundle" )
public class MessageBundleImpl  {
    @JsProperty(name="_htmlParser")
    Object get_htmlParser();
    @JsProperty(name="_htmlParser")
    void set_htmlParser(Object value);
    @JsProperty(name="_implicitTags")
    Object get_implicitTags();
    @JsProperty(name="_implicitTags")
    void set_implicitTags(Object value);
    @JsProperty(name="_implicitAttrs")
    Object get_implicitAttrs();
    @JsProperty(name="_implicitAttrs")
    void set_implicitAttrs(Object value);
    @JsProperty(name="_messages")
    Object get_messages();
    @JsProperty(name="_messages")
    void set_messages(Object value);
    @JsConstructor
    public MessageBundleImpl(HtmlParser _htmlParser,JsArray<String> _implicitTags,JsTypedObject<String,JsArray<String>> _implicitAttrs) {}
    public native  JsArray<ParseError> updateFromTemplate(String html,String url,InterpolationConfig interpolationConfig);
    public native  JsArray<Message> getMessages();
    public native  String write(Serializer serializer);
}
