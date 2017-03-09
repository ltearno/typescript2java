package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\router\src\router_state.d.ts
  * Package ng.router
  * Name ActivatedRoute
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class ActivatedRoute  {
    public Observable<JsArray<UrlSegment>> url;
    public Observable<Params> params;
    public Observable<Params> queryParams;
    public Observable<String> fragment;
    public Observable<Data> data;
    public String outlet;
    public Object /* UnionType */ component;
    public ActivatedRouteSnapshot snapshot;
    public Route routeConfig;
    public ActivatedRoute root;
    public ActivatedRoute parent;
    public ActivatedRoute firstChild;
    public JsArray<ActivatedRoute> children;
    public JsArray<ActivatedRoute> pathFromRoot;
    public native  String toString();
}
