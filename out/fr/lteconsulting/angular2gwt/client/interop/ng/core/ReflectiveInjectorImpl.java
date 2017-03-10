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
@JsType( isNative=true, namespace="ng.core", name="ReflectiveInjector" )
public abstract class ReflectiveInjectorImpl extends Injector {
    public static native  JsArray<ResolvedReflectiveProvider> resolve(JsArray</* NO SYMBOL */Provider> providers);
    public static native  ReflectiveInjector resolveAndCreate(JsArray</* NO SYMBOL */Provider> providers,Injector /* optional */ parent);
    public static native  ReflectiveInjector fromResolvedProviders(JsArray<ResolvedReflectiveProvider> providers,Injector /* optional */ parent);
    @JsProperty(name="parent")
    Injector getParent();
    @JsProperty(name="parent")
    void setParent(Injector value);
    public native  ReflectiveInjector resolveAndCreateChild(JsArray</* NO SYMBOL */Provider> providers);
    public native  ReflectiveInjector createChildFromResolved(JsArray<ResolvedReflectiveProvider> providers);
    public native  Object resolveAndInstantiate(/* NO SYMBOL */Provider provider);
    public native  Object instantiateResolved(ResolvedReflectiveProvider provider);
    public native  Object get(Object token,Object /* optional */ notFoundValue);
}
