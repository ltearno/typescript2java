package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\rxjs\util\MapPolyfill.d.ts
  * Package rxjs
  * Name MapPolyfill
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MapPolyfill  {
    @JsProperty(name="size")
    int getSize();
    @JsProperty(name="size")
    void setSize(int value);
    @JsProperty(name="_values")
    Object get_values();
    @JsProperty(name="_values")
    void set_values(Object value);
    @JsProperty(name="_keys")
    Object get_keys();
    @JsProperty(name="_keys")
    void set_keys(Object value);
     Object get(Object key);
     MapPolyfill set(Object key,Object value);
     boolean delete(Object key);
     void clear();
     void forEach(Function cb,Object thisArg);
}
