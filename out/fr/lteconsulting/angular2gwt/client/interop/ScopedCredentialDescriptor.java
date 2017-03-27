package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ScopedCredentialDescriptor
  * Typescript fqn ScopedCredentialDescriptor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ScopedCredentialDescriptor {
    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property id*/    @JsProperty(name="id")
    Object getId();

    @JsProperty(name="id")
    void setId(Object value);

    /* optional property transports*/    @JsProperty(name="transports")
    Array<String> getTransports();

    @JsProperty(name="transports")
    void setTransports(Array<String> value);
}
