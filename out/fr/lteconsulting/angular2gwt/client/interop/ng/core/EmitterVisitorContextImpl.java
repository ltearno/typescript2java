package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.EmitterVisitorContext;
import jsinterop.annotations.JsConstructor;
import ng.core.ClassStmt;

/**
  * Generated from tests\@angular\compiler\src\output\abstract_emitter.d.ts
  * Package ng.core
  * Name EmitterVisitorContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="EmitterVisitorContext" )
public class EmitterVisitorContextImpl  {
    @JsProperty(name="_exportedVars")
    Object get_exportedVars();
    @JsProperty(name="_exportedVars")
    void set_exportedVars(Object value);
    @JsProperty(name="_indent")
    Object get_indent();
    @JsProperty(name="_indent")
    void set_indent(Object value);
    public static native  EmitterVisitorContext createRoot(JsArray<String> exportedVars);
    @JsProperty(name="_lines")
    Object get_lines();
    @JsProperty(name="_lines")
    void set_lines(Object value);
    @JsProperty(name="_classes")
    Object get_classes();
    @JsProperty(name="_classes")
    void set_classes(Object value);
    @JsConstructor
    public EmitterVisitorContextImpl(JsArray<String> _exportedVars,int _indent) {}
    @JsProperty(name="_currentLine")
    Object get_currentLine();
    @JsProperty(name="_currentLine")
    void set_currentLine(Object value);
    public native  boolean isExportedVar(String varName);
    public native  void println(String /* optional */ lastPart);
    public native  boolean lineIsEmpty();
    public native  void print(String part,boolean /* optional */ newLine);
    public native  void removeEmptyLastLine();
    public native  void incIndent();
    public native  void decIndent();
    public native  void pushClass(ClassStmt clazz);
    public native  ClassStmt popClass();
    @JsProperty(name="currentClass")
    ClassStmt getCurrentClass();
    @JsProperty(name="currentClass")
    void setCurrentClass(ClassStmt value);
    public native  Object toSource();
}
