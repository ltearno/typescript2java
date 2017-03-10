package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import ng.core.KeyValueChangeRecord;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_keyvalue_differ.d.ts
  * Package ng.core
  * Name DefaultKeyValueDiffer
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DefaultKeyValueDiffer" )
public class DefaultKeyValueDifferImpl extends KeyValueDiffer {
    @JsProperty(name="_records")
    Object get_records();
    @JsProperty(name="_records")
    void set_records(Object value);
    @JsProperty(name="_mapHead")
    Object get_mapHead();
    @JsProperty(name="_mapHead")
    void set_mapHead(Object value);
    @JsProperty(name="_previousMapHead")
    Object get_previousMapHead();
    @JsProperty(name="_previousMapHead")
    void set_previousMapHead(Object value);
    @JsProperty(name="_changesHead")
    Object get_changesHead();
    @JsProperty(name="_changesHead")
    void set_changesHead(Object value);
    @JsProperty(name="_changesTail")
    Object get_changesTail();
    @JsProperty(name="_changesTail")
    void set_changesTail(Object value);
    @JsProperty(name="_additionsHead")
    Object get_additionsHead();
    @JsProperty(name="_additionsHead")
    void set_additionsHead(Object value);
    @JsProperty(name="_additionsTail")
    Object get_additionsTail();
    @JsProperty(name="_additionsTail")
    void set_additionsTail(Object value);
    @JsProperty(name="_removalsHead")
    Object get_removalsHead();
    @JsProperty(name="_removalsHead")
    void set_removalsHead(Object value);
    @JsProperty(name="_removalsTail")
    Object get_removalsTail();
    @JsProperty(name="_removalsTail")
    void set_removalsTail(Object value);
    @JsProperty(name="isDirty")
    boolean getIsDirty();
    @JsProperty(name="isDirty")
    void setIsDirty(boolean value);
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
