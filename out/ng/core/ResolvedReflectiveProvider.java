package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;

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
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class ResolvedReflectiveProvider  {
    public ReflectiveKey key;
    public JsArray<ResolvedReflectiveFactory> resolvedFactories;
    public boolean multiProvider;
}
