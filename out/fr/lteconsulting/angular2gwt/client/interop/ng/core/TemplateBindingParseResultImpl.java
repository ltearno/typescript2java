package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.TemplateBinding;
import jsinterop.annotations.JsProperty;
import ng.core.ParserError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\parser.d.ts
  * Package ng.core
  * Name TemplateBindingParseResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="TemplateBindingParseResult" )
public class TemplateBindingParseResultImpl  {
    @JsProperty(name="templateBindings")
    JsArray<TemplateBinding> getTemplateBindings();
    @JsProperty(name="templateBindings")
    void setTemplateBindings(JsArray<TemplateBinding> value);
    @JsProperty(name="warnings")
    JsArray<String> getWarnings();
    @JsProperty(name="warnings")
    void setWarnings(JsArray<String> value);
    @JsProperty(name="errors")
    JsArray<ParserError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<ParserError> value);
    @JsConstructor
    public TemplateBindingParseResultImpl(JsArray<TemplateBinding> templateBindings,JsArray<String> warnings,JsArray<ParserError> errors) {}
}
