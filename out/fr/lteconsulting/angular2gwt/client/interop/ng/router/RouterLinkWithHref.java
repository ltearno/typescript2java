package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.router.Router;
import ng.router.ActivatedRoute;
import ng.core.LocationStrategy;
import jsinterop.annotations.JsConstructor;
import ng.router.UrlTree;

/**
  * Generated from tests\@angular\router\src\directives\router_link.d.ts
  * Package ng.router
  * Name RouterLinkWithHref
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RouterLinkWithHref extends OnChanges {
    @JsProperty(name="router")
    Object getRouter();
    @JsProperty(name="router")
    void setRouter(Object value);
    @JsProperty(name="route")
    Object getRoute();
    @JsProperty(name="route")
    void setRoute(Object value);
    @JsProperty(name="locationStrategy")
    Object getLocationStrategy();
    @JsProperty(name="locationStrategy")
    void setLocationStrategy(Object value);
    @JsProperty(name="target")
    String getTarget();
    @JsProperty(name="target")
    void setTarget(String value);
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
    @JsProperty(name="subscription")
    Object getSubscription();
    @JsProperty(name="subscription")
    void setSubscription(Object value);
    @JsProperty(name="href")
    String getHref();
    @JsProperty(name="href")
    void setHref(String value);
    @JsConstructor
    public RouterLinkWithHref(Router router,ActivatedRoute route,LocationStrategy locationStrategy) {}
    @JsProperty(name="routerLink")
    Object /* UnionType */ getRouterLink();
    @JsProperty(name="routerLink")
    void setRouterLink(Object /* UnionType */ value);
     Object ngOnChanges(/* TypeLiteral */ Object changes);
     Object ngOnDestroy();
     boolean onClick(int button,boolean ctrlKey,boolean metaKey);
     void updateTargetUrlAndHref();
    @JsProperty(name="urlTree")
    UrlTree getUrlTree();
    @JsProperty(name="urlTree")
    void setUrlTree(UrlTree value);
}
