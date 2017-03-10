package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReflectiveKey;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ResolvedReflectiveFactory;

/**
  * Generated from tests\@angular\core\src\di\reflective_provider.d.ts
  * Package ng.core
  * Name ResolvedReflectiveProvider
  * An internal resolved representation of a {@link Provider} used by the {@link Injector}.
  * 
  * It is usually created automatically by `Injector.resolveAndCreate`.
  * 
  * It can be created manually, as follows:
  * 
  * ### Example ([live demo](http://plnkr.co/edit/RfEnhh8kUEI0G3qsnIeT?p%3Dpreview&p=preview))
  * 
  * ```typescript
  * var resolvedProviders = Injector.resolve([{ provide: 'message', useValue: 'Hello' }]);
  * var injector = Injector.fromResolvedProviders(resolvedProviders);
  * 
  * expect(injector.get('message')).toEqual('Hello');
  * ```
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ResolvedReflectiveProvider  {
    @JsProperty(name="key")
    ReflectiveKey key();
    @JsProperty(name="key")
    void key(ReflectiveKey value);
    @JsProperty(name="resolvedFactories")
    JsArray<ResolvedReflectiveFactory> resolvedFactories();
    @JsProperty(name="resolvedFactories")
    void resolvedFactories(JsArray<ResolvedReflectiveFactory> value);
    @JsProperty(name="multiProvider")
    boolean multiProvider();
    @JsProperty(name="multiProvider")
    void multiProvider(boolean value);
}
