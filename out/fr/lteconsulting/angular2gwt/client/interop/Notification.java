package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Notification
  * Typescript fqn Notification
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Notification extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="body")
    String getBody();

    @JsProperty(name="body")
    void setBody(String value);

    @JsProperty(name="dir")
    String getDir();

    @JsProperty(name="dir")
    void setDir(String value);

    @JsProperty(name="icon")
    String getIcon();

    @JsProperty(name="icon")
    void setIcon(String value);

    @JsProperty(name="lang")
    String getLang();

    @JsProperty(name="lang")
    void setLang(String value);

    @JsProperty(name="onclick")
    JsFunction2<Notification,Event,Object> getOnclick();

    @JsProperty(name="onclick")
    void setOnclick(JsFunction2<Notification,Event,Object> value);

    @JsProperty(name="onclose")
    JsFunction2<Notification,Event,Object> getOnclose();

    @JsProperty(name="onclose")
    void setOnclose(JsFunction2<Notification,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<Notification,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<Notification,Event,Object> value);

    @JsProperty(name="onshow")
    JsFunction2<Notification,Event,Object> getOnshow();

    @JsProperty(name="onshow")
    void setOnshow(JsFunction2<Notification,Event,Object> value);

    @JsProperty(name="permission")
    String getPermission();

    @JsProperty(name="permission")
    void setPermission(String value);

    @JsProperty(name="tag")
    String getTag();

    @JsProperty(name="tag")
    void setTag(String value);

    @JsProperty(name="title")
    String getTitle();

    @JsProperty(name="title")
    void setTitle(String value);

    void close();

    <K> void addEventListener(K type, JsFunction2<Notification,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
