package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.InterpolationConfig;
import ng.core.ParseTreeResult;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\html_parser.d.ts
  * Package ng.core
  * Name HtmlParser
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface HtmlParser extends Parser {
    @JsConstructor
    public HtmlParser() {}
     ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms,InterpolationConfig /* optional */ interpolationConfig);
}
