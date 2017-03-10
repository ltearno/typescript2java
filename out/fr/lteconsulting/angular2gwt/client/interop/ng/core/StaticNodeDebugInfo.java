package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\debug_context.d.ts
  * Package ng.core
  * Name StaticNodeDebugInfo
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StaticNodeDebugInfo  {
    @JsProperty(name="providerTokens")
    JsArray<Object> getProviderTokens();
    @JsProperty(name="providerTokens")
    void setProviderTokens(JsArray<Object> value);
    @JsProperty(name="componentToken")
    Object getComponentToken();
    @JsProperty(name="componentToken")
    void setComponentToken(Object value);
    @JsProperty(name="refTokens")
    JsTypedObject<String,Object> getRefTokens();
    @JsProperty(name="refTokens")
    void setRefTokens(JsTypedObject<String,Object> value);
    @JsConstructor
    public StaticNodeDebugInfo(JsArray<Object> providerTokens,Object componentToken,JsTypedObject<String,Object> refTokens) {}
}
