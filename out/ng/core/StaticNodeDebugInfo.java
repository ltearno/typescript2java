package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\debug_context.d.ts
  * Package ng.core
  * Name StaticNodeDebugInfo
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StaticNodeDebugInfo  {
    public JsArray<Object> providerTokens;
    public Object componentToken;
    public JsTypedObject<String,Object> refTokens;
    @JsConstructor
    public StaticNodeDebugInfo(JsArray<Object> providerTokens,Object componentToken,JsTypedObject<String,Object> refTokens) {}
}
