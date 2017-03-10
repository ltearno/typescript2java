package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\facade\async.d.ts
  * Package ng.forms
  * Name EventEmitter
  * Use by directives and components to emit custom Events.
  * 
  * ### Examples
  * 
  * In the following example, `Zippy` alternatively emits `open` and `close` events when its
  * title gets clicked:
  * 
  * ```
  **/
@JsType( isNative=true, namespace="ng.forms", name="EventEmitter" )
public class EventEmitterImpl<T> extends Subject<T> {
    @JsProperty(name="___isAsync")
    boolean get___isAsync();
    @JsProperty(name="___isAsync")
    void set___isAsync(boolean value);
    @JsConstructor
    public EventEmitterImpl(boolean /* optional */ isAsync) {}
    public native  void emit(T /* optional */ value);
    public native  Object subscribe(Object /* optional */ generatorOrNext,Object /* optional */ error,Object /* optional */ complete);
}
