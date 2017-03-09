package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\rxjs\scheduler\AsapScheduler.d.ts
  * Package rxjs
  * Name AsapScheduler
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AsapScheduler extends AsyncScheduler {
    public native  void flush(AsyncAction<Object> /* optional */ action);
}
