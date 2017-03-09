package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

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
@JsType( isNative=true, namespace="ng.core" )
public class PipeResolver  {
    public Object _reflector;
    @JsConstructor
    public PipeResolver(ReflectorReader /* optional */ _reflector) {}
    public native  boolean isPipe(Type<Object> type);
    public native  Pipe resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
}
