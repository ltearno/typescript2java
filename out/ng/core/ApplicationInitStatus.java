package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\application_init.d.ts
  * Package ng.core
  * Name ApplicationInitStatus
  * A class that reflects the state of running {@link APP_INITIALIZER}s.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ApplicationInitStatus  {
    public Object _donePromise;
    public Object _done;
    @JsConstructor
    public ApplicationInitStatus(JsArray<JsFunction<Object>> appInits) {}
    public boolean done;
    public Promise<Object> donePromise;
}
