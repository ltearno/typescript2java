package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.SchemaMetadata;

/**
  * Generated from tests\@angular\compiler\testing\schema_registry_mock.d.ts
  * Package ng.core
  * Name MockSchemaRegistry
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="MockSchemaRegistry" )
public class MockSchemaRegistryImpl extends ElementSchemaRegistry {
    @JsProperty(name="existingProperties")
    JsTypedObject<String,Boolean> getExistingProperties();
    @JsProperty(name="existingProperties")
    void setExistingProperties(JsTypedObject<String,Boolean> value);
    @JsProperty(name="attrPropMapping")
    JsTypedObject<String,String> getAttrPropMapping();
    @JsProperty(name="attrPropMapping")
    void setAttrPropMapping(JsTypedObject<String,String> value);
    @JsProperty(name="existingElements")
    JsTypedObject<String,Boolean> getExistingElements();
    @JsProperty(name="existingElements")
    void setExistingElements(JsTypedObject<String,Boolean> value);
    @JsProperty(name="invalidProperties")
    Array<String> getInvalidProperties();
    @JsProperty(name="invalidProperties")
    void setInvalidProperties(Array<String> value);
    @JsProperty(name="invalidAttributes")
    Array<String> getInvalidAttributes();
    @JsProperty(name="invalidAttributes")
    void setInvalidAttributes(Array<String> value);
    @JsConstructor
    public MockSchemaRegistryImpl(JsTypedObject<String,Boolean> existingProperties,JsTypedObject<String,String> attrPropMapping,JsTypedObject<String,Boolean> existingElements,Array<String> invalidProperties,Array<String> invalidAttributes) {}
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
