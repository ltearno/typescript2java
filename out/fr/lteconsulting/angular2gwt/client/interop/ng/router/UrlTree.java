package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.UrlSegmentGroup;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlTree
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface UrlTree  {
    @JsProperty(name="root")
    UrlSegmentGroup getRoot();
    @JsProperty(name="root")
    void setRoot(UrlSegmentGroup value);
    @JsProperty(name="queryParams")
    JsTypedObject<String,String> getQueryParams();
    @JsProperty(name="queryParams")
    void setQueryParams(JsTypedObject<String,String> value);
    @JsProperty(name="fragment")
    String getFragment();
    @JsProperty(name="fragment")
    void setFragment(String value);
     String toString();
}
