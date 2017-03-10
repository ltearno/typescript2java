package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.QueryList;
import ng.router.RouterLink;
import ng.router.RouterLinkWithHref;
import ng.router.Router;
import ng.core.ElementRef;
import ng.core.Renderer;
import ng.core.ChangeDetectorRef;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;

/**
  * Generated from tests\@angular\router\src\directives\router_link_active.d.ts
  * Package ng.router
  * Name RouterLinkActive
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="RouterLinkActive" )
public class RouterLinkActiveImpl extends OnChanges {
    @JsProperty(name="router")
    Object getRouter();
    @JsProperty(name="router")
    void setRouter(Object value);
    @JsProperty(name="element")
    Object getElement();
    @JsProperty(name="element")
    void setElement(Object value);
    @JsProperty(name="renderer")
    Object getRenderer();
    @JsProperty(name="renderer")
    void setRenderer(Object value);
    @JsProperty(name="cdr")
    Object getCdr();
    @JsProperty(name="cdr")
    void setCdr(Object value);
    @JsProperty(name="links")
    QueryList<RouterLink> getLinks();
    @JsProperty(name="links")
    void setLinks(QueryList<RouterLink> value);
    @JsProperty(name="linksWithHrefs")
    QueryList<RouterLinkWithHref> getLinksWithHrefs();
    @JsProperty(name="linksWithHrefs")
    void setLinksWithHrefs(QueryList<RouterLinkWithHref> value);
    @JsProperty(name="classes")
    Object getClasses();
    @JsProperty(name="classes")
    void setClasses(Object value);
    @JsProperty(name="subscription")
    Object getSubscription();
    @JsProperty(name="subscription")
    void setSubscription(Object value);
    @JsProperty(name="active")
    Object getActive();
    @JsProperty(name="active")
    void setActive(Object value);
    @JsProperty(name="routerLinkActiveOptions")
    /* TypeLiteral */ Object getRouterLinkActiveOptions();
    @JsProperty(name="routerLinkActiveOptions")
    void setRouterLinkActiveOptions(/* TypeLiteral */ Object value);
    @JsConstructor
    public RouterLinkActiveImpl(Router router,ElementRef element,Renderer renderer,ChangeDetectorRef cdr) {}
    @JsProperty(name="isActive")
    boolean getIsActive();
    @JsProperty(name="isActive")
    void setIsActive(boolean value);
    public native  void ngAfterContentInit();
    @JsProperty(name="routerLinkActive")
    Object /* UnionType */ getRouterLinkActive();
    @JsProperty(name="routerLinkActive")
    void setRouterLinkActive(Object /* UnionType */ value);
    public native  void ngOnChanges(SimpleChanges changes);
    public native  void ngOnDestroy();
    public native  void update();
    public native  void isLinkActive();
    public native  void hasActiveLinks();
}
