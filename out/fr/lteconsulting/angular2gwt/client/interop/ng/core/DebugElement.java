package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.DebugNode;
import ng.core.RenderDebugInfo;
import jsinterop.annotations.JsConstructor;
import ng.core.Predicate;
import ng.core.DebugElement;

/**
  * Generated from tests\@angular\core\src\debug\debug_node.d.ts
  * Package ng.core
  * Name DebugElement
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DebugElement extends DebugNode {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="properties")
    JsTypedObject<String,Object> getProperties();
    @JsProperty(name="properties")
    void setProperties(JsTypedObject<String,Object> value);
    @JsProperty(name="attributes")
    JsTypedObject<String,String> getAttributes();
    @JsProperty(name="attributes")
    void setAttributes(JsTypedObject<String,String> value);
    @JsProperty(name="classes")
    JsTypedObject<String,Boolean> getClasses();
    @JsProperty(name="classes")
    void setClasses(JsTypedObject<String,Boolean> value);
    @JsProperty(name="styles")
    JsTypedObject<String,String> getStyles();
    @JsProperty(name="styles")
    void setStyles(JsTypedObject<String,String> value);
    @JsProperty(name="childNodes")
    JsArray<DebugNode> getChildNodes();
    @JsProperty(name="childNodes")
    void setChildNodes(JsArray<DebugNode> value);
    @JsProperty(name="nativeElement")
    Object getNativeElement();
    @JsProperty(name="nativeElement")
    void setNativeElement(Object value);
    @JsConstructor
    public DebugElement(Object nativeNode,Object parent,RenderDebugInfo _debugInfo) {}
     void addChild(DebugNode child);
     void removeChild(DebugNode child);
     void insertChildrenAfter(DebugNode child,JsArray<DebugNode> newChildren);
     DebugElement query(Predicate<DebugElement> predicate);
     JsArray<DebugElement> queryAll(Predicate<DebugElement> predicate);
     JsArray<DebugNode> queryAllNodes(Predicate<DebugNode> predicate);
    @JsProperty(name="children")
    JsArray<DebugElement> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<DebugElement> value);
     void triggerEventHandler(String eventName,Object eventObj);
}
