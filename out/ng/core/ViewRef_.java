package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\view_ref.d.ts
  * Package ng.core
  * Name ViewRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ViewRef_<C> extends EmbeddedViewRef<C> {
    public Object _view;
    public AnimationQueue animationQueue;
    @JsConstructor
    public ViewRef_(AppView<C> _view,AnimationQueue animationQueue) {}
    public AppView<C> internalView;
    public JsArray<Object> rootNodes;
    public C context;
    public boolean destroyed;
    public native  void markForCheck();
    public native  void detach();
    public native  void detectChanges();
    public native  void checkNoChanges();
    public native  void reattach();
    public native  void onDestroy(Function callback);
    public native  void destroy();
}
