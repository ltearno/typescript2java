package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Range
  * Typescript fqn Range
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Range {
    @JsProperty(name="collapsed")
    boolean getCollapsed();

    @JsProperty(name="collapsed")
    void setCollapsed(boolean value);

    @JsProperty(name="commonAncestorContainer")
    Node getCommonAncestorContainer();

    @JsProperty(name="commonAncestorContainer")
    void setCommonAncestorContainer(Node value);

    @JsProperty(name="endContainer")
    Node getEndContainer();

    @JsProperty(name="endContainer")
    void setEndContainer(Node value);

    @JsProperty(name="endOffset")
    Number getEndOffset();

    @JsProperty(name="endOffset")
    void setEndOffset(Number value);

    @JsProperty(name="startContainer")
    Node getStartContainer();

    @JsProperty(name="startContainer")
    void setStartContainer(Node value);

    @JsProperty(name="startOffset")
    Number getStartOffset();

    @JsProperty(name="startOffset")
    void setStartOffset(Number value);

    @JsProperty(name="END_TO_END")
    Number getEND_TO_END();

    @JsProperty(name="END_TO_END")
    void setEND_TO_END(Number value);

    @JsProperty(name="END_TO_START")
    Number getEND_TO_START();

    @JsProperty(name="END_TO_START")
    void setEND_TO_START(Number value);

    @JsProperty(name="START_TO_END")
    Number getSTART_TO_END();

    @JsProperty(name="START_TO_END")
    void setSTART_TO_END(Number value);

    @JsProperty(name="START_TO_START")
    Number getSTART_TO_START();

    @JsProperty(name="START_TO_START")
    void setSTART_TO_START(Number value);

    DocumentFragment cloneContents();

    Range cloneRange();

    void collapse(boolean toStart);

    Number compareBoundaryPoints(Number how, Range sourceRange);

    DocumentFragment createContextualFragment(String fragment);

    void deleteContents();

    void detach();

    boolean expand(String Unit);

    DocumentFragment extractContents();

    ClientRect getBoundingClientRect();

    ClientRectList getClientRects();

    void insertNode(Node newNode);

    void selectNode(Node refNode);

    void selectNodeContents(Node refNode);

    void setEnd(Node refNode, Number offset);

    void setEndAfter(Node refNode);

    void setEndBefore(Node refNode);

    void setStart(Node refNode, Number offset);

    void setStartAfter(Node refNode);

    void setStartBefore(Node refNode);

    void surroundContents(Node newParent);

    String toString();
}
