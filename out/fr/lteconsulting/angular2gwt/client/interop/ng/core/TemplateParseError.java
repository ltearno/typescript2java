package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_parser.d.ts
  * Package ng.core
  * Name TemplateParseError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TemplateParseError extends ParseError {
    @JsConstructor
    public TemplateParseError(String message,ParseSourceSpan span,/* ng.core.ParseErrorLevel */ int level) {}
}
