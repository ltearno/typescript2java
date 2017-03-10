package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Injector;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\render\api.d.ts
  * Package ng.core
  * Name RenderDebugInfo
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="RenderDebugInfo" )
public abstract class RenderDebugInfoImpl  {
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="component")
    Object getComponent();
    @JsProperty(name="component")
    void setComponent(Object value);
    @JsProperty(name="providerTokens")
    JsArray<Object> getProviderTokens();
    @JsProperty(name="providerTokens")
    void setProviderTokens(JsArray<Object> value);
    @JsProperty(name="references")
    JsTypedObject<String,Object> getReferences();
    @JsProperty(name="references")
    void setReferences(JsTypedObject<String,Object> value);
    @JsProperty(name="context")
    Object getContext();
    @JsProperty(name="context")
    void setContext(Object value);
    @JsProperty(name="source")
    String getSource();
    @JsProperty(name="source")
    void setSource(String value);
}
