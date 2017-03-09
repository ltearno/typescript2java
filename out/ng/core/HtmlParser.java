package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\html_parser.d.ts
  * Package ng.core
  * Name HtmlParser
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class HtmlParser extends Parser {
    @JsConstructor
    public HtmlParser() {}
    public native  ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms,InterpolationConfig /* optional */ interpolationConfig);
}
