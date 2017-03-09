package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\debug\debug_node.d.ts
  * Package ng.core
  * Name DebugNode
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DebugNode  {
    public Object _debugInfo;
    public Object nativeNode;
    public JsArray<EventListener> listeners;
    public DebugElement parent;
    @JsConstructor
    public DebugNode(Object nativeNode,DebugNode parent,RenderDebugInfo _debugInfo) {}
    public Injector injector;
    public Object componentInstance;
    public Object context;
    public JsTypedObject<String,Object> references;
    public JsArray<Object> providerTokens;
    public String source;
}
