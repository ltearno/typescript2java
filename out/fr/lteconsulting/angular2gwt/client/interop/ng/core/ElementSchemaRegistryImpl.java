package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.SchemaMetadata;

/**
  * Generated from tests\@angular\compiler\src\schema\element_schema_registry.d.ts
  * Package ng.core
  * Name ElementSchemaRegistry
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ElementSchemaRegistry" )
public abstract class ElementSchemaRegistryImpl  {
    public native  boolean hasProperty(String tagName,String propName,JsArray<SchemaMetadata> schemaMetas);
    public native  boolean hasElement(String tagName,JsArray<SchemaMetadata> schemaMetas);
    public native  /* ng.core.SecurityContext */ int securityContext(String elementName,String propName,boolean isAttribute);
    public native  JsArray<String> allKnownElementNames();
    public native  String getMappedPropName(String propName);
    public native  String getDefaultComponentElementName();
    public native  /* TypeLiteral */ Object validateProperty(String name);
    public native  /* TypeLiteral */ Object validateAttribute(String name);
    public native  String normalizeAnimationStyleProperty(String propName);
    public native  /* TypeLiteral */ Object normalizeAnimationStyleValue(String camelCaseProp,String userProvidedProp,Object /* UnionType */ val);
}
