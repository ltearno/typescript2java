package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.router.UrlSegment;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.router.UrlSegmentGroup;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\url_tree.d.ts
  * Package ng.router
  * Name UrlSegmentGroup
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface UrlSegmentGroup  {
    @JsProperty(name="segments")
    JsArray<UrlSegment> getSegments();
    @JsProperty(name="segments")
    void setSegments(JsArray<UrlSegment> value);
    @JsProperty(name="children")
    JsTypedObject<String,UrlSegmentGroup> getChildren();
    @JsProperty(name="children")
    void setChildren(JsTypedObject<String,UrlSegmentGroup> value);
    @JsProperty(name="parent")
    UrlSegmentGroup getParent();
    @JsProperty(name="parent")
    void setParent(UrlSegmentGroup value);
    @JsConstructor
    public UrlSegmentGroup(JsArray<UrlSegment> segments,JsTypedObject<String,UrlSegmentGroup> children) {}
     boolean hasChildren();
    @JsProperty(name="numberOfChildren")
    int getNumberOfChildren();
    @JsProperty(name="numberOfChildren")
    void setNumberOfChildren(int value);
     String toString();
}
