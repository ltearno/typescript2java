package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\number_pipe.d.ts
  * Package ng.core
  * Name DecimalPipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DecimalPipe extends PipeTransform {
    public Object _locale;
    @JsConstructor
    public DecimalPipe(String _locale) {}
    public native  String transform(Object value,String /* optional */ digits);
}
