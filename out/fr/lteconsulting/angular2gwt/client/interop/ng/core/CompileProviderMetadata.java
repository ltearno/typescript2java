package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTokenMetadata;
import jsinterop.annotations.JsProperty;
import ng.core.CompileTypeMetadata;
import ng.core.CompileFactoryMetadata;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileDiDependencyMetadata;

/**
  * Generated from tests\@angular\compiler\src\compile_metadata.d.ts
  * Package ng.core
  * Name CompileProviderMetadata
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileProviderMetadata  {
    @JsProperty(name="token")
    CompileTokenMetadata token();
    @JsProperty(name="token")
    void token(CompileTokenMetadata value);
    /* optional property useClass*/    @JsProperty(name="useClass")
    CompileTypeMetadata useClass();
    @JsProperty(name="useClass")
    void useClass(CompileTypeMetadata value);
    /* optional property useValue*/    @JsProperty(name="useValue")
    Object useValue();
    @JsProperty(name="useValue")
    void useValue(Object value);
    /* optional property useExisting*/    @JsProperty(name="useExisting")
    CompileTokenMetadata useExisting();
    @JsProperty(name="useExisting")
    void useExisting(CompileTokenMetadata value);
    /* optional property useFactory*/    @JsProperty(name="useFactory")
    CompileFactoryMetadata useFactory();
    @JsProperty(name="useFactory")
    void useFactory(CompileFactoryMetadata value);
    /* optional property deps*/    @JsProperty(name="deps")
    JsArray<CompileDiDependencyMetadata> deps();
    @JsProperty(name="deps")
    void deps(JsArray<CompileDiDependencyMetadata> value);
    /* optional property multi*/    @JsProperty(name="multi")
    boolean multi();
    @JsProperty(name="multi")
    void multi(boolean value);
}
