package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\testing\test_bed.d.ts
  * Package ng.core
  * Name TestBed
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TestBed extends Injector {
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
    public Object _instantiated;
    public Object _compiler;
    public Object _moduleRef;
    public Object _moduleWithComponentFactories;
    public Object _compilerOptions;
    public Object _moduleOverrides;
    public Object _componentOverrides;
    public Object _directiveOverrides;
    public Object _pipeOverrides;
    public Object _providers;
    public Object _declarations;
    public Object _imports;
    public Object _schemas;
    public Object _activeFixtures;
    public native  void initTestEnvironment(Type<Object> ngModule,PlatformRef platform);
    public native  void resetTestEnvironment();
    public native  void resetTestingModule();
    public PlatformRef platform;
    public Type<Object> ngModule;
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
