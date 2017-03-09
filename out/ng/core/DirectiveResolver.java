package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\directive_resolver.d.ts
  * Package ng.core
  * Name DirectiveResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DirectiveResolver  {
    public Object _reflector;
    @JsConstructor
    public DirectiveResolver(ReflectorReader /* optional */ _reflector) {}
    public native  boolean isDirective(Type<Object> type);
    public native  Directive resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
    public native  void _mergeWithPropertyMetadata();
    public native  void _extractPublicName();
    public native  void _dedupeBindings();
    public native  void _merge();
}
