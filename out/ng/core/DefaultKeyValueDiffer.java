package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_keyvalue_differ.d.ts
  * Package ng.core
  * Name DefaultKeyValueDiffer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DefaultKeyValueDiffer extends KeyValueDiffer {
    public Object _records;
    public Object _mapHead;
    public Object _previousMapHead;
    public Object _changesHead;
    public Object _changesTail;
    public Object _additionsHead;
    public Object _additionsTail;
    public Object _removalsHead;
    public Object _removalsTail;
    public boolean isDirty;
    public native  void forEachItem(JsFunction1<KeyValueChangeRecord,Void> fn);
    public native  void forEachPreviousItem(JsFunction1<KeyValueChangeRecord,Void> fn);
    public native  void forEachChangedItem(JsFunction1<KeyValueChangeRecord,Void> fn);
    public native  void forEachAddedItem(JsFunction1<KeyValueChangeRecord,Void> fn);
    public native  void forEachRemovedItem(JsFunction1<KeyValueChangeRecord,Void> fn);
    public native  Object diff(Object /* UnionType */ map);
    public native  void onDestroy();
    public native  boolean check(Object /* UnionType */ map);
    public native  void _maybeAddToChanges();
    public native  String toString();
}
