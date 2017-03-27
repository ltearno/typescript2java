package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TypedPropertyDescriptor
  * Typescript fqn TypedPropertyDescriptor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TypedPropertyDescriptor<T> {
    /* optional property enumerable*/    @JsProperty(name="enumerable")
    boolean getEnumerable();

    @JsProperty(name="enumerable")
    void setEnumerable(boolean value);

    /* optional property configurable*/    @JsProperty(name="configurable")
    boolean getConfigurable();

    @JsProperty(name="configurable")
    void setConfigurable(boolean value);

    /* optional property writable*/    @JsProperty(name="writable")
    boolean getWritable();

    @JsProperty(name="writable")
    void setWritable(boolean value);

    /* optional property value*/    @JsProperty(name="value")
    T getValue();

    @JsProperty(name="value")
    void setValue(T value);

    /* optional property get*/    @JsProperty(name="get")
    JsFunction<T> getGet();

    @JsProperty(name="get")
    void setGet(JsFunction<T> value);

    /* optional property set*/    @JsProperty(name="set")
    JsFunction1<T,Void> getSet();

    @JsProperty(name="set")
    void setSet(JsFunction1<T,Void> value);
}
