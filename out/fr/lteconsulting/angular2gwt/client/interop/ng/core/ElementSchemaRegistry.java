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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ElementSchemaRegistry  {
     boolean hasProperty(String tagName,String propName,JsArray<SchemaMetadata> schemaMetas);
     boolean hasElement(String tagName,JsArray<SchemaMetadata> schemaMetas);
     /* ng.core.SecurityContext */ int securityContext(String elementName,String propName,boolean isAttribute);
     JsArray<String> allKnownElementNames();
     String getMappedPropName(String propName);
     String getDefaultComponentElementName();
     /* TypeLiteral */ Object validateProperty(String name);
     /* TypeLiteral */ Object validateAttribute(String name);
     String normalizeAnimationStyleProperty(String propName);
     /* TypeLiteral */ Object normalizeAnimationStyleValue(String camelCaseProp,String userProvidedProp,Object /* UnionType */ val);
}
