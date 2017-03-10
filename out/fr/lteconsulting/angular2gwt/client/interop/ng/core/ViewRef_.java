package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationQueue;
import ng.core.AppView;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\view_ref.d.ts
  * Package ng.core
  * Name ViewRef_
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ViewRef_<C> extends EmbeddedViewRef<C> {
    @JsProperty(name="_view")
    Object get_view();
    @JsProperty(name="_view")
    void set_view(Object value);
    @JsProperty(name="animationQueue")
    AnimationQueue getAnimationQueue();
    @JsProperty(name="animationQueue")
    void setAnimationQueue(AnimationQueue value);
    @JsConstructor
    public ViewRef_(AppView<C> _view,AnimationQueue animationQueue) {}
    @JsProperty(name="internalView")
    AppView<C> getInternalView();
    @JsProperty(name="internalView")
    void setInternalView(AppView<C> value);
    @JsProperty(name="rootNodes")
    JsArray<Object> getRootNodes();
    @JsProperty(name="rootNodes")
    void setRootNodes(JsArray<Object> value);
    @JsProperty(name="context")
    C getContext();
    @JsProperty(name="context")
    void setContext(C value);
    @JsProperty(name="destroyed")
    boolean getDestroyed();
    @JsProperty(name="destroyed")
    void setDestroyed(boolean value);
     void markForCheck();
     void detach();
     void detectChanges();
     void checkNoChanges();
     void reattach();
     void onDestroy(Function callback);
     void destroy();
}
