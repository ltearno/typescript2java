package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.TrackByFn;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import ng.core.CollectionChangeRecord;
import ng.core.DefaultIterableDiffer;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_iterable_differ.d.ts
  * Package ng.core
  * Name DefaultIterableDiffer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DefaultIterableDiffer extends IterableDiffer {
    @JsProperty(name="_trackByFn")
    Object get_trackByFn();
    @JsProperty(name="_trackByFn")
    void set_trackByFn(Object value);
    @JsProperty(name="_length")
    Object get_length();
    @JsProperty(name="_length")
    void set_length(Object value);
    @JsProperty(name="_collection")
    Object get_collection();
    @JsProperty(name="_collection")
    void set_collection(Object value);
    @JsProperty(name="_linkedRecords")
    Object get_linkedRecords();
    @JsProperty(name="_linkedRecords")
    void set_linkedRecords(Object value);
    @JsProperty(name="_unlinkedRecords")
    Object get_unlinkedRecords();
    @JsProperty(name="_unlinkedRecords")
    void set_unlinkedRecords(Object value);
    @JsProperty(name="_previousItHead")
    Object get_previousItHead();
    @JsProperty(name="_previousItHead")
    void set_previousItHead(Object value);
    @JsProperty(name="_itHead")
    Object get_itHead();
    @JsProperty(name="_itHead")
    void set_itHead(Object value);
    @JsProperty(name="_itTail")
    Object get_itTail();
    @JsProperty(name="_itTail")
    void set_itTail(Object value);
    @JsProperty(name="_additionsHead")
    Object get_additionsHead();
    @JsProperty(name="_additionsHead")
    void set_additionsHead(Object value);
    @JsProperty(name="_additionsTail")
    Object get_additionsTail();
    @JsProperty(name="_additionsTail")
    void set_additionsTail(Object value);
    @JsProperty(name="_movesHead")
    Object get_movesHead();
    @JsProperty(name="_movesHead")
    void set_movesHead(Object value);
    @JsProperty(name="_movesTail")
    Object get_movesTail();
    @JsProperty(name="_movesTail")
    void set_movesTail(Object value);
    @JsProperty(name="_removalsHead")
    Object get_removalsHead();
    @JsProperty(name="_removalsHead")
    void set_removalsHead(Object value);
    @JsProperty(name="_removalsTail")
    Object get_removalsTail();
    @JsProperty(name="_removalsTail")
    void set_removalsTail(Object value);
    @JsProperty(name="_identityChangesHead")
    Object get_identityChangesHead();
    @JsProperty(name="_identityChangesHead")
    void set_identityChangesHead(Object value);
    @JsProperty(name="_identityChangesTail")
    Object get_identityChangesTail();
    @JsProperty(name="_identityChangesTail")
    void set_identityChangesTail(Object value);
    @JsConstructor
    public DefaultIterableDiffer(TrackByFn /* optional */ _trackByFn) {}
    @JsProperty(name="collection")
    Object getCollection();
    @JsProperty(name="collection")
    void setCollection(Object value);
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
     void forEachItem(Function fn);
     void forEachOperation(JsFunction3<CollectionChangeRecord,Integer,Integer,Void> fn);
     void forEachPreviousItem(Function fn);
     void forEachAddedItem(Function fn);
     void forEachMovedItem(Function fn);
     void forEachRemovedItem(Function fn);
     void forEachIdentityChange(Function fn);
     DefaultIterableDiffer diff(Object collection);
     void onDestroy();
     boolean check(Object collection);
    @JsProperty(name="isDirty")
    boolean getIsDirty();
    @JsProperty(name="isDirty")
    void setIsDirty(boolean value);
     String toString();
}
