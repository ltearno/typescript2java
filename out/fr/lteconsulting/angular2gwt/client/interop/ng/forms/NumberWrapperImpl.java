package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\forms\src\facade\lang.d.ts
  * Package ng.forms
  * Name NumberWrapper
  * 
  **/
@JsType( isNative=true, namespace="ng.forms", name="NumberWrapper" )
public class NumberWrapperImpl  {
    public static native  int parseIntAutoRadix(String text);
    public static native  boolean isNumeric(Object value);
}
