package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\abstract_emitter.d.ts
  * Package ng.core
  * Name EmitterVisitorContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class EmitterVisitorContext  {
    public Object _exportedVars;
    public Object _indent;
    public static native  EmitterVisitorContext createRoot(JsArray<String> exportedVars);
    public Object _lines;
    public Object _classes;
    @JsConstructor
    public EmitterVisitorContext(JsArray<String> _exportedVars,int _indent) {}
    public Object _currentLine;
    public native  boolean isExportedVar(String varName);
    public native  void println(String /* optional */ lastPart);
    public native  boolean lineIsEmpty();
    public native  void print(String part,boolean /* optional */ newLine);
    public native  void removeEmptyLastLine();
    public native  void incIndent();
    public native  void decIndent();
    public native  void pushClass(ClassStmt clazz);
    public native  ClassStmt popClass();
    public ClassStmt currentClass;
    public native  Object toSource();
}
