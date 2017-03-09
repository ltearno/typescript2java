package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\aot\static_reflector.d.ts
  * Package ng.core
  * Name StaticReflector
  * A static reflector implements enough of the Reflector API that is necessary to compile
  * templates statically.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StaticReflector extends ReflectorReader {
    public Object symbolResolver;
    public Object errorRecorder;
    public Object annotationCache;
    public Object propertyCache;
    public Object parameterCache;
    public Object methodCache;
    public Object conversionMap;
    public Object opaqueToken;
    @JsConstructor
    public StaticReflector(StaticSymbolResolver symbolResolver,JsArray</* TypeLiteral */ Object> /* optional */ knownMetadataClasses,JsArray</* TypeLiteral */ Object> /* optional */ knownMetadataFunctions,JsFunction2<Object,String,Void> /* optional */ errorRecorder) {}
    public native  String importUri(StaticSymbol typeOrFunc);
    public native  StaticSymbol resolveIdentifier(String name,String moduleUrl);
    public native  StaticSymbol findDeclaration(String moduleUrl,String name,String /* optional */ containingFile);
    public native  StaticSymbol findSymbolDeclaration(StaticSymbol symbol);
    public native  Object resolveEnum(Object enumIdentifier,String name);
    public native  JsArray<Object> annotations(StaticSymbol type);
    public native  JsTypedObject<String,JsArray<Object>> propMetadata(StaticSymbol type);
    public native  JsArray<Object> parameters(StaticSymbol type);
    public native  void _methodNames();
    public native  boolean hasLifecycleHook(Object type,String lcProperty);
    public native  void _registerDecoratorOrConstructor();
    public native  void _registerFunction();
    public native  void initializeConversionMap();
    public native  StaticSymbol getStaticSymbol(String declarationFile,String name,JsArray<String> /* optional */ members);
    public native  void reportError(UNKNOWN_TYPE_NAME_QuestionToken path);
    public native  void getTypeMetadata();
}
