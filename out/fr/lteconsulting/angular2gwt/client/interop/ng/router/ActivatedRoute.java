package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.router.UrlSegment;
import jsinterop.annotations.JsProperty;
import ng.router.ActivatedRouteSnapshot;
import ng.router.Route;
import ng.router.ActivatedRoute;

/**
  * Generated from tests\@angular\router\src\router_state.d.ts
  * Package ng.router
  * Name ActivatedRoute
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ActivatedRoute  {
    @JsProperty(name="url")
    Observable<JsArray<UrlSegment>> getUrl();
    @JsProperty(name="url")
    void setUrl(Observable<JsArray<UrlSegment>> value);
    @JsProperty(name="params")
    Observable<Params> getParams();
    @JsProperty(name="params")
    void setParams(Observable<Params> value);
    @JsProperty(name="queryParams")
    Observable<Params> getQueryParams();
    @JsProperty(name="queryParams")
    void setQueryParams(Observable<Params> value);
    @JsProperty(name="fragment")
    Observable<String> getFragment();
    @JsProperty(name="fragment")
    void setFragment(Observable<String> value);
    @JsProperty(name="data")
    Observable<Data> getData();
    @JsProperty(name="data")
    void setData(Observable<Data> value);
    @JsProperty(name="outlet")
    String getOutlet();
    @JsProperty(name="outlet")
    void setOutlet(String value);
    @JsProperty(name="component")
    Object /* UnionType */ getComponent();
    @JsProperty(name="component")
    void setComponent(Object /* UnionType */ value);
    @JsProperty(name="snapshot")
    ActivatedRouteSnapshot getSnapshot();
    @JsProperty(name="snapshot")
    void setSnapshot(ActivatedRouteSnapshot value);
    @JsProperty(name="routeConfig")
    Route getRouteConfig();
    @JsProperty(name="routeConfig")
    void setRouteConfig(Route value);
    @JsProperty(name="root")
    ActivatedRoute getRoot();
    @JsProperty(name="root")
    void setRoot(ActivatedRoute value);
    @JsProperty(name="parent")
    ActivatedRoute getParent();
    @JsProperty(name="parent")
    void setParent(ActivatedRoute value);
    @JsProperty(name="firstChild")
    ActivatedRoute getFirstChild();
    @JsProperty(name="firstChild")
    void setFirstChild(ActivatedRoute value);
    @JsProperty(name="children")
    JsArray<ActivatedRoute> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<ActivatedRoute> value);
    @JsProperty(name="pathFromRoot")
    JsArray<ActivatedRoute> getPathFromRoot();
    @JsProperty(name="pathFromRoot")
    void setPathFromRoot(JsArray<ActivatedRoute> value);
     String toString();
}
