package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLMarqueeElement
  * Typescript fqn HTMLMarqueeElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLMarqueeElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="behavior")
    String getBehavior();

    @JsProperty(name="behavior")
    void setBehavior(String value);

    @JsProperty(name="bgColor")
    Object getBgColor();

    @JsProperty(name="bgColor")
    void setBgColor(Object value);

    @JsProperty(name="direction")
    String getDirection();

    @JsProperty(name="direction")
    void setDirection(String value);

    @JsProperty(name="height")
    String getHeight();

    @JsProperty(name="height")
    void setHeight(String value);

    @JsProperty(name="hspace")
    Number getHspace();

    @JsProperty(name="hspace")
    void setHspace(Number value);

    @JsProperty(name="loop")
    Number getLoop();

    @JsProperty(name="loop")
    void setLoop(Number value);

    @JsProperty(name="onbounce")
    JsFunction2<HTMLMarqueeElement,Event,Object> getOnbounce();

    @JsProperty(name="onbounce")
    void setOnbounce(JsFunction2<HTMLMarqueeElement,Event,Object> value);

    @JsProperty(name="onfinish")
    JsFunction2<HTMLMarqueeElement,Event,Object> getOnfinish();

    @JsProperty(name="onfinish")
    void setOnfinish(JsFunction2<HTMLMarqueeElement,Event,Object> value);

    @JsProperty(name="onstart")
    JsFunction2<HTMLMarqueeElement,Event,Object> getOnstart();

    @JsProperty(name="onstart")
    void setOnstart(JsFunction2<HTMLMarqueeElement,Event,Object> value);

    @JsProperty(name="scrollAmount")
    Number getScrollAmount();

    @JsProperty(name="scrollAmount")
    void setScrollAmount(Number value);

    @JsProperty(name="scrollDelay")
    Number getScrollDelay();

    @JsProperty(name="scrollDelay")
    void setScrollDelay(Number value);

    @JsProperty(name="trueSpeed")
    boolean getTrueSpeed();

    @JsProperty(name="trueSpeed")
    void setTrueSpeed(boolean value);

    @JsProperty(name="vspace")
    Number getVspace();

    @JsProperty(name="vspace")
    void setVspace(Number value);

    @JsProperty(name="width")
    String getWidth();

    @JsProperty(name="width")
    void setWidth(String value);

    void start();

    void stop();

    <K> void addEventListener(K type, JsFunction2<HTMLMarqueeElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
