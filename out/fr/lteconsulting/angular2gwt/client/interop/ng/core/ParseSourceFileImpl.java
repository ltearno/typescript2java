package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\parse_util.d.ts
  * Package ng.core
  * Name ParseSourceFile
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ParseSourceFile" )
public class ParseSourceFileImpl  {
    @JsProperty(name="content")
    String getContent();
    @JsProperty(name="content")
    void setContent(String value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsConstructor
    public ParseSourceFileImpl(String content,String url) {}
}
