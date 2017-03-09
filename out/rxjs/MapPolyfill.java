package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\rxjs\util\MapPolyfill.d.ts
  * Package rxjs
  * Name MapPolyfill
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class MapPolyfill  {
    public int size;
    public Object _values;
    public Object _keys;
    public native  Object get(Object key);
    public native  MapPolyfill set(Object key,Object value);
    public native  boolean delete(Object key);
    public native  void clear();
    public native  void forEach(Function cb,Object thisArg);
}
