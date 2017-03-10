package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompileTypeMetadata;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileTypeSummary
  * A CompileSummary is the data needed to use a directive / pipe / module
  * in other modules / components. However, this data is not enough to compile
  * the directive / module itself.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileTypeSummary  {
    @JsProperty(name="summaryKind")
    /* ng.core.CompileSummaryKind */ int summaryKind();
    @JsProperty(name="summaryKind")
    void summaryKind(/* ng.core.CompileSummaryKind */ int value);
    @JsProperty(name="type")
    CompileTypeMetadata type();
    @JsProperty(name="type")
    void type(CompileTypeMetadata value);
}
