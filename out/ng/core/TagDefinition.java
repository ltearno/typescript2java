package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\tags.d.ts
  * Package ng.core
  * Name TagDefinition
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class TagDefinition  {
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
