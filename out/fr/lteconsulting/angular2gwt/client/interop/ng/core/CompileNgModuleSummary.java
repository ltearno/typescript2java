package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTypeMetadata;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileIdentifierMetadata;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileNgModuleSummary
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileNgModuleSummary extends CompileTypeSummary {
    @JsProperty(name="type")
    CompileTypeMetadata type();
    @JsProperty(name="type")
    void type(CompileTypeMetadata value);
    @JsProperty(name="exportedDirectives")
    JsArray<CompileIdentifierMetadata> exportedDirectives();
    @JsProperty(name="exportedDirectives")
    void exportedDirectives(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="exportedPipes")
    JsArray<CompileIdentifierMetadata> exportedPipes();
    @JsProperty(name="exportedPipes")
    void exportedPipes(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="entryComponents")
    JsArray<CompileIdentifierMetadata> entryComponents();
    @JsProperty(name="entryComponents")
    void entryComponents(JsArray<CompileIdentifierMetadata> value);
    @JsProperty(name="providers")
    JsArray</* TypeLiteral */ Object> providers();
    @JsProperty(name="providers")
    void providers(JsArray</* TypeLiteral */ Object> value);
    @JsProperty(name="modules")
    JsArray<CompileTypeMetadata> modules();
    @JsProperty(name="modules")
    void modules(JsArray<CompileTypeMetadata> value);
}
