package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\view_container_ref.d.ts
  * Package ng.core
  * Name ViewContainerRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ViewContainerRef_ extends ViewContainerRef {
    public Object _element;
    @JsConstructor
    public ViewContainerRef_(ViewContainer _element) {}
    public native  ViewRef get(int index);
    public int length;
    public ElementRef element;
    public Injector injector;
    public Injector parentInjector;
    public native <C> EmbeddedViewRef<C> createEmbeddedView(TemplateRef<C> templateRef,C /* optional */ context,int /* optional */ index);
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory,int /* optional */ index,Injector /* optional */ injector,JsArray<JsArray<Object>> /* optional */ projectableNodes);
    public native  ViewRef insert(ViewRef viewRef,int /* optional */ index);
    public native  ViewRef move(ViewRef viewRef,int currentIndex);
    public native  int indexOf(ViewRef viewRef);
    public native  void remove(int /* optional */ index);
    public native  ViewRef detach(int /* optional */ index);
    public native  void clear();
}
