package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileTemplateSummary
  * Summary Metadata regarding compilation of a template.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileTemplateSummary  {
    @JsProperty(name="animations")
    JsArray<String> animations();
    @JsProperty(name="animations")
    void animations(JsArray<String> value);
    @JsProperty(name="ngContentSelectors")
    JsArray<String> ngContentSelectors();
    @JsProperty(name="ngContentSelectors")
    void ngContentSelectors(JsArray<String> value);
    @JsProperty(name="encapsulation")
    /* ng.core.ViewEncapsulation */ int encapsulation();
    @JsProperty(name="encapsulation")
    void encapsulation(/* ng.core.ViewEncapsulation */ int value);
}
