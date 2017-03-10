package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.router.UrlSegment;
import jsinterop.annotations.JsProperty;
import ng.router.Route;
import ng.router.ActivatedRouteSnapshot;

/**
  * Generated from tests\@angular\router\src\router_state.d.ts
  * Package ng.router
  * Name ActivatedRouteSnapshot
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="ActivatedRouteSnapshot" )
public class ActivatedRouteSnapshotImpl  {
    @JsProperty(name="url")
    JsArray<UrlSegment> getUrl();
    @JsProperty(name="url")
    void setUrl(JsArray<UrlSegment> value);
    @JsProperty(name="params")
    Params getParams();
    @JsProperty(name="params")
    void setParams(Params value);
    @JsProperty(name="queryParams")
    Params getQueryParams();
    @JsProperty(name="queryParams")
    void setQueryParams(Params value);
    @JsProperty(name="fragment")
    String getFragment();
    @JsProperty(name="fragment")
    void setFragment(String value);
    @JsProperty(name="data")
    Data getData();
    @JsProperty(name="data")
    void setData(Data value);
    @JsProperty(name="outlet")
    String getOutlet();
    @JsProperty(name="outlet")
    void setOutlet(String value);
    @JsProperty(name="component")
    Object /* UnionType */ getComponent();
    @JsProperty(name="component")
    void setComponent(Object /* UnionType */ value);
    @JsProperty(name="routeConfig")
    Route getRouteConfig();
    @JsProperty(name="routeConfig")
    void setRouteConfig(Route value);
    @JsProperty(name="root")
    ActivatedRouteSnapshot getRoot();
    @JsProperty(name="root")
    void setRoot(ActivatedRouteSnapshot value);
    @JsProperty(name="parent")
    ActivatedRouteSnapshot getParent();
    @JsProperty(name="parent")
    void setParent(ActivatedRouteSnapshot value);
    @JsProperty(name="firstChild")
    ActivatedRouteSnapshot getFirstChild();
    @JsProperty(name="firstChild")
    void setFirstChild(ActivatedRouteSnapshot value);
    @JsProperty(name="children")
    JsArray<ActivatedRouteSnapshot> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<ActivatedRouteSnapshot> value);
    @JsProperty(name="pathFromRoot")
    JsArray<ActivatedRouteSnapshot> getPathFromRoot();
    @JsProperty(name="pathFromRoot")
    void setPathFromRoot(JsArray<ActivatedRouteSnapshot> value);
    public native  String toString();
}
