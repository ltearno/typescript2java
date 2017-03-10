package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.TemplateAst;
import jsinterop.annotations.JsProperty;
import ng.core.ParseError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_parser.d.ts
  * Package ng.core
  * Name TemplateParseResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TemplateParseResult  {
    @JsProperty(name="templateAst")
    JsArray<TemplateAst> getTemplateAst();
    @JsProperty(name="templateAst")
    void setTemplateAst(JsArray<TemplateAst> value);
    @JsProperty(name="errors")
    JsArray<ParseError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<ParseError> value);
    @JsConstructor
    public TemplateParseResult(JsArray<TemplateAst> /* optional */ templateAst,JsArray<ParseError> /* optional */ errors) {}
}
