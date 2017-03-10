package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ResolvedReflectiveProvider;
import ng.core.Injector;
import ng.core.ReflectiveInjector;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\di\reflective_injector.d.ts
  * Package ng.core
  * Name ReflectiveInjector
  * A ReflectiveDependency injection container used for instantiating objects and resolving
  * dependencies.
  * 
  * An `Injector` is a replacement for a `new` operator, which can automatically resolve the
  * constructor dependencies.
  * 
  * In typical use, application code asks for the dependencies in the constructor and they are
  * resolved by the `Injector`.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/jzjec0?p=preview))
  * 
  * The following example creates an `Injector` configured to create `Engine` and `Car`.
  * 
  * ```typescript
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReflectiveInjector extends Injector {
    @JsProperty(name="parent")
    Injector getParent();
    @JsProperty(name="parent")
    void setParent(Injector value);
     ReflectiveInjector resolveAndCreateChild(JsArray</* NO SYMBOL */Provider> providers);
     ReflectiveInjector createChildFromResolved(JsArray<ResolvedReflectiveProvider> providers);
     Object resolveAndInstantiate(/* NO SYMBOL */Provider provider);
     Object instantiateResolved(ResolvedReflectiveProvider provider);
     Object get(Object token,Object /* optional */ notFoundValue);
}
