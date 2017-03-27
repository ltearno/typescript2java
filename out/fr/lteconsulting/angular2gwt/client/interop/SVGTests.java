package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGTests
  * Typescript fqn SVGTests
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGTests {
    @JsProperty(name="requiredExtensions")
    SVGStringList getRequiredExtensions();

    @JsProperty(name="requiredExtensions")
    void setRequiredExtensions(SVGStringList value);

    @JsProperty(name="requiredFeatures")
    SVGStringList getRequiredFeatures();

    @JsProperty(name="requiredFeatures")
    void setRequiredFeatures(SVGStringList value);

    @JsProperty(name="systemLanguage")
    SVGStringList getSystemLanguage();

    @JsProperty(name="systemLanguage")
    void setSystemLanguage(SVGStringList value);

    boolean hasExtension(String extension);
}
