package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.LocationStrategy;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\directives\router_link.d.ts
  * Package ng.router
  * Name RouterLinkWithHref
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class RouterLinkWithHref extends OnChanges {
    public Object router;
    public Object route;
    public Object locationStrategy;
    public String target;
    public JsTypedObject<String,Object> queryParams;
    public String fragment;
    public boolean preserveQueryParams;
    public boolean preserveFragment;
    public boolean skipLocationChange;
    public boolean replaceUrl;
    public Object commands;
    public Object subscription;
    public String href;
    @JsConstructor
    public RouterLinkWithHref(Router router,ActivatedRoute route,LocationStrategy locationStrategy) {}
    public Object /* UnionType */ routerLink;
    public native  Object ngOnChanges(/* TypeLiteral */ Object changes);
    public native  Object ngOnDestroy();
    public native  boolean onClick(int button,boolean ctrlKey,boolean metaKey);
    public native  void updateTargetUrlAndHref();
    public UrlTree urlTree;
}
