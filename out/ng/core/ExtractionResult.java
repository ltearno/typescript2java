package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\extractor_merger.d.ts
  * Package ng.core
  * Name ExtractionResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ExtractionResult  {
    public JsArray<Message> messages;
    public JsArray<I18nError> errors;
    @JsConstructor
    public ExtractionResult(JsArray<Message> messages,JsArray<I18nError> errors) {}
}
