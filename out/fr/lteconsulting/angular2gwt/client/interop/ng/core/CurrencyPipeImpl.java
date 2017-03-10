package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\number_pipe.d.ts
  * Package ng.core
  * Name CurrencyPipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CurrencyPipe" )
public class CurrencyPipeImpl extends PipeTransform {
    @JsProperty(name="_locale")
    Object get_locale();
    @JsProperty(name="_locale")
    void set_locale(Object value);
    @JsConstructor
    public CurrencyPipeImpl(String _locale) {}
    public native  String transform(Object value,String /* optional */ currencyCode,boolean /* optional */ symbolDisplay,String /* optional */ digits);
}
