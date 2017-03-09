package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\schema\dom_element_schema_registry.d.ts
  * Package ng.core
  * Name DomElementSchemaRegistry
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DomElementSchemaRegistry extends ElementSchemaRegistry {
    public Object _schema;
    @JsConstructor
    public DomElementSchemaRegistry() {}
    public native  boolean hasProperty(String tagName,String propName,JsArray<SchemaMetadata> schemaMetas);
    public native  boolean hasElement(String tagName,JsArray<SchemaMetadata> schemaMetas);
    public native  /* ng.core.SecurityContext */ int securityContext(String tagName,String propName,boolean isAttribute);
    public native  String getMappedPropName(String propName);
    public native  String getDefaultComponentElementName();
    public native  /* TypeLiteral */ Object validateProperty(String name);
    public native  /* TypeLiteral */ Object validateAttribute(String name);
    public native  JsArray<String> allKnownElementNames();
    public native  String normalizeAnimationStyleProperty(String propName);
    public native  /* TypeLiteral */ Object normalizeAnimationStyleValue(String camelCaseProp,String userProvidedProp,Object /* UnionType */ val);
}
