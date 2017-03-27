package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBCursor
  * Typescript fqn IDBCursor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBCursor {
    @JsProperty(name="direction")
    String getDirection();

    @JsProperty(name="direction")
    void setDirection(String value);

    @JsProperty(name="key")
    Object /* Union type */ getKey();

    @JsProperty(name="key")
    void setKey(Object /* Union type */ value);

    @JsProperty(name="primaryKey")
    Object getPrimaryKey();

    @JsProperty(name="primaryKey")
    void setPrimaryKey(Object value);

    @JsProperty(name="source")
    Object /* Union type */ getSource();

    @JsProperty(name="source")
    void setSource(Object /* Union type */ value);

    @JsProperty(name="NEXT")
    String getNEXT();

    @JsProperty(name="NEXT")
    void setNEXT(String value);

    @JsProperty(name="NEXT_NO_DUPLICATE")
    String getNEXT_NO_DUPLICATE();

    @JsProperty(name="NEXT_NO_DUPLICATE")
    void setNEXT_NO_DUPLICATE(String value);

    @JsProperty(name="PREV")
    String getPREV();

    @JsProperty(name="PREV")
    void setPREV(String value);

    @JsProperty(name="PREV_NO_DUPLICATE")
    String getPREV_NO_DUPLICATE();

    @JsProperty(name="PREV_NO_DUPLICATE")
    void setPREV_NO_DUPLICATE(String value);

    void advance(Number count);

    void continue(Object /* UnionType */ /* optional */ key);

    IDBRequest delete();

    IDBRequest update(Object value);
}
