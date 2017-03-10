package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\xml_tags.d.ts
  * Package ng.core
  * Name XmlTagDefinition
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface XmlTagDefinition extends TagDefinition {
    @JsProperty(name="closedByParent")
    boolean getClosedByParent();
    @JsProperty(name="closedByParent")
    void setClosedByParent(boolean value);
    @JsProperty(name="requiredParents")
    JsTypedObject<String,Boolean> getRequiredParents();
    @JsProperty(name="requiredParents")
    void setRequiredParents(JsTypedObject<String,Boolean> value);
    @JsProperty(name="parentToAdd")
    String getParentToAdd();
    @JsProperty(name="parentToAdd")
    void setParentToAdd(String value);
    @JsProperty(name="implicitNamespacePrefix")
    String getImplicitNamespacePrefix();
    @JsProperty(name="implicitNamespacePrefix")
    void setImplicitNamespacePrefix(String value);
    @JsProperty(name="contentType")
    /* ng.core.TagContentType */ int getContentType();
    @JsProperty(name="contentType")
    void setContentType(/* ng.core.TagContentType */ int value);
    @JsProperty(name="isVoid")
    boolean getIsVoid();
    @JsProperty(name="isVoid")
    void setIsVoid(boolean value);
    @JsProperty(name="ignoreFirstLf")
    boolean getIgnoreFirstLf();
    @JsProperty(name="ignoreFirstLf")
    void setIgnoreFirstLf(boolean value);
    @JsProperty(name="canSelfClose")
    boolean getCanSelfClose();
    @JsProperty(name="canSelfClose")
    void setCanSelfClose(boolean value);
     boolean requireExtraParent(String currentParent);
     boolean isClosedByChild(String name);
}
