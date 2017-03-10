package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import ng.core.TagDefinition;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.InterpolationConfig;
import ng.core.ParseTreeResult;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\parser.d.ts
  * Package ng.core
  * Name Parser
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Parser" )
public class ParserImpl  {
    @JsProperty(name="getTagDefinition")
    JsFunction1<String,TagDefinition> getGetTagDefinition();
    @JsProperty(name="getTagDefinition")
    void setGetTagDefinition(JsFunction1<String,TagDefinition> value);
    @JsConstructor
    public ParserImpl(JsFunction1<String,TagDefinition> getTagDefinition) {}
    public native  ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms,InterpolationConfig /* optional */ interpolationConfig);
}
