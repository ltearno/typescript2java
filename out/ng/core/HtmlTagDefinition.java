package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\html_tags.d.ts
  * Package ng.core
  * Name HtmlTagDefinition
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class HtmlTagDefinition extends TagDefinition {
    public Object closedByChildren;
    public boolean closedByParent;
    public JsTypedObject<String,Boolean> requiredParents;
    public String parentToAdd;
    public String implicitNamespacePrefix;
    public /* ng.core.TagContentType */ int contentType;
    public boolean isVoid;
    public boolean ignoreFirstLf;
    public boolean canSelfClose;
    @JsConstructor
    public HtmlTagDefinition(/* TypeLiteral */ Object /* optional */ undefined) {}
    public native  boolean requireExtraParent(String currentParent);
    public native  boolean isClosedByChild(String name);
}
