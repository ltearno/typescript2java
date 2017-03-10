package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ElementRef;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import ng.core.ViewRef;
import ng.core.ChangeDetectorRef;
import ng.core.Type;

/**
  * Generated from tests\@angular\core\src\linker\component_factory.d.ts
  * Package ng.core
  * Name ComponentRef
  * Represents an instance of a Component created via a {@link ComponentFactory}.
  * 
  * `ComponentRef` provides access to the Component Instance as well other objects related to this
  * Component Instance and allows you to destroy the Component Instance via the {@link #destroy}
  * method.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ComponentRef<C>  {
    @JsProperty(name="location")
    ElementRef getLocation();
    @JsProperty(name="location")
    void setLocation(ElementRef value);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="instance")
    C getInstance();
    @JsProperty(name="instance")
    void setInstance(C value);
    @JsProperty(name="hostView")
    ViewRef getHostView();
    @JsProperty(name="hostView")
    void setHostView(ViewRef value);
    @JsProperty(name="changeDetectorRef")
    ChangeDetectorRef getChangeDetectorRef();
    @JsProperty(name="changeDetectorRef")
    void setChangeDetectorRef(ChangeDetectorRef value);
    @JsProperty(name="componentType")
    Type<Object> getComponentType();
    @JsProperty(name="componentType")
    void setComponentType(Type<Object> value);
     void destroy();
     void onDestroy(Function callback);
}
