package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\util\UnsubscriptionError.d.ts
  * Package rxjs
  * Name UnsubscriptionError
  * An error thrown when one or more errors have occurred during the
  * `unsubscribe` of a {@link Subscription}.
  **/
@JsType( isNative=true, namespace="rxjs", name="UnsubscriptionError" )
public class UnsubscriptionErrorImpl extends Error {
    @JsProperty(name="errors")
    JsArray<Object> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<Object> value);
    @JsConstructor
    public UnsubscriptionErrorImpl(JsArray<Object> errors) {}
}
