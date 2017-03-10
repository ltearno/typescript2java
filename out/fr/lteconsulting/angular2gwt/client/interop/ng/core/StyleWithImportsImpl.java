package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\style_url_resolver.d.ts
  * Package ng.core
  * Name StyleWithImports
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="StyleWithImports" )
public class StyleWithImportsImpl  {
    @JsProperty(name="style")
    String getStyle();
    @JsProperty(name="style")
    void setStyle(String value);
    @JsProperty(name="styleUrls")
    JsArray<String> getStyleUrls();
    @JsProperty(name="styleUrls")
    void setStyleUrls(JsArray<String> value);
    @JsConstructor
    public StyleWithImportsImpl(String style,JsArray<String> styleUrls) {}
}
