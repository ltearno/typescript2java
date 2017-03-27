package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NamedNodeMap
  * Typescript fqn NamedNodeMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NamedNodeMap {
    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    Attr getNamedItem(String name);

    Attr getNamedItemNS(Object /* UnionType */ namespaceURI, Object /* UnionType */ localName);

    Attr item(Number index);

    Attr removeNamedItem(String name);

    Attr removeNamedItemNS(Object /* UnionType */ namespaceURI, Object /* UnionType */ localName);

    Attr setNamedItem(Attr arg);

    Attr setNamedItemNS(Attr arg);
}
