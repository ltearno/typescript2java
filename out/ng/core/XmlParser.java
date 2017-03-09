package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\xml_parser.d.ts
  * Package ng.core
  * Name XmlParser
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class XmlParser extends Parser {
    @JsConstructor
    public XmlParser() {}
    public native  ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms);
}
