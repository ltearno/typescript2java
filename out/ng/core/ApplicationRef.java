package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name ApplicationRef
  * A reference to an Angular application running on a page.
  * 
  * For more about Angular applications, see the documentation for {@link bootstrap}.
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface ApplicationRef  {
    <C> ComponentRef<C> bootstrap(Object /* UnionType */ componentFactory);
     void tick();
    @JsProperty(name="componentTypes")
    JsArray<Type<Object>> componentTypes();
    @JsProperty(name="componentTypes")
    void componentTypes(JsArray<Type<Object>> value);
    @JsProperty(name="components")
    JsArray<ComponentRef<Object>> components();
    @JsProperty(name="components")
    void components(JsArray<ComponentRef<Object>> value);
     void attachView(ViewRef view);
     void detachView(ViewRef view);
    @JsProperty(name="viewCount")
    int viewCount();
    @JsProperty(name="viewCount")
    void viewCount(int value);
}
