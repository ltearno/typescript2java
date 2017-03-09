package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\date_pipe.d.ts
  * Package ng.core
  * Name DatePipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DatePipe extends PipeTransform {
    public Object _locale;
    @JsConstructor
    public DatePipe(String _locale) {}
    public native  String transform(Object value,String /* optional */ pattern);
}
