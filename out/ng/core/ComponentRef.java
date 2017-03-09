package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

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
@JsType( isNative=true, namespace="ng.core" )
public interface ComponentRef<C>  {
    @JsProperty(name="location")
    ElementRef location();
    @JsProperty(name="location")
    void location(ElementRef value);
    @JsProperty(name="injector")
    Injector injector();
    @JsProperty(name="injector")
    void injector(Injector value);
    @JsProperty(name="instance")
    C instance();
    @JsProperty(name="instance")
    void instance(C value);
    @JsProperty(name="hostView")
    ViewRef hostView();
    @JsProperty(name="hostView")
    void hostView(ViewRef value);
    @JsProperty(name="changeDetectorRef")
    ChangeDetectorRef changeDetectorRef();
    @JsProperty(name="changeDetectorRef")
    void changeDetectorRef(ChangeDetectorRef value);
    @JsProperty(name="componentType")
    Type<Object> componentType();
    @JsProperty(name="componentType")
    void componentType(Type<Object> value);
     void destroy();
     void onDestroy(Function callback);
}
