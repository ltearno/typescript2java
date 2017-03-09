package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\localization.d.ts
  * Package ng.core
  * Name NgLocaleLocalization
  * Returns the plural case based on the locale
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgLocaleLocalization extends NgLocalization {
    public Object _locale;
    @JsConstructor
    public NgLocaleLocalization(String _locale) {}
    public native  String getPluralCategory(Object value);
}
