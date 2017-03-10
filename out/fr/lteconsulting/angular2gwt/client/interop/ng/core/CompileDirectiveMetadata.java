package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileDirectiveMetadata;
import jsinterop.annotations.JsProperty;
import ng.core.CompileTypeMetadata;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileProviderMetadata;
import ng.core.CompileQueryMetadata;
import ng.core.CompileIdentifierMetadata;
import ng.core.CompileTemplateMetadata;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveSummary;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileDirectiveMetadata
  * Metadata regarding compilation of a directive.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileDirectiveMetadata  {
    @JsProperty(name="isHost")
    boolean getIsHost();
    @JsProperty(name="isHost")
    void setIsHost(boolean value);
    @JsProperty(name="type")
    CompileTypeMetadata getType();
    @JsProperty(name="type")
    void setType(CompileTypeMetadata value);
    @JsProperty(name="isComponent")
    boolean getIsComponent();
    @JsProperty(name="isComponent")
    void setIsComponent(boolean value);
    @JsProperty(name="selector")
    String getSelector();
    @JsProperty(name="selector")
    void setSelector(String value);
    @JsProperty(name="exportAs")
    String getExportAs();
    @JsProperty(name="exportAs")
    void setExportAs(String value);
    @JsProperty(name="changeDetection")
    /* ng.core.ChangeDetectionStrategy */ int getChangeDetection();
    @JsProperty(name="changeDetection")
    void setChangeDetection(/* ng.core.ChangeDetectionStrategy */ int value);
    @JsProperty(name="inputs")
    JsTypedObject<String,String> getInputs();
    @JsProperty(name="inputs")
    void setInputs(JsTypedObject<String,String> value);
    @JsProperty(name="outputs")
    JsTypedObject<String,String> getOutputs();
    @JsProperty(name="outputs")
    void setOutputs(JsTypedObject<String,String> value);
    @JsProperty(name="hostListeners")
    JsTypedObject<String,String> getHostListeners();
    @JsProperty(name="hostListeners")
    void setHostListeners(JsTypedObject<String,String> value);
    @JsProperty(name="hostProperties")
    JsTypedObject<String,String> getHostProperties();
    @JsProperty(name="hostProperties")
    void setHostProperties(JsTypedObject<String,String> value);
    @JsProperty(name="hostAttributes")
    JsTypedObject<String,String> getHostAttributes();
    @JsProperty(name="hostAttributes")
    void setHostAttributes(JsTypedObject<String,String> value);
    @JsProperty(name="providers")
    JsArray<CompileProviderMetadata> getProviders();
    @JsProperty(name="providers")
    void setProviders(JsArray<CompileProviderMetadata> value);
    @JsProperty(name="viewProviders")
    JsArray<CompileProviderMetadata> getViewProviders();
    @JsProperty(name="viewProviders")
    void setViewProviders(JsArray<CompileProviderMetadata> value);
    @JsProperty(name="queries")
    JsArray<CompileQueryMetadata> getQueries();
    @JsProperty(name="queries")
    void setQueries(JsArray<CompileQueryMetadata> value);
    @JsProperty(name="viewQueries")
    JsArray<CompileQueryMetadata> getViewQueries();
    @JsProperty(name="viewQueries")
    void setViewQueries(JsArray<CompileQueryMetadata> value);
    @JsProperty(name="entryComponents")
    JsArray<CompileIdentifierMetadata> getEntryComponents();
    @JsProperty(name="entryComponents")
    void setEntryComponents(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="template")
    CompileTemplateMetadata getTemplate();
    @JsProperty(name="template")
    void setTemplate(CompileTemplateMetadata value);
    @JsConstructor
    public CompileDirectiveMetadata(/* TypeLiteral */ Object /* optional */ undefined) {}
     CompileDirectiveSummary toSummary();
}
