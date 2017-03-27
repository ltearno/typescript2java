package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MutationObserverInit
  * Typescript fqn MutationObserverInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MutationObserverInit {
    /* optional property childList*/    @JsProperty(name="childList")
    boolean getChildList();

    @JsProperty(name="childList")
    void setChildList(boolean value);

    /* optional property attributes*/    @JsProperty(name="attributes")
    boolean getAttributes();

    @JsProperty(name="attributes")
    void setAttributes(boolean value);

    /* optional property characterData*/    @JsProperty(name="characterData")
    boolean getCharacterData();

    @JsProperty(name="characterData")
    void setCharacterData(boolean value);

    /* optional property subtree*/    @JsProperty(name="subtree")
    boolean getSubtree();

    @JsProperty(name="subtree")
    void setSubtree(boolean value);

    /* optional property attributeOldValue*/    @JsProperty(name="attributeOldValue")
    boolean getAttributeOldValue();

    @JsProperty(name="attributeOldValue")
    void setAttributeOldValue(boolean value);

    /* optional property characterDataOldValue*/    @JsProperty(name="characterDataOldValue")
    boolean getCharacterDataOldValue();

    @JsProperty(name="characterDataOldValue")
    void setCharacterDataOldValue(boolean value);

    /* optional property attributeFilter*/    @JsProperty(name="attributeFilter")
    Array<String> getAttributeFilter();

    @JsProperty(name="attributeFilter")
    void setAttributeFilter(Array<String> value);
}
