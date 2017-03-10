package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\VirtualTimeScheduler.d.ts
  * Package rxjs
  * Name VirtualTimeScheduler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface VirtualTimeScheduler extends AsyncScheduler {
    @JsProperty(name="maxFrames")
    int getMaxFrames();
    @JsProperty(name="maxFrames")
    void setMaxFrames(int value);
    @JsProperty(name="frame")
    int getFrame();
    @JsProperty(name="frame")
    void setFrame(int value);
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsConstructor
    public VirtualTimeScheduler(UNKNOWN_TYPE_NAME_TypeQuery /* optional */ SchedulerAction,int /* optional */ maxFrames) {}
     void flush();
}
