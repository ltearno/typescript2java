package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Node
  * Typescript fqn Node
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Node extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="attributes")
    NamedNodeMap getAttributes();

    @JsProperty(name="attributes")
    void setAttributes(NamedNodeMap value);

    @JsProperty(name="baseURI")
    String getBaseURI();

    @JsProperty(name="baseURI")
    void setBaseURI(String value);

    @JsProperty(name="childNodes")
    NodeList getChildNodes();

    @JsProperty(name="childNodes")
    void setChildNodes(NodeList value);

    @JsProperty(name="firstChild")
    Node getFirstChild();

    @JsProperty(name="firstChild")
    void setFirstChild(Node value);

    @JsProperty(name="lastChild")
    Node getLastChild();

    @JsProperty(name="lastChild")
    void setLastChild(Node value);

    @JsProperty(name="localName")
    String getLocalName();

    @JsProperty(name="localName")
    void setLocalName(String value);

    @JsProperty(name="namespaceURI")
    String getNamespaceURI();

    @JsProperty(name="namespaceURI")
    void setNamespaceURI(String value);

    @JsProperty(name="nextSibling")
    Node getNextSibling();

    @JsProperty(name="nextSibling")
    void setNextSibling(Node value);

    @JsProperty(name="nodeName")
    String getNodeName();

    @JsProperty(name="nodeName")
    void setNodeName(String value);

    @JsProperty(name="nodeType")
    Number getNodeType();

    @JsProperty(name="nodeType")
    void setNodeType(Number value);

    @JsProperty(name="nodeValue")
    String getNodeValue();

    @JsProperty(name="nodeValue")
    void setNodeValue(String value);

    @JsProperty(name="ownerDocument")
    Document getOwnerDocument();

    @JsProperty(name="ownerDocument")
    void setOwnerDocument(Document value);

    @JsProperty(name="parentElement")
    HTMLElement getParentElement();

    @JsProperty(name="parentElement")
    void setParentElement(HTMLElement value);

    @JsProperty(name="parentNode")
    Node getParentNode();

    @JsProperty(name="parentNode")
    void setParentNode(Node value);

    @JsProperty(name="previousSibling")
    Node getPreviousSibling();

    @JsProperty(name="previousSibling")
    void setPreviousSibling(Node value);

    @JsProperty(name="textContent")
    String getTextContent();

    @JsProperty(name="textContent")
    void setTextContent(String value);

    @JsProperty(name="ATTRIBUTE_NODE")
    Number getATTRIBUTE_NODE();

    @JsProperty(name="ATTRIBUTE_NODE")
    void setATTRIBUTE_NODE(Number value);

    @JsProperty(name="CDATA_SECTION_NODE")
    Number getCDATA_SECTION_NODE();

    @JsProperty(name="CDATA_SECTION_NODE")
    void setCDATA_SECTION_NODE(Number value);

    @JsProperty(name="COMMENT_NODE")
    Number getCOMMENT_NODE();

    @JsProperty(name="COMMENT_NODE")
    void setCOMMENT_NODE(Number value);

    @JsProperty(name="DOCUMENT_FRAGMENT_NODE")
    Number getDOCUMENT_FRAGMENT_NODE();

    @JsProperty(name="DOCUMENT_FRAGMENT_NODE")
    void setDOCUMENT_FRAGMENT_NODE(Number value);

    @JsProperty(name="DOCUMENT_NODE")
    Number getDOCUMENT_NODE();

    @JsProperty(name="DOCUMENT_NODE")
    void setDOCUMENT_NODE(Number value);

    @JsProperty(name="DOCUMENT_POSITION_CONTAINED_BY")
    Number getDOCUMENT_POSITION_CONTAINED_BY();

    @JsProperty(name="DOCUMENT_POSITION_CONTAINED_BY")
    void setDOCUMENT_POSITION_CONTAINED_BY(Number value);

    @JsProperty(name="DOCUMENT_POSITION_CONTAINS")
    Number getDOCUMENT_POSITION_CONTAINS();

    @JsProperty(name="DOCUMENT_POSITION_CONTAINS")
    void setDOCUMENT_POSITION_CONTAINS(Number value);

    @JsProperty(name="DOCUMENT_POSITION_DISCONNECTED")
    Number getDOCUMENT_POSITION_DISCONNECTED();

    @JsProperty(name="DOCUMENT_POSITION_DISCONNECTED")
    void setDOCUMENT_POSITION_DISCONNECTED(Number value);

    @JsProperty(name="DOCUMENT_POSITION_FOLLOWING")
    Number getDOCUMENT_POSITION_FOLLOWING();

    @JsProperty(name="DOCUMENT_POSITION_FOLLOWING")
    void setDOCUMENT_POSITION_FOLLOWING(Number value);

    @JsProperty(name="DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    Number getDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC();

    @JsProperty(name="DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC")
    void setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(Number value);

    @JsProperty(name="DOCUMENT_POSITION_PRECEDING")
    Number getDOCUMENT_POSITION_PRECEDING();

    @JsProperty(name="DOCUMENT_POSITION_PRECEDING")
    void setDOCUMENT_POSITION_PRECEDING(Number value);

    @JsProperty(name="DOCUMENT_TYPE_NODE")
    Number getDOCUMENT_TYPE_NODE();

    @JsProperty(name="DOCUMENT_TYPE_NODE")
    void setDOCUMENT_TYPE_NODE(Number value);

    @JsProperty(name="ELEMENT_NODE")
    Number getELEMENT_NODE();

    @JsProperty(name="ELEMENT_NODE")
    void setELEMENT_NODE(Number value);

    @JsProperty(name="ENTITY_NODE")
    Number getENTITY_NODE();

    @JsProperty(name="ENTITY_NODE")
    void setENTITY_NODE(Number value);

    @JsProperty(name="ENTITY_REFERENCE_NODE")
    Number getENTITY_REFERENCE_NODE();

    @JsProperty(name="ENTITY_REFERENCE_NODE")
    void setENTITY_REFERENCE_NODE(Number value);

    @JsProperty(name="NOTATION_NODE")
    Number getNOTATION_NODE();

    @JsProperty(name="NOTATION_NODE")
    void setNOTATION_NODE(Number value);

    @JsProperty(name="PROCESSING_INSTRUCTION_NODE")
    Number getPROCESSING_INSTRUCTION_NODE();

    @JsProperty(name="PROCESSING_INSTRUCTION_NODE")
    void setPROCESSING_INSTRUCTION_NODE(Number value);

    @JsProperty(name="TEXT_NODE")
    Number getTEXT_NODE();

    @JsProperty(name="TEXT_NODE")
    void setTEXT_NODE(Number value);

    <T> T appendChild(T newChild);

    Node cloneNode(boolean /* optional */ deep);

    Number compareDocumentPosition(Node other);

    boolean contains(Node child);

    boolean hasAttributes();

    boolean hasChildNodes();

    Node insertBefore(Node newChild, Object /* UnionType */ refChild);

    boolean isDefaultNamespace(Object /* UnionType */ namespaceURI);

    boolean isEqualNode(Node arg);

    boolean isSameNode(Node other);

    Object /* UnionType */ lookupNamespaceURI(Object /* UnionType */ prefix);

    Object /* UnionType */ lookupPrefix(Object /* UnionType */ namespaceURI);

    void normalize();

    Node removeChild(Node oldChild);

    Node replaceChild(Node newChild, Node oldChild);
}
