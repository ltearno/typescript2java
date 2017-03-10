package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\date_pipe.d.ts
  * Package ng.core
  * Name DatePipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DatePipe" )
public class DatePipeImpl extends PipeTransform {
    @JsProperty(name="_locale")
    Object get_locale();
    @JsProperty(name="_locale")
    void set_locale(Object value);
    @JsConstructor
    public DatePipeImpl(String _locale) {}
    public native  String transform(Object value,String /* optional */ pattern);
}
