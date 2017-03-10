package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.RenderDebugInfo;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationStyles;
import ng.core.AnimationKeyframe;
import ng.core.AnimationPlayer;

/**
  * Generated from tests\@angular\core\src\render\api.d.ts
  * Package ng.core
  * Name Renderer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Renderer  {
     Object selectRootElement(Object /* UnionType */ selectorOrNode,RenderDebugInfo /* optional */ debugInfo);
     Object createElement(Object parentElement,String name,RenderDebugInfo /* optional */ debugInfo);
     Object createViewRoot(Object hostElement);
     Object createTemplateAnchor(Object parentElement,RenderDebugInfo /* optional */ debugInfo);
     Object createText(Object parentElement,String value,RenderDebugInfo /* optional */ debugInfo);
     void projectNodes(Object parentElement,JsArray<Object> nodes);
     void attachViewAfter(Object node,JsArray<Object> viewRootNodes);
     void detachView(JsArray<Object> viewRootNodes);
     void destroyView(Object hostElement,JsArray<Object> viewAllNodes);
     Function listen(Object renderElement,String name,Function callback);
     Function listenGlobal(String target,String name,Function callback);
     void setElementProperty(Object renderElement,String propertyName,Object propertyValue);
     void setElementAttribute(Object renderElement,String attributeName,String attributeValue);
     void setBindingDebugInfo(Object renderElement,String propertyName,String propertyValue);
     void setElementClass(Object renderElement,String className,boolean isAdd);
     void setElementStyle(Object renderElement,String styleName,String styleValue);
     void invokeElementMethod(Object renderElement,String methodName,JsArray<Object> /* optional */ args);
     void setText(Object renderNode,String text);
     AnimationPlayer animate(Object element,AnimationStyles startingStyles,JsArray<AnimationKeyframe> keyframes,int duration,int delay,String easing,JsArray<AnimationPlayer> /* optional */ previousPlayers);
}
