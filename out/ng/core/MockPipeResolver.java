package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\testing\pipe_resolver_mock.d.ts
  * Package ng.core
  * Name MockPipeResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MockPipeResolver extends PipeResolver {
    public Object _injector;
    public Object _pipes;
    @JsConstructor
    public MockPipeResolver(Injector _injector) {}
    public Object _compiler;
    public native  void _clearCacheFor();
    public native  void setPipe(Type<Object> type,Pipe metadata);
    public native  Pipe resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
}
