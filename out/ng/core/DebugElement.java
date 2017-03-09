package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\debug\debug_node.d.ts
  * Package ng.core
  * Name DebugElement
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DebugElement extends DebugNode {
    public String name;
    public JsTypedObject<String,Object> properties;
    public JsTypedObject<String,String> attributes;
    public JsTypedObject<String,Boolean> classes;
    public JsTypedObject<String,String> styles;
    public JsArray<DebugNode> childNodes;
    public Object nativeElement;
    @JsConstructor
    public DebugElement(Object nativeNode,Object parent,RenderDebugInfo _debugInfo) {}
    public native  void addChild(DebugNode child);
    public native  void removeChild(DebugNode child);
    public native  void insertChildrenAfter(DebugNode child,JsArray<DebugNode> newChildren);
    public native  DebugElement query(Predicate<DebugElement> predicate);
    public native  JsArray<DebugElement> queryAll(Predicate<DebugElement> predicate);
    public native  JsArray<DebugNode> queryAllNodes(Predicate<DebugNode> predicate);
    public JsArray<DebugElement> children;
    public native  void triggerEventHandler(String eventName,Object eventObj);
}
