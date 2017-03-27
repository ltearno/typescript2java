package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBObjectStore
  * Typescript fqn IDBObjectStore
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBObjectStore {
    @JsProperty(name="indexNames")
    DOMStringList getIndexNames();

    @JsProperty(name="indexNames")
    void setIndexNames(DOMStringList value);

    @JsProperty(name="keyPath")
    Object /* Union type */ getKeyPath();

    @JsProperty(name="keyPath")
    void setKeyPath(Object /* Union type */ value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="transaction")
    IDBTransaction getTransaction();

    @JsProperty(name="transaction")
    void setTransaction(IDBTransaction value);

    @JsProperty(name="autoIncrement")
    boolean getAutoIncrement();

    @JsProperty(name="autoIncrement")
    void setAutoIncrement(boolean value);

    IDBRequest add(Object value, Object /* UnionType */ /* optional */ key);

    IDBRequest clear();

    IDBRequest count(Object /* UnionType */ /* optional */ key);

    IDBIndex createIndex(String name, Object /* UnionType */ keyPath, IDBIndexParameters /* optional */ optionalParameters);

    IDBRequest delete(Object /* UnionType */ key);

    void deleteIndex(String indexName);

    IDBRequest get(Object key);

    IDBIndex index(String name);

    IDBRequest openCursor(Object /* UnionType */ /* optional */ range, String /* optional */ direction);

    IDBRequest put(Object value, Object /* UnionType */ /* optional */ key);
}
