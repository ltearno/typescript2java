package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxCreationMethod
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class AjaxCreationMethod  {
    // ignored CallSignature
    public native  Observable<AjaxResponse> get(String url,Object /* optional */ headers);
    public native  Observable<AjaxResponse> post(String url,Object /* optional */ body,Object /* optional */ headers);
    public native  Observable<AjaxResponse> put(String url,Object /* optional */ body,Object /* optional */ headers);
    public native  Observable<AjaxResponse> patch(String url,Object /* optional */ body,Object /* optional */ headers);
    public native  Observable<AjaxResponse> delete(String url,Object /* optional */ headers);
    public native <T> Observable<T> getJSON(String url,Object /* optional */ headers);
}
