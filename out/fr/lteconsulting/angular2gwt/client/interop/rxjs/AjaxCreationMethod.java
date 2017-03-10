package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import rxjs.AjaxResponse;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxCreationMethod
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AjaxCreationMethod  {
    // ignored CallSignature
     Observable<AjaxResponse> get(String url,Object /* optional */ headers);
     Observable<AjaxResponse> post(String url,Object /* optional */ body,Object /* optional */ headers);
     Observable<AjaxResponse> put(String url,Object /* optional */ body,Object /* optional */ headers);
     Observable<AjaxResponse> patch(String url,Object /* optional */ body,Object /* optional */ headers);
     Observable<AjaxResponse> delete(String url,Object /* optional */ headers);
    <T> Observable<T> getJSON(String url,Object /* optional */ headers);
}
