package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.platformBrowser.EventManager;
import ng.platformBrowser.DomSharedStylesHost;
import ng.platformBrowser.AnimationDriver;
import ng.platformBrowser.DomRenderer;
import jsinterop.annotations.JsConstructor;
import ng.core.RenderComponentType;
import ng.core.Renderer;

/**
  * Generated from tests\@angular\platform-browser\src\dom\dom_renderer.d.ts
  * Package ng.platformBrowser
  * Name DomRootRenderer
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="DomRootRenderer" )
public abstract class DomRootRendererImpl extends RootRenderer {
    @JsProperty(name="document")
    Document getDocument();
    @JsProperty(name="document")
    void setDocument(Document value);
    @JsProperty(name="eventManager")
    EventManager getEventManager();
    @JsProperty(name="eventManager")
    void setEventManager(EventManager value);
    @JsProperty(name="sharedStylesHost")
    DomSharedStylesHost getSharedStylesHost();
    @JsProperty(name="sharedStylesHost")
    void setSharedStylesHost(DomSharedStylesHost value);
    @JsProperty(name="animationDriver")
    AnimationDriver getAnimationDriver();
    @JsProperty(name="animationDriver")
    void setAnimationDriver(AnimationDriver value);
    @JsProperty(name="appId")
    String getAppId();
    @JsProperty(name="appId")
    void setAppId(String value);
    @JsProperty(name="registeredComponents")
    Map<String,DomRenderer> getRegisteredComponents();
    @JsProperty(name="registeredComponents")
    void setRegisteredComponents(Map<String,DomRenderer> value);
    @JsConstructor
    public DomRootRendererImpl(Document document,EventManager eventManager,DomSharedStylesHost sharedStylesHost,AnimationDriver animationDriver,String appId) {}
    public native  Renderer renderComponent(RenderComponentType componentProto);
}
