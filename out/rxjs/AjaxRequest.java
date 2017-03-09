package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxRequest
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class AjaxRequest  {
    public /* optional */ String url;
    public /* optional */ Object body;
    public /* optional */ String user;
    public /* optional */ boolean async;
    public /* optional */ String method;
    public /* optional */ Object headers;
    public /* optional */ int timeout;
    public /* optional */ String password;
    public /* optional */ boolean hasContent;
    public /* optional */ boolean crossDomain;
    public /* optional */ boolean withCredentials;
    public /* optional */ JsFunction<XMLHttpRequest> createXHR;
    public /* optional */ Subscriber<Object> progressSubscriber;
    public /* optional */ String responseType;
}
