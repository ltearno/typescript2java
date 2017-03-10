package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ReflectorReader;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.Directive;

/**
  * Generated from tests\@angular\compiler\src\directive_resolver.d.ts
  * Package ng.core
  * Name DirectiveResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DirectiveResolver" )
public class DirectiveResolverImpl  {
    @JsProperty(name="_reflector")
    Object get_reflector();
    @JsProperty(name="_reflector")
    void set_reflector(Object value);
    @JsConstructor
    public DirectiveResolverImpl(ReflectorReader /* optional */ _reflector) {}
    public native  boolean isDirective(Type<Object> type);
    public native  Directive resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
    public native  void _mergeWithPropertyMetadata();
    public native  void _extractPublicName();
    public native  void _dedupeBindings();
    public native  void _merge();
}
