package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.ParseTreeResult;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\xml_parser.d.ts
  * Package ng.core
  * Name XmlParser
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface XmlParser extends Parser {
    @JsConstructor
    public XmlParser() {}
     ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms);
}
