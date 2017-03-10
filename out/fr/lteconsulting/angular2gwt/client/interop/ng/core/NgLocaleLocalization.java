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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgLocaleLocalization extends NgLocalization {
    @JsProperty(name="_locale")
    Object get_locale();
    @JsProperty(name="_locale")
    void set_locale(Object value);
    @JsConstructor
    public NgLocaleLocalization(String _locale) {}
     String getPluralCategory(Object value);
}
