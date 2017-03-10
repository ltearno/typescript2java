package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\errors.d.ts
  * Package ng.core
  * Name ExpressionChangedAfterItHasBeenCheckedError
  * An error thrown if application changes model breaking the top-down data flow.
  * 
  * This exception is only thrown in dev mode.
  * 
  * <!-- TODO: Add a link once the dev mode option is configurable -->
  * 
  * ### Example
  * 
  * ```typescript
  **/
@JsType( isNative=true, namespace="ng.core", name="ExpressionChangedAfterItHasBeenCheckedError" )
public class ExpressionChangedAfterItHasBeenCheckedErrorImpl extends BaseError {
    @JsConstructor
    public ExpressionChangedAfterItHasBeenCheckedErrorImpl(Object oldValue,Object currValue) {}
}
