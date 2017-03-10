package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\parse_util.d.ts
  * Package ng.core
  * Name I18nError
  * An i18n error.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface I18nError extends ParseError {
    @JsConstructor
    public I18nError(ParseSourceSpan span,String msg) {}
}
