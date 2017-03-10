package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.SchemaMetadata;

/**
  * Generated from tests\@angular\compiler\src\schema\dom_element_schema_registry.d.ts
  * Package ng.core
  * Name DomElementSchemaRegistry
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DomElementSchemaRegistry extends ElementSchemaRegistry {
    @JsProperty(name="_schema")
    Object get_schema();
    @JsProperty(name="_schema")
    void set_schema(Object value);
    @JsConstructor
    public DomElementSchemaRegistry() {}
     boolean hasProperty(String tagName,String propName,JsArray<SchemaMetadata> schemaMetas);
     boolean hasElement(String tagName,JsArray<SchemaMetadata> schemaMetas);
     /* ng.core.SecurityContext */ int securityContext(String tagName,String propName,boolean isAttribute);
     String getMappedPropName(String propName);
     String getDefaultComponentElementName();
     /* TypeLiteral */ Object validateProperty(String name);
     /* TypeLiteral */ Object validateAttribute(String name);
     JsArray<String> allKnownElementNames();
     String normalizeAnimationStyleProperty(String propName);
     /* TypeLiteral */ Object normalizeAnimationStyleValue(String camelCaseProp,String userProvidedProp,Object /* UnionType */ val);
}
