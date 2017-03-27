package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PropertyDescriptor
  * Typescript fqn PropertyDescriptor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PropertyDescriptor {
    /* optional property configurable*/    @JsProperty(name="configurable")
    boolean getConfigurable();

    @JsProperty(name="configurable")
    void setConfigurable(boolean value);

    /* optional property enumerable*/    @JsProperty(name="enumerable")
    boolean getEnumerable();

    @JsProperty(name="enumerable")
    void setEnumerable(boolean value);

    /* optional property value*/    @JsProperty(name="value")
    Object getValue();

    @JsProperty(name="value")
    void setValue(Object value);

    /* optional property writable*/    @JsProperty(name="writable")
    boolean getWritable();

    @JsProperty(name="writable")
    void setWritable(boolean value);

    /* optional */ Object get();

    /* optional */ void set(Object v);
}
