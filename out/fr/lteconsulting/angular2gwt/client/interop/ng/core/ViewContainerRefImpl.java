package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ElementRef;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import ng.core.ViewRef;
import ng.core.TemplateRef;
import ng.core.EmbeddedViewRef;
import ng.core.ComponentFactory;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ComponentRef;

/**
  * Generated from tests\@angular\core\src\linker\view_container_ref.d.ts
  * Package ng.core
  * Name ViewContainerRef
  * Represents a container where one or more Views can be attached.
  * 
  * The container can contain two kinds of Views. Host Views, created by instantiating a
  * {@link Component} via {@link #createComponent}, and Embedded Views, created by instantiating an
  * {@link TemplateRef Embedded Template} via {@link #createEmbeddedView}.
  * 
  * The location of the View Container within the containing View is specified by the Anchor
  * `element`. Each View Container can have only one Anchor Element and each Anchor Element can only
  * have a single View Container.
  * 
  * Root elements of Views attached to this container become siblings of the Anchor Element in
  * the Rendered View.
  * 
  * To access a `ViewContainerRef` of an Element, you can either place a {@link Directive} injected
  * with `ViewContainerRef` on the Element, or you obtain it via a {@link ViewChild} query.
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewContainerRef" )
public abstract class ViewContainerRefImpl  {
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
    public native  void clear();
    public native  ViewRef get(int index);
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
    public native <C> EmbeddedViewRef<C> createEmbeddedView(TemplateRef<C> templateRef,C /* optional */ context,int /* optional */ index);
    public native <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory,int /* optional */ index,Injector /* optional */ injector,JsArray<JsArray<Object>> /* optional */ projectableNodes);
    public native  ViewRef insert(ViewRef viewRef,int /* optional */ index);
    public native  ViewRef move(ViewRef viewRef,int currentIndex);
    public native  int indexOf(ViewRef viewRef);
    public native  void remove(int /* optional */ index);
    public native  ViewRef detach(int /* optional */ index);
}
