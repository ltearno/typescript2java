package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\parser.d.ts
  * Package ng.core
  * Name Parser
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Parser  {
    public JsFunction1<String,TagDefinition> getTagDefinition;
    @JsConstructor
    public Parser(JsFunction1<String,TagDefinition> getTagDefinition) {}
    public native  ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms,InterpolationConfig /* optional */ interpolationConfig);
}
