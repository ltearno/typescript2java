package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name ProviderMeta
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ProviderMeta  {
    @JsProperty(name="token")
    Object getToken();
    @JsProperty(name="token")
    void setToken(Object value);
    @JsProperty(name="useClass")
    Type<Object> getUseClass();
    @JsProperty(name="useClass")
    void setUseClass(Type<Object> value);
    @JsProperty(name="useValue")
    Object getUseValue();
    @JsProperty(name="useValue")
    void setUseValue(Object value);
    @JsProperty(name="useExisting")
    Object getUseExisting();
    @JsProperty(name="useExisting")
    void setUseExisting(Object value);
    @JsProperty(name="useFactory")
    Function getUseFactory();
    @JsProperty(name="useFactory")
    void setUseFactory(Function value);
    @JsProperty(name="dependencies")
    JsArray<Object> getDependencies();
    @JsProperty(name="dependencies")
    void setDependencies(JsArray<Object> value);
    @JsProperty(name="multi")
    boolean getMulti();
    @JsProperty(name="multi")
    void setMulti(boolean value);
    @JsConstructor
    public ProviderMeta(Object token,/* TypeLiteral */ Object undefined) {}
}
