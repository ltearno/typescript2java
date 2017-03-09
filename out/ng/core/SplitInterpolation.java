package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\parser.d.ts
  * Package ng.core
  * Name SplitInterpolation
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SplitInterpolation  {
    public JsArray<String> strings;
    public JsArray<String> expressions;
    public JsArray<Integer> offsets;
    @JsConstructor
    public SplitInterpolation(JsArray<String> strings,JsArray<String> expressions,JsArray<Integer> offsets) {}
}
