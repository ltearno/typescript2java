package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_html_parser.d.ts
  * Package ng.core
  * Name I18NHtmlParser
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class I18NHtmlParser extends HtmlParser {
    public Object _htmlParser;
    public Object _translations;
    public Object _translationsFormat;
    public Object getTagDefinition;
    @JsConstructor
    public I18NHtmlParser(HtmlParser _htmlParser,String /* optional */ _translations,String /* optional */ _translationsFormat) {}
    public native  ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms,InterpolationConfig /* optional */ interpolationConfig);
    public native  void _createSerializer();
}
