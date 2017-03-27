package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLBodyElement
  * Typescript fqn HTMLBodyElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLBodyElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="aLink")
    Object getALink();

    @JsProperty(name="aLink")
    void setALink(Object value);

    @JsProperty(name="background")
    String getBackground();

    @JsProperty(name="background")
    void setBackground(String value);

    @JsProperty(name="bgColor")
    Object getBgColor();

    @JsProperty(name="bgColor")
    void setBgColor(Object value);

    @JsProperty(name="bgProperties")
    String getBgProperties();

    @JsProperty(name="bgProperties")
    void setBgProperties(String value);

    @JsProperty(name="link")
    Object getLink();

    @JsProperty(name="link")
    void setLink(Object value);

    @JsProperty(name="noWrap")
    boolean getNoWrap();

    @JsProperty(name="noWrap")
    void setNoWrap(boolean value);

    @JsProperty(name="onafterprint")
    JsFunction2<HTMLBodyElement,Event,Object> getOnafterprint();

    @JsProperty(name="onafterprint")
    void setOnafterprint(JsFunction2<HTMLBodyElement,Event,Object> value);

    @JsProperty(name="onbeforeprint")
    JsFunction2<HTMLBodyElement,Event,Object> getOnbeforeprint();

    @JsProperty(name="onbeforeprint")
    void setOnbeforeprint(JsFunction2<HTMLBodyElement,Event,Object> value);

    @JsProperty(name="onbeforeunload")
    JsFunction2<HTMLBodyElement,BeforeUnloadEvent,Object> getOnbeforeunload();

    @JsProperty(name="onbeforeunload")
    void setOnbeforeunload(JsFunction2<HTMLBodyElement,BeforeUnloadEvent,Object> value);

    @JsProperty(name="onblur")
    JsFunction2<HTMLBodyElement,FocusEvent,Object> getOnblur();

    @JsProperty(name="onblur")
    void setOnblur(JsFunction2<HTMLBodyElement,FocusEvent,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<HTMLBodyElement,ErrorEvent,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<HTMLBodyElement,ErrorEvent,Object> value);

    @JsProperty(name="onfocus")
    JsFunction2<HTMLBodyElement,FocusEvent,Object> getOnfocus();

    @JsProperty(name="onfocus")
    void setOnfocus(JsFunction2<HTMLBodyElement,FocusEvent,Object> value);

    @JsProperty(name="onhashchange")
    JsFunction2<HTMLBodyElement,HashChangeEvent,Object> getOnhashchange();

    @JsProperty(name="onhashchange")
    void setOnhashchange(JsFunction2<HTMLBodyElement,HashChangeEvent,Object> value);

    @JsProperty(name="onload")
    JsFunction2<HTMLBodyElement,Event,Object> getOnload();

    @JsProperty(name="onload")
    void setOnload(JsFunction2<HTMLBodyElement,Event,Object> value);

    @JsProperty(name="onmessage")
    JsFunction2<HTMLBodyElement,MessageEvent,Object> getOnmessage();

    @JsProperty(name="onmessage")
    void setOnmessage(JsFunction2<HTMLBodyElement,MessageEvent,Object> value);

    @JsProperty(name="onoffline")
    JsFunction2<HTMLBodyElement,Event,Object> getOnoffline();

    @JsProperty(name="onoffline")
    void setOnoffline(JsFunction2<HTMLBodyElement,Event,Object> value);

    @JsProperty(name="ononline")
    JsFunction2<HTMLBodyElement,Event,Object> getOnonline();

    @JsProperty(name="ononline")
    void setOnonline(JsFunction2<HTMLBodyElement,Event,Object> value);

    @JsProperty(name="onorientationchange")
    JsFunction2<HTMLBodyElement,Event,Object> getOnorientationchange();

    @JsProperty(name="onorientationchange")
    void setOnorientationchange(JsFunction2<HTMLBodyElement,Event,Object> value);

    @JsProperty(name="onpagehide")
    JsFunction2<HTMLBodyElement,PageTransitionEvent,Object> getOnpagehide();

    @JsProperty(name="onpagehide")
    void setOnpagehide(JsFunction2<HTMLBodyElement,PageTransitionEvent,Object> value);

    @JsProperty(name="onpageshow")
    JsFunction2<HTMLBodyElement,PageTransitionEvent,Object> getOnpageshow();

    @JsProperty(name="onpageshow")
    void setOnpageshow(JsFunction2<HTMLBodyElement,PageTransitionEvent,Object> value);

    @JsProperty(name="onpopstate")
    JsFunction2<HTMLBodyElement,PopStateEvent,Object> getOnpopstate();

    @JsProperty(name="onpopstate")
    void setOnpopstate(JsFunction2<HTMLBodyElement,PopStateEvent,Object> value);

    @JsProperty(name="onresize")
    JsFunction2<HTMLBodyElement,UIEvent,Object> getOnresize();

    @JsProperty(name="onresize")
    void setOnresize(JsFunction2<HTMLBodyElement,UIEvent,Object> value);

    @JsProperty(name="onscroll")
    JsFunction2<HTMLBodyElement,UIEvent,Object> getOnscroll();

    @JsProperty(name="onscroll")
    void setOnscroll(JsFunction2<HTMLBodyElement,UIEvent,Object> value);

    @JsProperty(name="onstorage")
    JsFunction2<HTMLBodyElement,StorageEvent,Object> getOnstorage();

    @JsProperty(name="onstorage")
    void setOnstorage(JsFunction2<HTMLBodyElement,StorageEvent,Object> value);

    @JsProperty(name="onunload")
    JsFunction2<HTMLBodyElement,Event,Object> getOnunload();

    @JsProperty(name="onunload")
    void setOnunload(JsFunction2<HTMLBodyElement,Event,Object> value);

    @JsProperty(name="text")
    Object getText();

    @JsProperty(name="text")
    void setText(Object value);

    @JsProperty(name="vLink")
    Object getVLink();

    @JsProperty(name="vLink")
    void setVLink(Object value);

    <K> void addEventListener(K type, JsFunction2<HTMLBodyElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
