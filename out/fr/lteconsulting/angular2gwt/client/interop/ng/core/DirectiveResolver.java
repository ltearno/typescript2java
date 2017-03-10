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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DirectiveResolver  {
    @JsProperty(name="_reflector")
    Object get_reflector();
    @JsProperty(name="_reflector")
    void set_reflector(Object value);
    @JsConstructor
    public DirectiveResolver(ReflectorReader /* optional */ _reflector) {}
     boolean isDirective(Type<Object> type);
     Directive resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
     void _mergeWithPropertyMetadata();
     void _extractPublicName();
     void _dedupeBindings();
     void _merge();
}
