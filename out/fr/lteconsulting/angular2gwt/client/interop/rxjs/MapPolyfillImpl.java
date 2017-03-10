package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\rxjs\util\MapPolyfill.d.ts
  * Package rxjs
  * Name MapPolyfill
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="MapPolyfill" )
public class MapPolyfillImpl  {
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
    public native  Object get(Object key);
    public native  MapPolyfillImpl set(Object key,Object value);
    public native  boolean delete(Object key);
    public native  void clear();
    public native  void forEach(Function cb,Object thisArg);
}
