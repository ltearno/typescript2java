package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\rxjs\util\Immediate.d.ts
  * Package rxjs
  * Name ImmediateDefinition
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class ImmediateDefinition  {
    public Object root;
    public JsFunction1<JsFunction<Void>,Integer> setImmediate;
    public JsFunction1<Integer,Void> clearImmediate;
    public native  void identify();
    public Object tasksByHandle;
    public int nextHandle;
    public boolean currentlyRunningATask;
    @JsConstructor
    public ImmediateDefinition(Object root) {}
    public native  boolean canUseProcessNextTick();
    public native  boolean canUseMessageChannel();
    public native  boolean canUseReadyStateChange();
    public native  boolean canUsePostMessage();
    public native  JsFunction<Void> partiallyApplied(Object handler,JsArray<Object> /* optional */ undefined);
    public native  int addFromSetImmediateArguments(JsArray<Object> args);
    public native  JsFunction<Object> createProcessNextTickSetImmediate();
    public native  JsFunction<Object> createPostMessageSetImmediate();
    public native  void runIfPresent(Object handle);
    public native  JsFunction<Object> createMessageChannelSetImmediate();
    public native  JsFunction<Object> createReadyStateChangeSetImmediate();
    public native  JsFunction<Object> createSetTimeoutSetImmediate();
}
