package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name StyleSheet
  * Typescript fqn StyleSheet
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface StyleSheet {
    @JsProperty(name="disabled")
    boolean getDisabled();

    @JsProperty(name="disabled")
    void setDisabled(boolean value);

    @JsProperty(name="href")
    String getHref();

    @JsProperty(name="href")
    void setHref(String value);

    @JsProperty(name="media")
    MediaList getMedia();

    @JsProperty(name="media")
    void setMedia(MediaList value);

    @JsProperty(name="ownerNode")
    Node getOwnerNode();

    @JsProperty(name="ownerNode")
    void setOwnerNode(Node value);

    @JsProperty(name="parentStyleSheet")
    StyleSheet getParentStyleSheet();

    @JsProperty(name="parentStyleSheet")
    void setParentStyleSheet(StyleSheet value);

    @JsProperty(name="title")
    String getTitle();

    @JsProperty(name="title")
    void setTitle(String value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);
}
