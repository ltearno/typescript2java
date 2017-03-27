package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebKitEntry
  * Typescript fqn WebKitEntry
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebKitEntry {
    @JsProperty(name="filesystem")
    WebKitFileSystem getFilesystem();

    @JsProperty(name="filesystem")
    void setFilesystem(WebKitFileSystem value);

    @JsProperty(name="fullPath")
    String getFullPath();

    @JsProperty(name="fullPath")
    void setFullPath(String value);

    @JsProperty(name="isDirectory")
    boolean getIsDirectory();

    @JsProperty(name="isDirectory")
    void setIsDirectory(boolean value);

    @JsProperty(name="isFile")
    boolean getIsFile();

    @JsProperty(name="isFile")
    void setIsFile(boolean value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);
}
