package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ParentNode
  * Typescript fqn ParentNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ParentNode {
    @JsProperty(name="children")
    HTMLCollection getChildren();

    @JsProperty(name="children")
    void setChildren(HTMLCollection value);

    @JsProperty(name="firstElementChild")
    Element getFirstElementChild();

    @JsProperty(name="firstElementChild")
    void setFirstElementChild(Element value);

    @JsProperty(name="lastElementChild")
    Element getLastElementChild();

    @JsProperty(name="lastElementChild")
    void setLastElementChild(Element value);

    @JsProperty(name="childElementCount")
    Number getChildElementCount();

    @JsProperty(name="childElementCount")
    void setChildElementCount(Number value);
}
