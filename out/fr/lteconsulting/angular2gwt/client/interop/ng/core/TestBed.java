package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import ng.core.PlatformRef;
import ng.core.TestBed;
import ng.core.NgModule;
import ng.core.Component;
import ng.core.Directive;
import ng.core.Pipe;
import ng.core.ComponentFixture;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\testing\test_bed.d.ts
  * Package ng.core
  * Name TestBed
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TestBed extends Injector {
    @JsProperty(name="_instantiated")
    Object get_instantiated();
    @JsProperty(name="_instantiated")
    void set_instantiated(Object value);
    @JsProperty(name="_compiler")
    Object get_compiler();
    @JsProperty(name="_compiler")
    void set_compiler(Object value);
    @JsProperty(name="_moduleRef")
    Object get_moduleRef();
    @JsProperty(name="_moduleRef")
    void set_moduleRef(Object value);
    @JsProperty(name="_moduleWithComponentFactories")
    Object get_moduleWithComponentFactories();
    @JsProperty(name="_moduleWithComponentFactories")
    void set_moduleWithComponentFactories(Object value);
    @JsProperty(name="_compilerOptions")
    Object get_compilerOptions();
    @JsProperty(name="_compilerOptions")
    void set_compilerOptions(Object value);
    @JsProperty(name="_moduleOverrides")
    Object get_moduleOverrides();
    @JsProperty(name="_moduleOverrides")
    void set_moduleOverrides(Object value);
    @JsProperty(name="_componentOverrides")
    Object get_componentOverrides();
    @JsProperty(name="_componentOverrides")
    void set_componentOverrides(Object value);
    @JsProperty(name="_directiveOverrides")
    Object get_directiveOverrides();
    @JsProperty(name="_directiveOverrides")
    void set_directiveOverrides(Object value);
    @JsProperty(name="_pipeOverrides")
    Object get_pipeOverrides();
    @JsProperty(name="_pipeOverrides")
    void set_pipeOverrides(Object value);
    @JsProperty(name="_providers")
    Object get_providers();
    @JsProperty(name="_providers")
    void set_providers(Object value);
    @JsProperty(name="_declarations")
    Object get_declarations();
    @JsProperty(name="_declarations")
    void set_declarations(Object value);
    @JsProperty(name="_imports")
    Object get_imports();
    @JsProperty(name="_imports")
    void set_imports(Object value);
    @JsProperty(name="_schemas")
    Object get_schemas();
    @JsProperty(name="_schemas")
    void set_schemas(Object value);
    @JsProperty(name="_activeFixtures")
    Object get_activeFixtures();
    @JsProperty(name="_activeFixtures")
    void set_activeFixtures(Object value);
     void initTestEnvironment(Type<Object> ngModule,PlatformRef platform);
     void resetTestEnvironment();
     void resetTestingModule();
    @JsProperty(name="platform")
    PlatformRef getPlatform();
    @JsProperty(name="platform")
    void setPlatform(PlatformRef value);
    @JsProperty(name="ngModule")
    Type<Object> getNgModule();
    @JsProperty(name="ngModule")
    void setNgModule(Type<Object> value);
     void configureCompiler(/* TypeLiteral */ Object config);
     void configureTestingModule(TestModuleMetadata moduleDef);
     Promise<Object> compileComponents();
     void _initIfNeeded();
     void _createCompilerAndModule();
     void _assertNotInstantiated();
     Object get(Object token,Object /* optional */ notFoundValue);
     Object execute(JsArray<Object> tokens,Function fn,Object /* optional */ context);
     void overrideModule(Type<Object> ngModule,MetadataOverride<NgModule> override);
     void overrideComponent(Type<Object> component,MetadataOverride<Component> override);
     void overrideDirective(Type<Object> directive,MetadataOverride<Directive> override);
     void overridePipe(Type<Object> pipe,MetadataOverride<Pipe> override);
    <T> ComponentFixture<T> createComponent(Type<T> component);
}
