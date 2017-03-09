package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\linker\template_ref.d.ts
  * Package ng.core
  * Name TemplateRef
  * Represents an Embedded Template that can be used to instantiate Embedded Views.
  * 
  * You can access a `TemplateRef`, in two ways. Via a directive placed on a `<template>` element (or
  * directive prefixed with `*`) and have the `TemplateRef` for this Embedded View injected into the
  * constructor of the directive using the `TemplateRef` Token. Alternatively you can query for the
  * `TemplateRef` from a Component or a Directive via {@link Query}.
  * 
  * To instantiate Embedded Views based on a Template, use
  * {@link ViewContainerRef#createEmbeddedView}, which will create the View and attach it to the
  * View Container.
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface TemplateRef<C>  {
    @JsProperty(name="elementRef")
    ElementRef elementRef();
    @JsProperty(name="elementRef")
    void elementRef(ElementRef value);
     EmbeddedViewRef<C> createEmbeddedView(C context);
}
