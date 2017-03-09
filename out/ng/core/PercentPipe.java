package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\number_pipe.d.ts
  * Package ng.core
  * Name PercentPipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class PercentPipe extends PipeTransform {
    public Object _locale;
    @JsConstructor
    public PercentPipe(String _locale) {}
    public native  String transform(Object value,String /* optional */ digits);
}
