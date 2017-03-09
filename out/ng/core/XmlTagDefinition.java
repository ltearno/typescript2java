package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\xml_tags.d.ts
  * Package ng.core
  * Name XmlTagDefinition
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class XmlTagDefinition extends TagDefinition {
    public boolean closedByParent;
    public JsTypedObject<String,Boolean> requiredParents;
    public String parentToAdd;
    public String implicitNamespacePrefix;
    public /* ng.core.TagContentType */ int contentType;
    public boolean isVoid;
    public boolean ignoreFirstLf;
    public boolean canSelfClose;
    public native  boolean requireExtraParent(String currentParent);
    public native  boolean isClosedByChild(String name);
}
