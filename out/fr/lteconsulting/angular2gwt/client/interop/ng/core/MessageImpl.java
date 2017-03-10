package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Node;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.Message;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Message
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Message" )
public class MessageImpl  {
    @JsProperty(name="nodes")
    JsArray<Node> getNodes();
    @JsProperty(name="nodes")
    void setNodes(JsArray<Node> value);
    @JsProperty(name="placeholders")
    JsTypedObject<String,String> getPlaceholders();
    @JsProperty(name="placeholders")
    void setPlaceholders(JsTypedObject<String,String> value);
    @JsProperty(name="placeholderToMessage")
    JsTypedObject<String,Message> getPlaceholderToMessage();
    @JsProperty(name="placeholderToMessage")
    void setPlaceholderToMessage(JsTypedObject<String,Message> value);
    @JsProperty(name="meaning")
    String getMeaning();
    @JsProperty(name="meaning")
    void setMeaning(String value);
    @JsProperty(name="description")
    String getDescription();
    @JsProperty(name="description")
    void setDescription(String value);
    @JsConstructor
    public MessageImpl(JsArray<Node> nodes,JsTypedObject<String,String> placeholders,JsTypedObject<String,Message> placeholderToMessage,String meaning,String description) {}
}
