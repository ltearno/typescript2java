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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PipeResolver  {
    @JsProperty(name="_reflector")
    Object get_reflector();
    @JsProperty(name="_reflector")
    void set_reflector(Object value);
    @JsConstructor
    public PipeResolver(ReflectorReader /* optional */ _reflector) {}
     boolean isPipe(Type<Object> type);
     Pipe resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
}
