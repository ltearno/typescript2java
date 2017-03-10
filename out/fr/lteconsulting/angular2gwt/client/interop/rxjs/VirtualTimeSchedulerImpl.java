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
@JsType( isNative=true, namespace="rxjs", name="VirtualTimeScheduler" )
public class VirtualTimeSchedulerImpl extends AsyncScheduler {
    @JsProperty(name="maxFrames")
    int getMaxFrames();
    @JsProperty(name="maxFrames")
    void setMaxFrames(int value);
    @JsProperty(name="frameTimeFactor")
    static int getFrameTimeFactor();
    @JsProperty(name="frameTimeFactor")
    static void setFrameTimeFactor(int value);
    @JsProperty(name="frame")
    int getFrame();
    @JsProperty(name="frame")
    void setFrame(int value);
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsConstructor
    public VirtualTimeSchedulerImpl(UNKNOWN_TYPE_NAME_TypeQuery /* optional */ SchedulerAction,int /* optional */ maxFrames) {}
    public native  void flush();
}
