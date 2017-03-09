package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\translation_bundle.d.ts
  * Package ng.core
  * Name TranslationBundle
  * A container for translated messages
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TranslationBundle  {
    public Object _i18nNodesByMsgId;
    public JsFunction1<Message,String> digest;
    public JsFunction1<Message,PlaceholderMapper> mapperFactory;
    public Object _i18nToHtml;
    @JsConstructor
    public TranslationBundle(JsTypedObject<String,JsArray<Node>> _i18nNodesByMsgId,JsFunction1<Message,String> digest,JsFunction1<Message,PlaceholderMapper> /* optional */ mapperFactory) {}
    public static native  TranslationBundle load(String content,String url,Serializer serializer);
    public native  JsArray<Node> get(Message srcMsg);
    public native  boolean has(Message srcMsg);
}
