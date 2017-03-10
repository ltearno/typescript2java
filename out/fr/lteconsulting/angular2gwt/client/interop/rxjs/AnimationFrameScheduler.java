package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.AsyncAction;

/**
  * Generated from tests\rxjs\scheduler\AnimationFrameScheduler.d.ts
  * Package rxjs
  * Name AnimationFrameScheduler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationFrameScheduler extends AsyncScheduler {
     void flush(AsyncAction<Object> /* optional */ action);
}
