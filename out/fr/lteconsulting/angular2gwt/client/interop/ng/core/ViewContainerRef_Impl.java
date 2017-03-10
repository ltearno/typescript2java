package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ViewContainer;
import jsinterop.annotations.JsConstructor;
import ng.core.ViewRef;
import ng.core.ElementRef;
import ng.core.Injector;
import ng.core.TemplateRef;
import ng.core.EmbeddedViewRef;
import ng.core.ComponentFactory;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ComponentRef;

/**
  * Generated from tests\@angular\core\src\linker\view_container_ref.d.ts
  * Package ng.core
  * Name ViewContainerRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewContainerRef_" )
public class ViewContainerRef_Impl extends ViewContainerRef {
    @JsProperty(name="_element")
    Object get_element();
    @JsProperty(name="_element")
    void set_element(Object value);
    @JsConstructor
    public ViewContainerRef_Impl(ViewContainer _element) {}
    public native  ViewRef get(int index);
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
    @JsProperty(name="element")
    ElementRef getElement();
    @JsProperty(name="element")
    void setElement(ElementRef value);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="parentInjector")
    Injector getParentInjector();
    @JsProperty(name="parentInjector")
    void setParentInjector(Injector value);
    public native <C> EmbeddedViewRef<C> createEmbeddedView(TemplateRef<C> templateRef,C /* optional */ context,int /* optional */ index);
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory,int /* optional */ index,Injector /* optional */ injector,JsArray<JsArray<Object>> /* optional */ projectableNodes);
    public native  ViewRef insert(ViewRef viewRef,int /* optional */ index);
    public native  ViewRef move(ViewRef viewRef,int currentIndex);
    public native  int indexOf(ViewRef viewRef);
    public native  void remove(int /* optional */ index);
    public native  ViewRef detach(int /* optional */ index);
    public native  void clear();
}
