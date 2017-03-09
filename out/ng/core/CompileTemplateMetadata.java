package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileTemplateMetadata
  * Metadata regarding compilation of a template.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileTemplateMetadata  {
    public /* ng.core.ViewEncapsulation */ int encapsulation;
    public String template;
    public String templateUrl;
    public JsArray<String> styles;
    public JsArray<String> styleUrls;
    public JsArray<CompileStylesheetMetadata> externalStylesheets;
    public JsArray<CompileAnimationEntryMetadata> animations;
    public JsArray<String> ngContentSelectors;
    public JsArray<String> /* Tuple [String, String] */ interpolation;
    @JsConstructor
    public CompileTemplateMetadata(/* TypeLiteral */ Object /* optional */ undefined) {}
    public native  CompileTemplateSummary toSummary();
}
