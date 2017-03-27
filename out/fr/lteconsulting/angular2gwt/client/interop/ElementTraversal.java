package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ElementTraversal
  * Typescript fqn ElementTraversal
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ElementTraversal {
    @JsProperty(name="childElementCount")
    Number getChildElementCount();

    @JsProperty(name="childElementCount")
    void setChildElementCount(Number value);

    @JsProperty(name="firstElementChild")
    Element getFirstElementChild();

    @JsProperty(name="firstElementChild")
    void setFirstElementChild(Element value);

    @JsProperty(name="lastElementChild")
    Element getLastElementChild();

    @JsProperty(name="lastElementChild")
    void setLastElementChild(Element value);

    @JsProperty(name="nextElementSibling")
    Element getNextElementSibling();

    @JsProperty(name="nextElementSibling")
    void setNextElementSibling(Element value);

    @JsProperty(name="previousElementSibling")
    Element getPreviousElementSibling();

    @JsProperty(name="previousElementSibling")
    void setPreviousElementSibling(Element value);
}
