package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import ng.core.Directive;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ViewMetadata;
import ng.core.AnimationEntryMetadata;

/**
  * Generated from tests\@angular\compiler\testing\directive_resolver_mock.d.ts
  * Package ng.core
  * Name MockDirectiveResolver
  * An implementation of {@link DirectiveResolver} that allows overriding
  * various properties of directives.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MockDirectiveResolver extends DirectiveResolver {
    @JsProperty(name="_injector")
    Object get_injector();
    @JsProperty(name="_injector")
    void set_injector(Object value);
    @JsProperty(name="_directives")
    Object get_directives();
    @JsProperty(name="_directives")
    void set_directives(Object value);
    @JsProperty(name="_providerOverrides")
    Object get_providerOverrides();
    @JsProperty(name="_providerOverrides")
    void set_providerOverrides(Object value);
    @JsProperty(name="_viewProviderOverrides")
    Object get_viewProviderOverrides();
    @JsProperty(name="_viewProviderOverrides")
    void set_viewProviderOverrides(Object value);
    @JsProperty(name="_views")
    Object get_views();
    @JsProperty(name="_views")
    void set_views(Object value);
    @JsProperty(name="_inlineTemplates")
    Object get_inlineTemplates();
    @JsProperty(name="_inlineTemplates")
    void set_inlineTemplates(Object value);
    @JsProperty(name="_animations")
    Object get_animations();
    @JsProperty(name="_animations")
    void set_animations(Object value);
    @JsConstructor
    public MockDirectiveResolver(Injector _injector) {}
    @JsProperty(name="_compiler")
    Object get_compiler();
    @JsProperty(name="_compiler")
    void set_compiler(Object value);
     void _clearCacheFor();
     Directive resolve(Type<Object> type,boolean /* optional */ throwIfNotFound);
     void setDirective(Type<Object> type,Directive metadata);
     void setProvidersOverride(Type<Object> type,JsArray</* NO SYMBOL */Provider> providers);
     void setViewProvidersOverride(Type<Object> type,JsArray</* NO SYMBOL */Provider> viewProviders);
     void setView(Type<Object> component,ViewMetadata view);
     void setInlineTemplate(Type<Object> component,String template);
     void setAnimations(Type<Object> component,JsArray<AnimationEntryMetadata> animations);
}
