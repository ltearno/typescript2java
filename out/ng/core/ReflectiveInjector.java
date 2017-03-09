package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
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
@JsType( isNative=true, namespace="ng.core" )
public interface ReflectiveInjector extends Injector {
     JsArray<ResolvedReflectiveProvider> resolve(JsArray</* NO SYMBOL */Provider> providers);
     ReflectiveInjector resolveAndCreate(JsArray</* NO SYMBOL */Provider> providers,Injector /* optional */ parent);
     ReflectiveInjector fromResolvedProviders(JsArray<ResolvedReflectiveProvider> providers,Injector /* optional */ parent);
    @JsProperty(name="parent")
    Injector parent();
    @JsProperty(name="parent")
    void parent(Injector value);
     ReflectiveInjector resolveAndCreateChild(JsArray</* NO SYMBOL */Provider> providers);
     ReflectiveInjector createChildFromResolved(JsArray<ResolvedReflectiveProvider> providers);
     Object resolveAndInstantiate(/* NO SYMBOL */Provider provider);
     Object instantiateResolved(ResolvedReflectiveProvider provider);
     Object get(Object token,Object /* optional */ notFoundValue);
}
