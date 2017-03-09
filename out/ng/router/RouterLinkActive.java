package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.core.QueryList;
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
@JsType( isNative=true, namespace="ng.router" )
public class RouterLinkActive extends OnChanges {
    public Object router;
    public Object element;
    public Object renderer;
    public Object cdr;
    public QueryList<RouterLink> links;
    public QueryList<RouterLinkWithHref> linksWithHrefs;
    public Object classes;
    public Object subscription;
    public Object active;
    public /* TypeLiteral */ Object routerLinkActiveOptions;
    @JsConstructor
    public RouterLinkActive(Router router,ElementRef element,Renderer renderer,ChangeDetectorRef cdr) {}
    public boolean isActive;
    public native  void ngAfterContentInit();
    public Object /* UnionType */ routerLinkActive;
    public native  void ngOnChanges(SimpleChanges changes);
    public native  void ngOnDestroy();
    public native  void update();
    public native  void isLinkActive();
    public native  void hasActiveLinks();
}
