package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileDirectiveMetadata;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ProviderError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\provider_analyzer.d.ts
  * Package ng.core
  * Name ProviderViewContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ProviderViewContext" )
public class ProviderViewContextImpl  {
    @JsProperty(name="component")
    CompileDirectiveMetadata getComponent();
    @JsProperty(name="component")
    void setComponent(CompileDirectiveMetadata value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsProperty(name="errors")
    JsArray<ProviderError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<ProviderError> value);
    @JsConstructor
    public ProviderViewContextImpl(CompileDirectiveMetadata component,ParseSourceSpan sourceSpan) {}
}
