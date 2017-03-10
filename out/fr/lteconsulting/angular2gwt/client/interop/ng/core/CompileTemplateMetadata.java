package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileStylesheetMetadata;
import ng.core.CompileAnimationEntryMetadata;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileTemplateSummary;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileTemplateMetadata
  * Metadata regarding compilation of a template.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileTemplateMetadata  {
    @JsProperty(name="encapsulation")
    /* ng.core.ViewEncapsulation */ int getEncapsulation();
    @JsProperty(name="encapsulation")
    void setEncapsulation(/* ng.core.ViewEncapsulation */ int value);
    @JsProperty(name="template")
    String getTemplate();
    @JsProperty(name="template")
    void setTemplate(String value);
    @JsProperty(name="templateUrl")
    String getTemplateUrl();
    @JsProperty(name="templateUrl")
    void setTemplateUrl(String value);
    @JsProperty(name="styles")
    JsArray<String> getStyles();
    @JsProperty(name="styles")
    void setStyles(JsArray<String> value);
    @JsProperty(name="styleUrls")
    JsArray<String> getStyleUrls();
    @JsProperty(name="styleUrls")
    void setStyleUrls(JsArray<String> value);
    @JsProperty(name="externalStylesheets")
    JsArray<CompileStylesheetMetadata> getExternalStylesheets();
    @JsProperty(name="externalStylesheets")
    void setExternalStylesheets(JsArray<CompileStylesheetMetadata> value);
    @JsProperty(name="animations")
    JsArray<CompileAnimationEntryMetadata> getAnimations();
    @JsProperty(name="animations")
    void setAnimations(JsArray<CompileAnimationEntryMetadata> value);
    @JsProperty(name="ngContentSelectors")
    JsArray<String> getNgContentSelectors();
    @JsProperty(name="ngContentSelectors")
    void setNgContentSelectors(JsArray<String> value);
    @JsProperty(name="interpolation")
    JsArray<String> /* Tuple [String, String] */ getInterpolation();
    @JsProperty(name="interpolation")
    void setInterpolation(JsArray<String> /* Tuple [String, String] */ value);
    @JsConstructor
    public CompileTemplateMetadata(/* TypeLiteral */ Object /* optional */ undefined) {}
     CompileTemplateSummary toSummary();
}
