package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\debug\debug_renderer.d.ts
  * Package ng.core
  * Name DebugDomRootRenderer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DebugDomRootRenderer extends RootRenderer {
    public Object _delegate;
    @JsConstructor
    public DebugDomRootRenderer(RootRenderer _delegate) {}
    public native  Renderer renderComponent(RenderComponentType componentProto);
}
