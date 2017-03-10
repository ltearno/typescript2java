package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\parser.d.ts
  * Package ng.core
  * Name SplitInterpolation
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SplitInterpolation  {
    @JsProperty(name="strings")
    JsArray<String> getStrings();
    @JsProperty(name="strings")
    void setStrings(JsArray<String> value);
    @JsProperty(name="expressions")
    JsArray<String> getExpressions();
    @JsProperty(name="expressions")
    void setExpressions(JsArray<String> value);
    @JsProperty(name="offsets")
    JsArray<Integer> getOffsets();
    @JsProperty(name="offsets")
    void setOffsets(JsArray<Integer> value);
    @JsConstructor
    public SplitInterpolation(JsArray<String> strings,JsArray<String> expressions,JsArray<Integer> offsets) {}
}
