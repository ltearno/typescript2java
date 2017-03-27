package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MutationRecord
  * Typescript fqn MutationRecord
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MutationRecord {
    @JsProperty(name="addedNodes")
    NodeList getAddedNodes();

    @JsProperty(name="addedNodes")
    void setAddedNodes(NodeList value);

    @JsProperty(name="attributeName")
    String getAttributeName();

    @JsProperty(name="attributeName")
    void setAttributeName(String value);

    @JsProperty(name="attributeNamespace")
    String getAttributeNamespace();

    @JsProperty(name="attributeNamespace")
    void setAttributeNamespace(String value);

    @JsProperty(name="nextSibling")
    Node getNextSibling();

    @JsProperty(name="nextSibling")
    void setNextSibling(Node value);

    @JsProperty(name="oldValue")
    String getOldValue();

    @JsProperty(name="oldValue")
    void setOldValue(String value);

    @JsProperty(name="previousSibling")
    Node getPreviousSibling();

    @JsProperty(name="previousSibling")
    void setPreviousSibling(Node value);

    @JsProperty(name="removedNodes")
    NodeList getRemovedNodes();

    @JsProperty(name="removedNodes")
    void setRemovedNodes(NodeList value);

    @JsProperty(name="target")
    Node getTarget();

    @JsProperty(name="target")
    void setTarget(Node value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);
}
