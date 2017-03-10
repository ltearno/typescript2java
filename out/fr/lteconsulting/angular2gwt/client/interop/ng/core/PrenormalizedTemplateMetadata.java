package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileAnimationEntryMetadata;

/**
  * Generated from tests\@angular\compiler\src\directive_normalizer.d.ts
  * Package ng.core
  * Name PrenormalizedTemplateMetadata
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PrenormalizedTemplateMetadata  {
    @JsProperty(name="componentType")
    Object componentType();
    @JsProperty(name="componentType")
    void componentType(Object value);
    @JsProperty(name="moduleUrl")
    String moduleUrl();
    @JsProperty(name="moduleUrl")
    void moduleUrl(String value);
    /* optional property template*/    @JsProperty(name="template")
    String template();
    @JsProperty(name="template")
    void template(String value);
    /* optional property templateUrl*/    @JsProperty(name="templateUrl")
    String templateUrl();
    @JsProperty(name="templateUrl")
    void templateUrl(String value);
    /* optional property styles*/    @JsProperty(name="styles")
    JsArray<String> styles();
    @JsProperty(name="styles")
    void styles(JsArray<String> value);
    /* optional property styleUrls*/    @JsProperty(name="styleUrls")
    JsArray<String> styleUrls();
    @JsProperty(name="styleUrls")
    void styleUrls(JsArray<String> value);
    /* optional property interpolation*/    @JsProperty(name="interpolation")
    JsArray<String> /* Tuple [String, String] */ interpolation();
    @JsProperty(name="interpolation")
    void interpolation(JsArray<String> /* Tuple [String, String] */ value);
    /* optional property encapsulation*/    @JsProperty(name="encapsulation")
    /* ng.core.ViewEncapsulation */ int encapsulation();
    @JsProperty(name="encapsulation")
    void encapsulation(/* ng.core.ViewEncapsulation */ int value);
    /* optional property animations*/    @JsProperty(name="animations")
    JsArray<CompileAnimationEntryMetadata> animations();
    @JsProperty(name="animations")
    void animations(JsArray<CompileAnimationEntryMetadata> value);
}
