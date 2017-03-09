package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\linker\view_ref.d.ts
  * Package ng.core
  * Name ViewRef
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface ViewRef extends ChangeDetectorRef {
     void destroy();
    @JsProperty(name="destroyed")
    boolean destroyed();
    @JsProperty(name="destroyed")
    void destroyed(boolean value);
     Object onDestroy(Function callback);
}
