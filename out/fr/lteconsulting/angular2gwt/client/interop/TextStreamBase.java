package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name TextStreamBase
  * Typescript fqn TextStreamBase
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface TextStreamBase {
    /**
     * The column number of the current character position in an input stream.
     */
    @JsProperty(name="Column")
    Number getColumn();

    /**
     * The column number of the current character position in an input stream.
     */
    @JsProperty(name="Column")
    void setColumn(Number value);

    /**
     * The current line number in an input stream.
     */
    @JsProperty(name="Line")
    Number getLine();

    /**
     * The current line number in an input stream.
     */
    @JsProperty(name="Line")
    void setLine(Number value);

    /**
     * Closes a text stream.
     * It is not necessary to close standard streams; they close automatically when the process ends. If 
     * you close a standard stream, be aware that any other pointers to that standard stream become invalid.
     */
    void Close();
}
