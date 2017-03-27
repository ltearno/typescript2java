package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IDBIndex
  * Typescript fqn IDBIndex
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IDBIndex {
    @JsProperty(name="keyPath")
    Object /* Union type */ getKeyPath();

    @JsProperty(name="keyPath")
    void setKeyPath(Object /* Union type */ value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="objectStore")
    IDBObjectStore getObjectStore();

    @JsProperty(name="objectStore")
    void setObjectStore(IDBObjectStore value);

    @JsProperty(name="unique")
    boolean getUnique();

    @JsProperty(name="unique")
    void setUnique(boolean value);

    @JsProperty(name="multiEntry")
    boolean getMultiEntry();

    @JsProperty(name="multiEntry")
    void setMultiEntry(boolean value);

    IDBRequest count(Object /* UnionType */ /* optional */ key);

    IDBRequest get(Object /* UnionType */ key);

    IDBRequest getKey(Object /* UnionType */ key);

    IDBRequest openCursor(Object /* UnionType */ /* optional */ range, String /* optional */ direction);

    IDBRequest openKeyCursor(Object /* UnionType */ /* optional */ range, String /* optional */ direction);
}
