package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ComponentRef;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Type;
import jsinterop.annotations.JsProperty;
import ng.core.ViewRef;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name ApplicationRef
  * A reference to an Angular application running on a page.
  * 
  * For more about Angular applications, see the documentation for {@link bootstrap}.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ApplicationRef  {
    <C> ComponentRef<C> bootstrap(Object /* UnionType */ componentFactory);
     void tick();
    @JsProperty(name="componentTypes")
    JsArray<Type<Object>> getComponentTypes();
    @JsProperty(name="componentTypes")
    void setComponentTypes(JsArray<Type<Object>> value);
    @JsProperty(name="components")
    JsArray<ComponentRef<Object>> getComponents();
    @JsProperty(name="components")
    void setComponents(JsArray<ComponentRef<Object>> value);
     void attachView(ViewRef view);
     void detachView(ViewRef view);
    @JsProperty(name="viewCount")
    int getViewCount();
    @JsProperty(name="viewCount")
    void setViewCount(int value);
}
