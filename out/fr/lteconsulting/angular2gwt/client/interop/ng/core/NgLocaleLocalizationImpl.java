package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\localization.d.ts
  * Package ng.core
  * Name NgLocaleLocalization
  * Returns the plural case based on the locale
  **/
@JsType( isNative=true, namespace="ng.core", name="NgLocaleLocalization" )
public class NgLocaleLocalizationImpl extends NgLocalization {
    @JsProperty(name="_locale")
    Object get_locale();
    @JsProperty(name="_locale")
    void set_locale(Object value);
    @JsConstructor
    public NgLocaleLocalizationImpl(String _locale) {}
    public native  String getPluralCategory(Object value);
}
