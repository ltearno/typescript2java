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
@JsType( isNative=true, namespace="ng.core", name="DebugDomRootRenderer" )
public class DebugDomRootRendererImpl extends RootRenderer {
    @JsProperty(name="_delegate")
    Object get_delegate();
    @JsProperty(name="_delegate")
    void set_delegate(Object value);
    @JsConstructor
    public DebugDomRootRendererImpl(RootRenderer _delegate) {}
    public native  Renderer renderComponent(RenderComponentType componentProto);
}
