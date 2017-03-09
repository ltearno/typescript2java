package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\rxjs\scheduler\AsyncScheduler.d.ts
  * Package rxjs
  * Name AsyncScheduler
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AsyncScheduler extends Scheduler {
    public Array<AsyncAction<Object>> actions;
    public boolean active;
    public Object scheduled;
    public native  void flush(AsyncAction<Object> action);
}
