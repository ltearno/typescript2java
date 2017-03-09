package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction3;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_iterable_differ.d.ts
  * Package ng.core
  * Name DefaultIterableDiffer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DefaultIterableDiffer extends IterableDiffer {
    public Object _trackByFn;
    public Object _length;
    public Object _collection;
    public Object _linkedRecords;
    public Object _unlinkedRecords;
    public Object _previousItHead;
    public Object _itHead;
    public Object _itTail;
    public Object _additionsHead;
    public Object _additionsTail;
    public Object _movesHead;
    public Object _movesTail;
    public Object _removalsHead;
    public Object _removalsTail;
    public Object _identityChangesHead;
    public Object _identityChangesTail;
    @JsConstructor
    public DefaultIterableDiffer(TrackByFn /* optional */ _trackByFn) {}
    public Object collection;
    public int length;
    public native  void forEachItem(Function fn);
    public native  void forEachOperation(JsFunction3<CollectionChangeRecord,Integer,Integer,Void> fn);
    public native  void forEachPreviousItem(Function fn);
    public native  void forEachAddedItem(Function fn);
    public native  void forEachMovedItem(Function fn);
    public native  void forEachRemovedItem(Function fn);
    public native  void forEachIdentityChange(Function fn);
    public native  DefaultIterableDiffer diff(Object collection);
    public native  void onDestroy();
    public native  boolean check(Object collection);
    public boolean isDirty;
    public native  String toString();
}
