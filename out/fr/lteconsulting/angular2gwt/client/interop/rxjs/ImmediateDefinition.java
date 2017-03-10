package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ImmediateDefinition  {
    @JsProperty(name="root")
    Object getRoot();
    @JsProperty(name="root")
    void setRoot(Object value);
    @JsProperty(name="setImmediate")
    JsFunction1<JsFunction<Void>,Integer> getSetImmediate();
    @JsProperty(name="setImmediate")
    void setSetImmediate(JsFunction1<JsFunction<Void>,Integer> value);
    @JsProperty(name="clearImmediate")
    JsFunction1<Integer,Void> getClearImmediate();
    @JsProperty(name="clearImmediate")
    void setClearImmediate(JsFunction1<Integer,Void> value);
     void identify();
    @JsProperty(name="tasksByHandle")
    Object getTasksByHandle();
    @JsProperty(name="tasksByHandle")
    void setTasksByHandle(Object value);
    @JsProperty(name="nextHandle")
    int getNextHandle();
    @JsProperty(name="nextHandle")
    void setNextHandle(int value);
    @JsProperty(name="currentlyRunningATask")
    boolean getCurrentlyRunningATask();
    @JsProperty(name="currentlyRunningATask")
    void setCurrentlyRunningATask(boolean value);
    @JsConstructor
    public ImmediateDefinition(Object root) {}
     boolean canUseProcessNextTick();
     boolean canUseMessageChannel();
     boolean canUseReadyStateChange();
     boolean canUsePostMessage();
     JsFunction<Void> partiallyApplied(Object handler,JsArray<Object> /* optional */ undefined);
     int addFromSetImmediateArguments(JsArray<Object> args);
     JsFunction<Object> createProcessNextTickSetImmediate();
     JsFunction<Object> createPostMessageSetImmediate();
     void runIfPresent(Object handle);
     JsFunction<Object> createMessageChannelSetImmediate();
     JsFunction<Object> createReadyStateChangeSetImmediate();
     JsFunction<Object> createSetTimeoutSetImmediate();
}
