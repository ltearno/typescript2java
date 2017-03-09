package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileDirectiveSummary
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class CompileDirectiveSummary extends CompileTypeSummary {
    public CompileTypeMetadata type;
    public boolean isComponent;
    public String selector;
    public String exportAs;
    public JsTypedObject<String,String> inputs;
    public JsTypedObject<String,String> outputs;
    public JsTypedObject<String,String> hostListeners;
    public JsTypedObject<String,String> hostProperties;
    public JsTypedObject<String,String> hostAttributes;
    public JsArray<CompileProviderMetadata> providers;
    public JsArray<CompileProviderMetadata> viewProviders;
    public JsArray<CompileQueryMetadata> queries;
    public JsArray<CompileIdentifierMetadata> entryComponents;
    public /* ng.core.ChangeDetectionStrategy */ int changeDetection;
    public CompileTemplateSummary template;
}
