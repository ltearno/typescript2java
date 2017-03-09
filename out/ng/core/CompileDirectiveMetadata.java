package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileDirectiveMetadata
  * Metadata regarding compilation of a directive.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileDirectiveMetadata  {
    public static native  CompileDirectiveMetadata create(/* TypeLiteral */ Object /* optional */ undefined);
    public boolean isHost;
    public CompileTypeMetadata type;
    public boolean isComponent;
    public String selector;
    public String exportAs;
    public /* ng.core.ChangeDetectionStrategy */ int changeDetection;
    public JsTypedObject<String,String> inputs;
    public JsTypedObject<String,String> outputs;
    public JsTypedObject<String,String> hostListeners;
    public JsTypedObject<String,String> hostProperties;
    public JsTypedObject<String,String> hostAttributes;
    public JsArray<CompileProviderMetadata> providers;
    public JsArray<CompileProviderMetadata> viewProviders;
    public JsArray<CompileQueryMetadata> queries;
    public JsArray<CompileQueryMetadata> viewQueries;
    public JsArray<CompileIdentifierMetadata> entryComponents;
    public CompileTemplateMetadata template;
    @JsConstructor
    public CompileDirectiveMetadata(/* TypeLiteral */ Object /* optional */ undefined) {}
    public native  CompileDirectiveSummary toSummary();
}
