package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\linker\view_ref.d.ts
  * Package ng.core
  * Name ViewRef
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewRef" )
public abstract class ViewRefImpl extends ChangeDetectorRef {
    public native  void destroy();
    @JsProperty(name="destroyed")
    boolean getDestroyed();
    @JsProperty(name="destroyed")
    void setDestroyed(boolean value);
    public native  Object onDestroy(Function callback);
}
