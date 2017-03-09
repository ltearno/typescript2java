package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxResponse
  * A normalized AJAX response.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AjaxResponse  {
    public Event originalEvent;
    public XMLHttpRequest xhr;
    public AjaxRequest request;
    public int status;
    public Object response;
    public String responseText;
    public String responseType;
    @JsConstructor
    public AjaxResponse(Event originalEvent,XMLHttpRequest xhr,AjaxRequest request) {}
}
