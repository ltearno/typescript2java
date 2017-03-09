package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\parser.d.ts
  * Package ng.core
  * Name TemplateBindingParseResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TemplateBindingParseResult  {
    public JsArray<TemplateBinding> templateBindings;
    public JsArray<String> warnings;
    public JsArray<ParserError> errors;
    @JsConstructor
    public TemplateBindingParseResult(JsArray<TemplateBinding> templateBindings,JsArray<String> warnings,JsArray<ParserError> errors) {}
}
