package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\directives\router_link.d.ts
  * Package ng.router
  * Name RouterLink
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class RouterLink  {
    public Object router;
    public Object route;
    public JsTypedObject<String,Object> queryParams;
    public String fragment;
    public boolean preserveQueryParams;
    public boolean preserveFragment;
    public boolean skipLocationChange;
    public boolean replaceUrl;
    public Object commands;
    @JsConstructor
    public RouterLink(Router router,ActivatedRoute route) {}
    public Object /* UnionType */ routerLink;
    public native  boolean onClick();
    public UrlTree urlTree;
}
