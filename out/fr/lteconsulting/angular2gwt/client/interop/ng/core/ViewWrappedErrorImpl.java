package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.DebugContext;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\errors.d.ts
  * Package ng.core
  * Name ViewWrappedError
  * Thrown when an exception was raised during view creation, change detection or destruction.
  * 
  * This error wraps the original exception to attach additional contextual information that can
  * be useful for debugging.
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewWrappedError" )
public class ViewWrappedErrorImpl extends WrappedError {
    @JsProperty(name="context")
    DebugContext getContext();
    @JsProperty(name="context")
    void setContext(DebugContext value);
    @JsConstructor
    public ViewWrappedErrorImpl(Object originalError,DebugContext context) {}
}
