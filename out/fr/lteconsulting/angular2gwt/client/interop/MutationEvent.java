package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MutationEvent
  * Typescript fqn MutationEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MutationEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="attrChange")
    Number getAttrChange();

    @JsProperty(name="attrChange")
    void setAttrChange(Number value);

    @JsProperty(name="attrName")
    String getAttrName();

    @JsProperty(name="attrName")
    void setAttrName(String value);

    @JsProperty(name="newValue")
    String getNewValue();

    @JsProperty(name="newValue")
    void setNewValue(String value);

    @JsProperty(name="prevValue")
    String getPrevValue();

    @JsProperty(name="prevValue")
    void setPrevValue(String value);

    @JsProperty(name="relatedNode")
    Node getRelatedNode();

    @JsProperty(name="relatedNode")
    void setRelatedNode(Node value);

    @JsProperty(name="ADDITION")
    Number getADDITION();

    @JsProperty(name="ADDITION")
    void setADDITION(Number value);

    @JsProperty(name="MODIFICATION")
    Number getMODIFICATION();

    @JsProperty(name="MODIFICATION")
    void setMODIFICATION(Number value);

    @JsProperty(name="REMOVAL")
    Number getREMOVAL();

    @JsProperty(name="REMOVAL")
    void setREMOVAL(Number value);

    void initMutationEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Node relatedNodeArg, String prevValueArg, String newValueArg, String attrNameArg, Number attrChangeArg);
}
