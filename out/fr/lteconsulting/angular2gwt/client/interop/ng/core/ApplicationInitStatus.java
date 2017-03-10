package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\application_init.d.ts
  * Package ng.core
  * Name ApplicationInitStatus
  * A class that reflects the state of running {@link APP_INITIALIZER}s.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ApplicationInitStatus  {
    @JsProperty(name="_donePromise")
    Object get_donePromise();
    @JsProperty(name="_donePromise")
    void set_donePromise(Object value);
    @JsProperty(name="_done")
    Object get_done();
    @JsProperty(name="_done")
    void set_done(Object value);
    @JsConstructor
    public ApplicationInitStatus(JsArray<JsFunction<Object>> appInits) {}
    @JsProperty(name="done")
    boolean getDone();
    @JsProperty(name="done")
    void setDone(boolean value);
    @JsProperty(name="donePromise")
    Promise<Object> getDonePromise();
    @JsProperty(name="donePromise")
    void setDonePromise(Promise<Object> value);
}
