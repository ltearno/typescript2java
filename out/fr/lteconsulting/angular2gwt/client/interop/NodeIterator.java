package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NodeIterator
  * Typescript fqn NodeIterator
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NodeIterator {
    @JsProperty(name="expandEntityReferences")
    boolean getExpandEntityReferences();

    @JsProperty(name="expandEntityReferences")
    void setExpandEntityReferences(boolean value);

    @JsProperty(name="filter")
    NodeFilter getFilter();

    @JsProperty(name="filter")
    void setFilter(NodeFilter value);

    @JsProperty(name="root")
    Node getRoot();

    @JsProperty(name="root")
    void setRoot(Node value);

    @JsProperty(name="whatToShow")
    Number getWhatToShow();

    @JsProperty(name="whatToShow")
    void setWhatToShow(Number value);

    void detach();

    Node nextNode();

    Node previousNode();
}
