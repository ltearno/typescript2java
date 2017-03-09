package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\testing\schema_registry_mock.d.ts
  * Package ng.core
  * Name MockSchemaRegistry
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class MockSchemaRegistry extends ElementSchemaRegistry {
    public JsTypedObject<String,Boolean> existingProperties;
    public JsTypedObject<String,String> attrPropMapping;
    public JsTypedObject<String,Boolean> existingElements;
    public Array<String> invalidProperties;
    public Array<String> invalidAttributes;
    @JsConstructor
    public MockSchemaRegistry(JsTypedObject<String,Boolean> existingProperties,JsTypedObject<String,String> attrPropMapping,JsTypedObject<String,Boolean> existingElements,Array<String> invalidProperties,Array<String> invalidAttributes) {}
    public native  boolean hasProperty(String tagName,String property,JsArray<SchemaMetadata> schemas);
    public native  boolean hasElement(String tagName,JsArray<SchemaMetadata> schemaMetas);
    public native  JsArray<String> allKnownElementNames();
    public native  /* ng.core.SecurityContext */ int securityContext(String selector,String property,boolean isAttribute);
    public native  String getMappedPropName(String attrName);
    public native  String getDefaultComponentElementName();
    public native  /* TypeLiteral */ Object validateProperty(String name);
    public native  /* TypeLiteral */ Object validateAttribute(String name);
    public native  String normalizeAnimationStyleProperty(String propName);
    public native  /* TypeLiteral */ Object normalizeAnimationStyleValue(String camelCaseProp,String userProvidedProp,Object /* UnionType */ val);
}
