package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.Pipe;

/**
  * Generated from tests\@angular\compiler\testing\pipe_resolver_mock.d.ts
  * Package ng.core
  * Name MockPipeResolver
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MockPipeResolver extends PipeResolver {
    @JsProperty(name="_injector")
    Object get_injector();
    @JsProperty(name="_injector")
    void set_injector(Object value);
    @JsProperty(name="_pipes")
    Object get_pipes();
    @JsProperty(name="_pipes")
    void set_pipes(Object value);
    @JsConstructor
    public MockPipeResolver(Injector _injector) {}
    @JsProperty(name="_compiler")
    Object get_compiler();
    @JsProperty(name="_compiler")
    void set_compiler(Object value);
     void _clearCacheFor();
     void setPipe(Type<Object> type,Pipe metadata);
     Pipe resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
}
