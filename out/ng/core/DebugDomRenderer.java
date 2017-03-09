package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\debug\debug_renderer.d.ts
  * Package ng.core
  * Name DebugDomRenderer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DebugDomRenderer  {
    public Object _delegate;
    @JsConstructor
    public DebugDomRenderer(Renderer _delegate) {}
    public native  Object selectRootElement(Object /* UnionType */ selectorOrNode,RenderDebugInfo /* optional */ debugInfo);
    public native  Object createElement(Object parentElement,String name,RenderDebugInfo /* optional */ debugInfo);
    public native  Object createViewRoot(Object hostElement);
    public native  Object createTemplateAnchor(Object parentElement,RenderDebugInfo /* optional */ debugInfo);
    public native  Object createText(Object parentElement,String value,RenderDebugInfo /* optional */ debugInfo);
    public native  void projectNodes(Object parentElement,JsArray<Object> nodes);
    public native  void attachViewAfter(Object node,JsArray<Object> viewRootNodes);
    public native  void detachView(JsArray<Object> viewRootNodes);
    public native  void destroyView(Object hostElement,JsArray<Object> viewAllNodes);
    public native  Function listen(Object renderElement,String name,Function callback);
    public native  Function listenGlobal(String target,String name,Function callback);
    public native  void setElementProperty(Object renderElement,String propertyName,Object propertyValue);
    public native  void setElementAttribute(Object renderElement,String attributeName,String attributeValue);
    public native  void setBindingDebugInfo(Object renderElement,String propertyName,String propertyValue);
    public native  void setElementClass(Object renderElement,String className,boolean isAdd);
    public native  void setElementStyle(Object renderElement,String styleName,String styleValue);
    public native  void invokeElementMethod(Object renderElement,String methodName,JsArray<Object> /* optional */ args);
    public native  void setText(Object renderNode,String text);
    public native  AnimationPlayer animate(Object element,AnimationStyles startingStyles,JsArray<AnimationKeyframe> keyframes,int duration,int delay,String easing,JsArray<AnimationPlayer> /* optional */ previousPlayers);
}
