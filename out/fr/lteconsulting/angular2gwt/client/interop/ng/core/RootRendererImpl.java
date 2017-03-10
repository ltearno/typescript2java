package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.RenderComponentType;
import ng.core.Renderer;

/**
  * Generated from tests\@angular\core\src\render\api.d.ts
  * Package ng.core
  * Name RootRenderer
  * Injectable service that provides a low-level interface for modifying the UI.
  * 
  * Use this service to bypass Angular's templating and make custom UI changes that can't be
  * expressed declaratively. For example if you need to set a property or an attribute whose name is
  * not statically known, use {@link #setElementProperty} or {@link #setElementAttribute}
  * respectively.
  * 
  * If you are implementing a custom renderer, you must implement this interface.
  * 
  * The default Renderer implementation is `DomRenderer`. Also available is `WebWorkerRenderer`.
  **/
@JsType( isNative=true, namespace="ng.core", name="RootRenderer" )
public abstract class RootRendererImpl  {
    public native  Renderer renderComponent(RenderComponentType componentType);
}
