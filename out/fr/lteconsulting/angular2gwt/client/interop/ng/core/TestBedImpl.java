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
@JsType( isNative=true, namespace="ng.core", name="TestBed" )
public class TestBedImpl extends Injector {
    public static native  TestBed initTestEnvironment(Type<Object> ngModule,PlatformRef platform);
    public static native  void resetTestEnvironment();
    public static native  void resetTestingModule();
    public static native  void configureCompiler(/* TypeLiteral */ Object config);
    public static native  void configureTestingModule(TestModuleMetadata moduleDef);
    public static native  Promise<Object> compileComponents();
    public static native  void overrideModule(Type<Object> ngModule,MetadataOverride<NgModule> override);
    public static native  void overrideComponent(Type<Object> component,MetadataOverride<Component> override);
    public static native  void overrideDirective(Type<Object> directive,MetadataOverride<Directive> override);
    public static native  void overridePipe(Type<Object> pipe,MetadataOverride<Pipe> override);
    public static native  Object get(Object token,Object /* optional */ notFoundValue);
    public static native <T> ComponentFixture<T> createComponent(Type<T> component);
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
    public native  void initTestEnvironment(Type<Object> ngModule,PlatformRef platform);
    public native  void resetTestEnvironment();
    public native  void resetTestingModule();
    @JsProperty(name="platform")
    PlatformRef getPlatform();
    @JsProperty(name="platform")
    void setPlatform(PlatformRef value);
    @JsProperty(name="ngModule")
    Type<Object> getNgModule();
    @JsProperty(name="ngModule")
    void setNgModule(Type<Object> value);
    public native  void configureCompiler(/* TypeLiteral */ Object config);
    public native  void configureTestingModule(TestModuleMetadata moduleDef);
    public native  Promise<Object> compileComponents();
    public native  void _initIfNeeded();
    public native  void _createCompilerAndModule();
    public native  void _assertNotInstantiated();
    public native  Object get(Object token,Object /* optional */ notFoundValue);
    public native  Object execute(JsArray<Object> tokens,Function fn,Object /* optional */ context);
    public native  void overrideModule(Type<Object> ngModule,MetadataOverride<NgModule> override);
    public native  void overrideComponent(Type<Object> component,MetadataOverride<Component> override);
    public native  void overrideDirective(Type<Object> directive,MetadataOverride<Directive> override);
    public native  void overridePipe(Type<Object> pipe,MetadataOverride<Pipe> override);
    public native <T> ComponentFixture<T> createComponent(Type<T> component);
}
