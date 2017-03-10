package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\icu_ast_expander.d.ts
  * Package ng.core
  * Name ExpansionError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpansionError extends ParseError {
    @JsConstructor
    public ExpansionError(ParseSourceSpan span,String errorMsg) {}
}
