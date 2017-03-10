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
@JsType( isNative=true, namespace="ng.core", name="DebugElement" )
public class DebugElementImpl extends DebugNode {
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
    public DebugElementImpl(Object nativeNode,Object parent,RenderDebugInfo _debugInfo) {}
    public native  void addChild(DebugNode child);
    public native  void removeChild(DebugNode child);
    public native  void insertChildrenAfter(DebugNode child,JsArray<DebugNode> newChildren);
    public native  DebugElement query(Predicate<DebugElement> predicate);
    public native  JsArray<DebugElement> queryAll(Predicate<DebugElement> predicate);
    public native  JsArray<DebugNode> queryAllNodes(Predicate<DebugNode> predicate);
    @JsProperty(name="children")
    JsArray<DebugElement> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<DebugElement> value);
    public native  void triggerEventHandler(String eventName,Object eventObj);
}
