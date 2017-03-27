package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Selection
  * Typescript fqn Selection
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Selection {
    @JsProperty(name="anchorNode")
    Node getAnchorNode();

    @JsProperty(name="anchorNode")
    void setAnchorNode(Node value);

    @JsProperty(name="anchorOffset")
    Number getAnchorOffset();

    @JsProperty(name="anchorOffset")
    void setAnchorOffset(Number value);

    @JsProperty(name="baseNode")
    Node getBaseNode();

    @JsProperty(name="baseNode")
    void setBaseNode(Node value);

    @JsProperty(name="baseOffset")
    Number getBaseOffset();

    @JsProperty(name="baseOffset")
    void setBaseOffset(Number value);

    @JsProperty(name="extentNode")
    Node getExtentNode();

    @JsProperty(name="extentNode")
    void setExtentNode(Node value);

    @JsProperty(name="extentOffset")
    Number getExtentOffset();

    @JsProperty(name="extentOffset")
    void setExtentOffset(Number value);

    @JsProperty(name="focusNode")
    Node getFocusNode();

    @JsProperty(name="focusNode")
    void setFocusNode(Node value);

    @JsProperty(name="focusOffset")
    Number getFocusOffset();

    @JsProperty(name="focusOffset")
    void setFocusOffset(Number value);

    @JsProperty(name="isCollapsed")
    boolean getIsCollapsed();

    @JsProperty(name="isCollapsed")
    void setIsCollapsed(boolean value);

    @JsProperty(name="rangeCount")
    Number getRangeCount();

    @JsProperty(name="rangeCount")
    void setRangeCount(Number value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    void addRange(Range range);

    void collapse(Node parentNode, Number offset);

    void collapseToEnd();

    void collapseToStart();

    boolean containsNode(Node node, boolean partlyContained);

    void deleteFromDocument();

    void empty();

    void extend(Node newNode, Number offset);

    Range getRangeAt(Number index);

    void removeAllRanges();

    void removeRange(Range range);

    void selectAllChildren(Node parentNode);

    void setBaseAndExtent(Node baseNode, Number baseOffset, Node extentNode, Number extentOffset);

    void setPosition(Node parentNode, Number offset);

    String toString();
}
