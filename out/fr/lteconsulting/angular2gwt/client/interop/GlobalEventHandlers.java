package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name GlobalEventHandlers
  * Typescript fqn GlobalEventHandlers
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface GlobalEventHandlers {
    @JsProperty(name="onpointercancel")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointercancel();

    @JsProperty(name="onpointercancel")
    void setOnpointercancel(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onpointerdown")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointerdown();

    @JsProperty(name="onpointerdown")
    void setOnpointerdown(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onpointerenter")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointerenter();

    @JsProperty(name="onpointerenter")
    void setOnpointerenter(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onpointerleave")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointerleave();

    @JsProperty(name="onpointerleave")
    void setOnpointerleave(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onpointermove")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointermove();

    @JsProperty(name="onpointermove")
    void setOnpointermove(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onpointerout")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointerout();

    @JsProperty(name="onpointerout")
    void setOnpointerout(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onpointerover")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointerover();

    @JsProperty(name="onpointerover")
    void setOnpointerover(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onpointerup")
    JsFunction2<GlobalEventHandlers,PointerEvent,Object> getOnpointerup();

    @JsProperty(name="onpointerup")
    void setOnpointerup(JsFunction2<GlobalEventHandlers,PointerEvent,Object> value);

    @JsProperty(name="onwheel")
    JsFunction2<GlobalEventHandlers,WheelEvent,Object> getOnwheel();

    @JsProperty(name="onwheel")
    void setOnwheel(JsFunction2<GlobalEventHandlers,WheelEvent,Object> value);

    <K> void addEventListener(K type, JsFunction2<GlobalEventHandlers,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
