package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.HtmlParser;
import jsinterop.annotations.JsConstructor;
import ng.core.InterpolationConfig;
import ng.core.ParseTreeResult;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_html_parser.d.ts
  * Package ng.core
  * Name I18NHtmlParser
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="I18NHtmlParser" )
public class I18NHtmlParserImpl extends HtmlParser {
    @JsProperty(name="_htmlParser")
    Object get_htmlParser();
    @JsProperty(name="_htmlParser")
    void set_htmlParser(Object value);
    @JsProperty(name="_translations")
    Object get_translations();
    @JsProperty(name="_translations")
    void set_translations(Object value);
    @JsProperty(name="_translationsFormat")
    Object get_translationsFormat();
    @JsProperty(name="_translationsFormat")
    void set_translationsFormat(Object value);
    @JsProperty(name="getTagDefinition")
    Object getGetTagDefinition();
    @JsProperty(name="getTagDefinition")
    void setGetTagDefinition(Object value);
    @JsConstructor
    public I18NHtmlParserImpl(HtmlParser _htmlParser,String /* optional */ _translations,String /* optional */ _translationsFormat) {}
    public native  ParseTreeResult parse(String source,String url,boolean /* optional */ parseExpansionForms,InterpolationConfig /* optional */ interpolationConfig);
    public native  void _createSerializer();
}
