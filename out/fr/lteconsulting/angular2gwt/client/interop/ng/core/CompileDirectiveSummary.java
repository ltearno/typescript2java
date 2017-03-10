package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTypeMetadata;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileProviderMetadata;
import ng.core.CompileQueryMetadata;
import ng.core.CompileIdentifierMetadata;
import ng.core.CompileTemplateSummary;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileDirectiveSummary
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileDirectiveSummary extends CompileTypeSummary {
    @JsProperty(name="type")
    CompileTypeMetadata type();
    @JsProperty(name="type")
    void type(CompileTypeMetadata value);
    @JsProperty(name="isComponent")
    boolean isComponent();
    @JsProperty(name="isComponent")
    void isComponent(boolean value);
    @JsProperty(name="selector")
    String selector();
    @JsProperty(name="selector")
    void selector(String value);
    @JsProperty(name="exportAs")
    String exportAs();
    @JsProperty(name="exportAs")
    void exportAs(String value);
    @JsProperty(name="inputs")
    JsTypedObject<String,String> inputs();
    @JsProperty(name="inputs")
    void inputs(JsTypedObject<String,String> value);
    @JsProperty(name="outputs")
    JsTypedObject<String,String> outputs();
    @JsProperty(name="outputs")
    void outputs(JsTypedObject<String,String> value);
    @JsProperty(name="hostListeners")
    JsTypedObject<String,String> hostListeners();
    @JsProperty(name="hostListeners")
    void hostListeners(JsTypedObject<String,String> value);
    @JsProperty(name="hostProperties")
    JsTypedObject<String,String> hostProperties();
    @JsProperty(name="hostProperties")
    void hostProperties(JsTypedObject<String,String> value);
    @JsProperty(name="hostAttributes")
    JsTypedObject<String,String> hostAttributes();
    @JsProperty(name="hostAttributes")
    void hostAttributes(JsTypedObject<String,String> value);
    @JsProperty(name="providers")
    JsArray<CompileProviderMetadata> providers();
    @JsProperty(name="providers")
    void providers(JsArray<CompileProviderMetadata> value);
    @JsProperty(name="viewProviders")
    JsArray<CompileProviderMetadata> viewProviders();
    @JsProperty(name="viewProviders")
    void viewProviders(JsArray<CompileProviderMetadata> value);
    @JsProperty(name="queries")
    JsArray<CompileQueryMetadata> queries();
    @JsProperty(name="queries")
    void queries(JsArray<CompileQueryMetadata> value);
    @JsProperty(name="entryComponents")
    JsArray<CompileIdentifierMetadata> entryComponents();
    @JsProperty(name="entryComponents")
    void entryComponents(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="changeDetection")
    /* ng.core.ChangeDetectionStrategy */ int changeDetection();
    @JsProperty(name="changeDetection")
    void changeDetection(/* ng.core.ChangeDetectionStrategy */ int value);
    @JsProperty(name="template")
    CompileTemplateSummary template();
    @JsProperty(name="template")
    void template(CompileTemplateSummary value);
}
