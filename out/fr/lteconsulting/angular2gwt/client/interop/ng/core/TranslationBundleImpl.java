package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import ng.core.Message;
import ng.core.PlaceholderMapper;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import jsinterop.annotations.JsConstructor;
import ng.core.Serializer;
import ng.core.TranslationBundle;

/**
  * Generated from tests\@angular\compiler\src\i18n\translation_bundle.d.ts
  * Package ng.core
  * Name TranslationBundle
  * A container for translated messages
  **/
@JsType( isNative=true, namespace="ng.core", name="TranslationBundle" )
public class TranslationBundleImpl  {
    @JsProperty(name="_i18nNodesByMsgId")
    Object get_i18nNodesByMsgId();
    @JsProperty(name="_i18nNodesByMsgId")
    void set_i18nNodesByMsgId(Object value);
    @JsProperty(name="digest")
    JsFunction1<Message,String> getDigest();
    @JsProperty(name="digest")
    void setDigest(JsFunction1<Message,String> value);
    @JsProperty(name="mapperFactory")
    JsFunction1<Message,PlaceholderMapper> getMapperFactory();
    @JsProperty(name="mapperFactory")
    void setMapperFactory(JsFunction1<Message,PlaceholderMapper> value);
    @JsProperty(name="_i18nToHtml")
    Object get_i18nToHtml();
    @JsProperty(name="_i18nToHtml")
    void set_i18nToHtml(Object value);
    @JsConstructor
    public TranslationBundleImpl(JsTypedObject<String,JsArray<Node>> _i18nNodesByMsgId,JsFunction1<Message,String> digest,JsFunction1<Message,PlaceholderMapper> /* optional */ mapperFactory) {}
    public static native  TranslationBundle load(String content,String url,Serializer serializer);
    public native  JsArray<Node> get(Message srcMsg);
    public native  boolean has(Message srcMsg);
}
