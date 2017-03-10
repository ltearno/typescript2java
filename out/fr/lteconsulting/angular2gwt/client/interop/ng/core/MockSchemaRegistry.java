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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface MockSchemaRegistry extends ElementSchemaRegistry {
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
    public MockSchemaRegistry(JsTypedObject<String,Boolean> existingProperties,JsTypedObject<String,String> attrPropMapping,JsTypedObject<String,Boolean> existingElements,Array<String> invalidProperties,Array<String> invalidAttributes) {}
     boolean hasProperty(String tagName,String property,JsArray<SchemaMetadata> schemas);
     boolean hasElement(String tagName,JsArray<SchemaMetadata> schemaMetas);
     JsArray<String> allKnownElementNames();
     /* ng.core.SecurityContext */ int securityContext(String selector,String property,boolean isAttribute);
     String getMappedPropName(String attrName);
     String getDefaultComponentElementName();
     /* TypeLiteral */ Object validateProperty(String name);
     /* TypeLiteral */ Object validateAttribute(String name);
     String normalizeAnimationStyleProperty(String propName);
     /* TypeLiteral */ Object normalizeAnimationStyleValue(String camelCaseProp,String userProvidedProp,Object /* UnionType */ val);
}
