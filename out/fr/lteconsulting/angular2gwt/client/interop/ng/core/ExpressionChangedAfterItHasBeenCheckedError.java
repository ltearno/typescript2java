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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpressionChangedAfterItHasBeenCheckedError extends BaseError {
    @JsConstructor
    public ExpressionChangedAfterItHasBeenCheckedError(Object oldValue,Object currValue) {}
}
