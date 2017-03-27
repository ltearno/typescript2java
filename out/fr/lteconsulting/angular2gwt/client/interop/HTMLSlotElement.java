package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLSlotElement
  * Typescript fqn HTMLSlotElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLSlotElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    JsArray<Node> assignedNodes(AssignedNodesOptions /* optional */ options);
}
