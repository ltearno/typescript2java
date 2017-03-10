package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.ActivatedRoute;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name NavigationExtras
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NavigationExtras  {
    /* optional property relativeTo*/    @JsProperty(name="relativeTo")
    ActivatedRoute relativeTo();
    @JsProperty(name="relativeTo")
    void relativeTo(ActivatedRoute value);
    /* optional property queryParams*/    @JsProperty(name="queryParams")
    Params queryParams();
    @JsProperty(name="queryParams")
    void queryParams(Params value);
    /* optional property fragment*/    @JsProperty(name="fragment")
    String fragment();
    @JsProperty(name="fragment")
    void fragment(String value);
    /* optional property preserveQueryParams*/    @JsProperty(name="preserveQueryParams")
    boolean preserveQueryParams();
    @JsProperty(name="preserveQueryParams")
    void preserveQueryParams(boolean value);
    /* optional property preserveFragment*/    @JsProperty(name="preserveFragment")
    boolean preserveFragment();
    @JsProperty(name="preserveFragment")
    void preserveFragment(boolean value);
    /* optional property skipLocationChange*/    @JsProperty(name="skipLocationChange")
    boolean skipLocationChange();
    @JsProperty(name="skipLocationChange")
    void skipLocationChange(boolean value);
    /* optional property replaceUrl*/    @JsProperty(name="replaceUrl")
    boolean replaceUrl();
    @JsProperty(name="replaceUrl")
    void replaceUrl(boolean value);
}
