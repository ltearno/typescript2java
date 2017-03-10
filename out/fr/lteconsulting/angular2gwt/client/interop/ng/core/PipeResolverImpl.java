package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ReflectorReader;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.Pipe;

/**
  * Generated from tests\@angular\compiler\src\pipe_resolver.d.ts
  * Package ng.core
  * Name PipeResolver
  * Resolve a `Type` for {@link Pipe}.
  * 
  * This interface can be overridden by the application developer to create custom behavior.
  * 
  * See {@link Compiler}
  **/
@JsType( isNative=true, namespace="ng.core", name="PipeResolver" )
public class PipeResolverImpl  {
    @JsProperty(name="_reflector")
    Object get_reflector();
    @JsProperty(name="_reflector")
    void set_reflector(Object value);
    @JsConstructor
    public PipeResolverImpl(ReflectorReader /* optional */ _reflector) {}
    public native  boolean isPipe(Type<Object> type);
    public native  Pipe resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
}
