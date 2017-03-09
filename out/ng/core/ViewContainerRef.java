package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;

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
@JsType( isNative=true, namespace="ng.core" )
public interface ViewContainerRef  {
    @JsProperty(name="element")
    ElementRef element();
    @JsProperty(name="element")
    void element(ElementRef value);
    @JsProperty(name="injector")
    Injector injector();
    @JsProperty(name="injector")
    void injector(Injector value);
    @JsProperty(name="parentInjector")
    Injector parentInjector();
    @JsProperty(name="parentInjector")
    void parentInjector(Injector value);
     void clear();
     ViewRef get(int index);
    @JsProperty(name="length")
    int length();
    @JsProperty(name="length")
    void length(int value);
    <C> EmbeddedViewRef<C> createEmbeddedView(TemplateRef<C> templateRef,C /* optional */ context,int /* optional */ index);
    <C> ComponentRef<C> createComponent(ComponentFactory<C> componentFactory,int /* optional */ index,Injector /* optional */ injector,JsArray<JsArray<Object>> /* optional */ projectableNodes);
     ViewRef insert(ViewRef viewRef,int /* optional */ index);
     ViewRef move(ViewRef viewRef,int currentIndex);
     int indexOf(ViewRef viewRef);
     void remove(int /* optional */ index);
     ViewRef detach(int /* optional */ index);
}
