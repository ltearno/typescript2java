package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\VirtualTimeScheduler.d.ts
  * Package rxjs
  * Name VirtualTimeScheduler
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class VirtualTimeScheduler extends AsyncScheduler {
    public int maxFrames;
    public static int frameTimeFactor;
    public int frame;
    public int index;
    @JsConstructor
    public VirtualTimeScheduler(UNKNOWN_TYPE_NAME_TypeQuery /* optional */ SchedulerAction,int /* optional */ maxFrames) {}
    public native  void flush();
}
