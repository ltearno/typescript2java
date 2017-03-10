package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\tags.d.ts
  * Package ng.core
  * Name TagDefinition
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TagDefinition  {
    @JsProperty(name="closedByParent")
    boolean closedByParent();
    @JsProperty(name="closedByParent")
    void closedByParent(boolean value);
    @JsProperty(name="requiredParents")
    JsTypedObject<String,Boolean> requiredParents();
    @JsProperty(name="requiredParents")
    void requiredParents(JsTypedObject<String,Boolean> value);
    @JsProperty(name="parentToAdd")
    String parentToAdd();
    @JsProperty(name="parentToAdd")
    void parentToAdd(String value);
    @JsProperty(name="implicitNamespacePrefix")
    String implicitNamespacePrefix();
    @JsProperty(name="implicitNamespacePrefix")
    void implicitNamespacePrefix(String value);
    @JsProperty(name="contentType")
    /* ng.core.TagContentType */ int contentType();
    @JsProperty(name="contentType")
    void contentType(/* ng.core.TagContentType */ int value);
    @JsProperty(name="isVoid")
    boolean isVoid();
    @JsProperty(name="isVoid")
    void isVoid(boolean value);
    @JsProperty(name="ignoreFirstLf")
    boolean ignoreFirstLf();
    @JsProperty(name="ignoreFirstLf")
    void ignoreFirstLf(boolean value);
    @JsProperty(name="canSelfClose")
    boolean canSelfClose();
    @JsProperty(name="canSelfClose")
    void canSelfClose(boolean value);
     boolean requireExtraParent(String currentParent);
     boolean isClosedByChild(String name);
}
