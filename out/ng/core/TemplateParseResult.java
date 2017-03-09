package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_parser.d.ts
  * Package ng.core
  * Name TemplateParseResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TemplateParseResult  {
    public JsArray<TemplateAst> templateAst;
    public JsArray<ParseError> errors;
    @JsConstructor
    public TemplateParseResult(JsArray<TemplateAst> /* optional */ templateAst,JsArray<ParseError> /* optional */ errors) {}
}
