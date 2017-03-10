package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.RootRenderer;
import jsinterop.annotations.JsConstructor;
import ng.core.RenderComponentType;
import ng.core.Renderer;

/**
  * Generated from tests\@angular\core\src\debug\debug_renderer.d.ts
  * Package ng.core
  * Name DebugDomRootRenderer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DebugDomRootRenderer extends RootRenderer {
    @JsProperty(name="_delegate")
    Object get_delegate();
    @JsProperty(name="_delegate")
    void set_delegate(Object value);
    @JsConstructor
    public DebugDomRootRenderer(RootRenderer _delegate) {}
     Renderer renderComponent(RenderComponentType componentProto);
}
