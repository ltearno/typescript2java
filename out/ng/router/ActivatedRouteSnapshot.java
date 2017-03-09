package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\router\src\router_state.d.ts
  * Package ng.router
  * Name ActivatedRouteSnapshot
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class ActivatedRouteSnapshot  {
    public JsArray<UrlSegment> url;
    public Params params;
    public Params queryParams;
    public String fragment;
    public Data data;
    public String outlet;
    public Object /* UnionType */ component;
    public Route routeConfig;
    public ActivatedRouteSnapshot root;
    public ActivatedRouteSnapshot parent;
    public ActivatedRouteSnapshot firstChild;
    public JsArray<ActivatedRouteSnapshot> children;
    public JsArray<ActivatedRouteSnapshot> pathFromRoot;
    public native  String toString();
}
