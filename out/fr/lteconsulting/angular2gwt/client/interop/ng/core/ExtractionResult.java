package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Message;
import jsinterop.annotations.JsProperty;
import ng.core.I18nError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\extractor_merger.d.ts
  * Package ng.core
  * Name ExtractionResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExtractionResult  {
    @JsProperty(name="messages")
    JsArray<Message> getMessages();
    @JsProperty(name="messages")
    void setMessages(JsArray<Message> value);
    @JsProperty(name="errors")
    JsArray<I18nError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<I18nError> value);
    @JsConstructor
    public ExtractionResult(JsArray<Message> messages,JsArray<I18nError> errors) {}
}
