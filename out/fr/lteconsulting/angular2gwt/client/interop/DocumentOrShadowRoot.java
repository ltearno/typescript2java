package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DocumentOrShadowRoot
  * Typescript fqn DocumentOrShadowRoot
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DocumentOrShadowRoot {
    @JsProperty(name="activeElement")
    Element getActiveElement();

    @JsProperty(name="activeElement")
    void setActiveElement(Element value);

    @JsProperty(name="stylesheets")
    StyleSheetList getStylesheets();

    @JsProperty(name="stylesheets")
    void setStylesheets(StyleSheetList value);

    Object /* UnionType */ getSelection();

    Object /* UnionType */ elementFromPoint(Number x, Number y);

    JsArray<Element> elementsFromPoint(Number x, Number y);
}
