package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\number_pipe.d.ts
  * Package ng.core
  * Name PercentPipe
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PercentPipe extends PipeTransform {
    @JsProperty(name="_locale")
    Object get_locale();
    @JsProperty(name="_locale")
    void set_locale(Object value);
    @JsConstructor
    public PercentPipe(String _locale) {}
     String transform(Object value,String /* optional */ digits);
}
