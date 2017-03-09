package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.RenderComponentType;
import ng.core.Renderer;

/**
  * Generated from tests\@angular\platform-browser\src\dom\dom_renderer.d.ts
  * Package ng.platformBrowser
  * Name DomRootRenderer
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public interface DomRootRenderer extends RootRenderer {
    @JsProperty(name="document")
    Document document();
    @JsProperty(name="document")
    void document(Document value);
    @JsProperty(name="eventManager")
    EventManager eventManager();
    @JsProperty(name="eventManager")
    void eventManager(EventManager value);
    @JsProperty(name="sharedStylesHost")
    DomSharedStylesHost sharedStylesHost();
    @JsProperty(name="sharedStylesHost")
    void sharedStylesHost(DomSharedStylesHost value);
    @JsProperty(name="animationDriver")
    AnimationDriver animationDriver();
    @JsProperty(name="animationDriver")
    void animationDriver(AnimationDriver value);
    @JsProperty(name="appId")
    String appId();
    @JsProperty(name="appId")
    void appId(String value);
    @JsProperty(name="registeredComponents")
    Map<String,DomRenderer> registeredComponents();
    @JsProperty(name="registeredComponents")
    void registeredComponents(Map<String,DomRenderer> value);
    @JsConstructor
    public DomRootRenderer(Document document,EventManager eventManager,DomSharedStylesHost sharedStylesHost,AnimationDriver animationDriver,String appId) {}
     Renderer renderComponent(RenderComponentType componentProto);
}
