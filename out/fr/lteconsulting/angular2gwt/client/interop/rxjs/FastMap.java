package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.FastMap;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\rxjs\util\FastMap.d.ts
  * Package rxjs
  * Name FastMap
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FastMap  {
    @JsProperty(name="values")
    Object getValues();
    @JsProperty(name="values")
    void setValues(Object value);
     boolean delete(String key);
     FastMap set(String key,Object value);
     Object get(String key);
     void forEach(JsFunction2<Object,Object,Void> cb,Object /* optional */ thisArg);
     void clear();
}
