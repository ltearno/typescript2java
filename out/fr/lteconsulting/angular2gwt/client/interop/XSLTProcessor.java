package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name XSLTProcessor
  * Typescript fqn XSLTProcessor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface XSLTProcessor {
    void clearParameters();

    Object getParameter(String namespaceURI, String localName);

    void importStylesheet(Node style);

    void removeParameter(String namespaceURI, String localName);

    void reset();

    void setParameter(String namespaceURI, String localName, Object value);

    Document transformToDocument(Node source);

    DocumentFragment transformToFragment(Node source, Document document);
}
