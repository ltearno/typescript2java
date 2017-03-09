package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlSegmentGroup
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class UrlSegmentGroup  {
    public JsArray<UrlSegment> segments;
    public JsTypedObject<String,UrlSegmentGroup> children;
    public UrlSegmentGroup parent;
    @JsConstructor
    public UrlSegmentGroup(JsArray<UrlSegment> segments,JsTypedObject<String,UrlSegmentGroup> children) {}
    public native  boolean hasChildren();
    public int numberOfChildren;
    public native  String toString();
}
