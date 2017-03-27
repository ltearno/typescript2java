package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DOMImplementation
  * Typescript fqn DOMImplementation
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DOMImplementation {
    Document createDocument(Object /* UnionType */ namespaceURI, Object /* UnionType */ qualifiedName, DocumentType doctype);

    DocumentType createDocumentType(String qualifiedName, String publicId, String systemId);

    Document createHTMLDocument(String title);

    boolean hasFeature();
}
