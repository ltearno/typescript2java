package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileStylesheetMetadata
  * Metadata about a stylesheet
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileStylesheetMetadata" )
public class CompileStylesheetMetadataImpl  {
    @JsProperty(name="moduleUrl")
    String getModuleUrl();
    @JsProperty(name="moduleUrl")
    void setModuleUrl(String value);
    @JsProperty(name="styles")
    JsArray<String> getStyles();
    @JsProperty(name="styles")
    void setStyles(JsArray<String> value);
    @JsProperty(name="styleUrls")
    JsArray<String> getStyleUrls();
    @JsProperty(name="styleUrls")
    void setStyleUrls(JsArray<String> value);
    @JsConstructor
    public CompileStylesheetMetadataImpl(/* TypeLiteral */ Object /* optional */ undefined) {}
}
