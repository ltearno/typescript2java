package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Message
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Message  {
    public JsArray<Node> nodes;
    public JsTypedObject<String,String> placeholders;
    public JsTypedObject<String,Message> placeholderToMessage;
    public String meaning;
    public String description;
    @JsConstructor
    public Message(JsArray<Node> nodes,JsTypedObject<String,String> placeholders,JsTypedObject<String,Message> placeholderToMessage,String meaning,String description) {}
}
