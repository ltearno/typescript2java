package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.router.Router;
import ng.router.ActivatedRoute;
import jsinterop.annotations.JsConstructor;
import ng.router.UrlTree;

/**
  * Generated from tests\@angular\router\src\directives\router_link.d.ts
  * Package ng.router
  * Name RouterLink
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RouterLink  {
    @JsProperty(name="router")
    Object getRouter();
    @JsProperty(name="router")
    void setRouter(Object value);
    @JsProperty(name="route")
    Object getRoute();
    @JsProperty(name="route")
    void setRoute(Object value);
    @JsProperty(name="queryParams")
    JsTypedObject<String,Object> getQueryParams();
    @JsProperty(name="queryParams")
    void setQueryParams(JsTypedObject<String,Object> value);
    @JsProperty(name="fragment")
    String getFragment();
    @JsProperty(name="fragment")
    void setFragment(String value);
    @JsProperty(name="preserveQueryParams")
    boolean getPreserveQueryParams();
    @JsProperty(name="preserveQueryParams")
    void setPreserveQueryParams(boolean value);
    @JsProperty(name="preserveFragment")
    boolean getPreserveFragment();
    @JsProperty(name="preserveFragment")
    void setPreserveFragment(boolean value);
    @JsProperty(name="skipLocationChange")
    boolean getSkipLocationChange();
    @JsProperty(name="skipLocationChange")
    void setSkipLocationChange(boolean value);
    @JsProperty(name="replaceUrl")
    boolean getReplaceUrl();
    @JsProperty(name="replaceUrl")
    void setReplaceUrl(boolean value);
    @JsProperty(name="commands")
    Object getCommands();
    @JsProperty(name="commands")
    void setCommands(Object value);
    @JsConstructor
    public RouterLink(Router router,ActivatedRoute route) {}
    @JsProperty(name="routerLink")
    Object /* UnionType */ getRouterLink();
    @JsProperty(name="routerLink")
    void setRouterLink(Object /* UnionType */ value);
     boolean onClick();
    @JsProperty(name="urlTree")
    UrlTree getUrlTree();
    @JsProperty(name="urlTree")
    void setUrlTree(UrlTree value);
}
