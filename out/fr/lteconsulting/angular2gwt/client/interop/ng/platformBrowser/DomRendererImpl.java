package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.DirectRenderer;
import ng.platformBrowser.DomRootRenderer;
import ng.core.RenderComponentType;
import ng.platformBrowser.AnimationDriver;
import jsinterop.annotations.JsConstructor;
import ng.core.RenderDebugInfo;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationStyles;
import ng.core.AnimationKeyframe;
import ng.core.AnimationPlayer;

/**
  * Generated from tests\@angular\platform-browser\src\dom\dom_renderer.d.ts
  * Package ng.platformBrowser
  * Name DomRenderer
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="DomRenderer" )
public class DomRendererImpl extends Renderer {
    @JsProperty(name="_rootRenderer")
    Object get_rootRenderer();
    @JsProperty(name="_rootRenderer")
    void set_rootRenderer(Object value);
    @JsProperty(name="componentProto")
    Object getComponentProto();
    @JsProperty(name="componentProto")
    void setComponentProto(Object value);
    @JsProperty(name="_animationDriver")
    Object get_animationDriver();
    @JsProperty(name="_animationDriver")
    void set_animationDriver(Object value);
    @JsProperty(name="_contentAttr")
    Object get_contentAttr();
    @JsProperty(name="_contentAttr")
    void set_contentAttr(Object value);
    @JsProperty(name="_hostAttr")
    Object get_hostAttr();
    @JsProperty(name="_hostAttr")
    void set_hostAttr(Object value);
    @JsProperty(name="_styles")
    Object get_styles();
    @JsProperty(name="_styles")
    void set_styles(Object value);
    @JsProperty(name="directRenderer")
    DirectRenderer getDirectRenderer();
    @JsProperty(name="directRenderer")
    void setDirectRenderer(DirectRenderer value);
    @JsConstructor
    public DomRendererImpl(DomRootRenderer _rootRenderer,RenderComponentType componentProto,AnimationDriver _animationDriver,String styleShimId) {}
    public native  Element selectRootElement(Object /* UnionType */ selectorOrNode,RenderDebugInfo debugInfo);
    public native  Element createElement(Object /* UnionType */ parent,String name,RenderDebugInfo debugInfo);
    public native  Object /* UnionType */ createViewRoot(Element hostElement);
    public native  Comment createTemplateAnchor(Object /* UnionType */ parentElement,RenderDebugInfo debugInfo);
    public native  Object createText(Object /* UnionType */ parentElement,String value,RenderDebugInfo debugInfo);
    public native  void projectNodes(Object /* UnionType */ parentElement,JsArray<Node> nodes);
    public native  void attachViewAfter(Node node,JsArray<Node> viewRootNodes);
    public native  void detachView(JsArray<Object /* UnionType */> viewRootNodes);
    public native  void destroyView(Object /* UnionType */ hostElement,JsArray<Node> viewAllNodes);
    public native  Function listen(Object renderElement,String name,Function callback);
    public native  Function listenGlobal(String target,String name,Function callback);
    public native  void setElementProperty(Object /* UnionType */ renderElement,String propertyName,Object propertyValue);
    public native  void setElementAttribute(Element renderElement,String attributeName,String attributeValue);
    public native  void setBindingDebugInfo(Element renderElement,String propertyName,String propertyValue);
    public native  void setElementClass(Element renderElement,String className,boolean isAdd);
    public native  void setElementStyle(HTMLElement renderElement,String styleName,String styleValue);
    public native  void invokeElementMethod(Element renderElement,String methodName,JsArray<Object> args);
    public native  void setText(Text renderNode,String text);
    public native  AnimationPlayer animate(Object element,AnimationStyles startingStyles,JsArray<AnimationKeyframe> keyframes,int duration,int delay,String easing,JsArray<AnimationPlayer> /* optional */ previousPlayers);
}
