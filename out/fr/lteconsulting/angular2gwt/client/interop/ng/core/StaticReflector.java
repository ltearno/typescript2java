package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.StaticSymbolResolver;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import ng.core.StaticSymbol;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\aot\static_reflector.d.ts
  * Package ng.core
  * Name StaticReflector
  * A static reflector implements enough of the Reflector API that is necessary to compile
  * templates statically.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StaticReflector extends ReflectorReader {
    @JsProperty(name="symbolResolver")
    Object getSymbolResolver();
    @JsProperty(name="symbolResolver")
    void setSymbolResolver(Object value);
    @JsProperty(name="errorRecorder")
    Object getErrorRecorder();
    @JsProperty(name="errorRecorder")
    void setErrorRecorder(Object value);
    @JsProperty(name="annotationCache")
    Object getAnnotationCache();
    @JsProperty(name="annotationCache")
    void setAnnotationCache(Object value);
    @JsProperty(name="propertyCache")
    Object getPropertyCache();
    @JsProperty(name="propertyCache")
    void setPropertyCache(Object value);
    @JsProperty(name="parameterCache")
    Object getParameterCache();
    @JsProperty(name="parameterCache")
    void setParameterCache(Object value);
    @JsProperty(name="methodCache")
    Object getMethodCache();
    @JsProperty(name="methodCache")
    void setMethodCache(Object value);
    @JsProperty(name="conversionMap")
    Object getConversionMap();
    @JsProperty(name="conversionMap")
    void setConversionMap(Object value);
    @JsProperty(name="opaqueToken")
    Object getOpaqueToken();
    @JsProperty(name="opaqueToken")
    void setOpaqueToken(Object value);
    @JsConstructor
    public StaticReflector(StaticSymbolResolver symbolResolver,JsArray</* TypeLiteral */ Object> /* optional */ knownMetadataClasses,JsArray</* TypeLiteral */ Object> /* optional */ knownMetadataFunctions,JsFunction2<Object,String,Void> /* optional */ errorRecorder) {}
     String importUri(StaticSymbol typeOrFunc);
     StaticSymbol resolveIdentifier(String name,String moduleUrl);
     StaticSymbol findDeclaration(String moduleUrl,String name,String /* optional */ containingFile);
     StaticSymbol findSymbolDeclaration(StaticSymbol symbol);
     Object resolveEnum(Object enumIdentifier,String name);
     JsArray<Object> annotations(StaticSymbol type);
     JsTypedObject<String,JsArray<Object>> propMetadata(StaticSymbol type);
     JsArray<Object> parameters(StaticSymbol type);
     void _methodNames();
     boolean hasLifecycleHook(Object type,String lcProperty);
     void _registerDecoratorOrConstructor();
     void _registerFunction();
     void initializeConversionMap();
     StaticSymbol getStaticSymbol(String declarationFile,String name,JsArray<String> /* optional */ members);
     void reportError(UNKNOWN_TYPE_NAME_QuestionToken path);
     void getTypeMetadata();
}
