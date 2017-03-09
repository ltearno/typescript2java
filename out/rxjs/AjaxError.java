package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxError
  * A normalized AJAX error.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AjaxError extends Error {
    public XMLHttpRequest xhr;
    public AjaxRequest request;
    public int status;
    @JsConstructor
    public AjaxError(String message,XMLHttpRequest xhr,AjaxRequest request) {}
}
