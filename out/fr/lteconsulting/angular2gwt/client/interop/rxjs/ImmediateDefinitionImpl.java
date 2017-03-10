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
@JsType( isNative=true, namespace="rxjs", name="ImmediateDefinition" )
public class ImmediateDefinitionImpl  {
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
    public native  void identify();
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
    public ImmediateDefinitionImpl(Object root) {}
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
