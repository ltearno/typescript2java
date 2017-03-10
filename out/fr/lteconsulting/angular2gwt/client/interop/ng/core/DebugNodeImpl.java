package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.EventListener;
import ng.core.DebugElement;
import ng.core.DebugNode;
import ng.core.RenderDebugInfo;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\debug\debug_node.d.ts
  * Package ng.core
  * Name DebugNode
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DebugNode" )
public class DebugNodeImpl  {
    @JsProperty(name="_debugInfo")
    Object get_debugInfo();
    @JsProperty(name="_debugInfo")
    void set_debugInfo(Object value);
    @JsProperty(name="nativeNode")
    Object getNativeNode();
    @JsProperty(name="nativeNode")
    void setNativeNode(Object value);
    @JsProperty(name="listeners")
    JsArray<EventListener> getListeners();
    @JsProperty(name="listeners")
    void setListeners(JsArray<EventListener> value);
    @JsProperty(name="parent")
    DebugElement getParent();
    @JsProperty(name="parent")
    void setParent(DebugElement value);
    @JsConstructor
    public DebugNodeImpl(Object nativeNode,DebugNode parent,RenderDebugInfo _debugInfo) {}
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="componentInstance")
    Object getComponentInstance();
    @JsProperty(name="componentInstance")
    void setComponentInstance(Object value);
    @JsProperty(name="context")
    Object getContext();
    @JsProperty(name="context")
    void setContext(Object value);
    @JsProperty(name="references")
    JsTypedObject<String,Object> getReferences();
    @JsProperty(name="references")
    void setReferences(JsTypedObject<String,Object> value);
    @JsProperty(name="providerTokens")
    JsArray<Object> getProviderTokens();
    @JsProperty(name="providerTokens")
    void setProviderTokens(JsArray<Object> value);
    @JsProperty(name="source")
    String getSource();
    @JsProperty(name="source")
    void setSource(String value);
}
