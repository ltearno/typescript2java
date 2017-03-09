package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\testing\directive_resolver_mock.d.ts
  * Package ng.core
  * Name MockDirectiveResolver
  * An implementation of {@link DirectiveResolver} that allows overriding
  * various properties of directives.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MockDirectiveResolver extends DirectiveResolver {
    public Object _injector;
    public Object _directives;
    public Object _providerOverrides;
    public Object _viewProviderOverrides;
    public Object _views;
    public Object _inlineTemplates;
    public Object _animations;
    @JsConstructor
    public MockDirectiveResolver(Injector _injector) {}
    public Object _compiler;
    public native  void _clearCacheFor();
    public native  Directive resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
    public native  void setDirective(Type<Object> type,Directive metadata);
    public native  void setProvidersOverride(Type<Object> type,JsArray</* NO SYMBOL */Provider> providers);
    public native  void setViewProvidersOverride(Type<Object> type,JsArray</* NO SYMBOL */Provider> viewProviders);
    public native  void setView(Type<Object> component,ViewMetadata view);
    public native  void setInlineTemplate(Type<Object> component,String template);
    public native  void setAnimations(Type<Object> component,JsArray<AnimationEntryMetadata> animations);
}
