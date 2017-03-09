package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\provider_analyzer.d.ts
  * Package ng.core
  * Name ProviderViewContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ProviderViewContext  {
    public CompileDirectiveMetadata component;
    public ParseSourceSpan sourceSpan;
    public JsArray<ProviderError> errors;
    @JsConstructor
    public ProviderViewContext(CompileDirectiveMetadata component,ParseSourceSpan sourceSpan) {}
}
