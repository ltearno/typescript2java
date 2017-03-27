package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DataTransfer
  * Typescript fqn DataTransfer
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DataTransfer {
    @JsProperty(name="dropEffect")
    String getDropEffect();

    @JsProperty(name="dropEffect")
    void setDropEffect(String value);

    @JsProperty(name="effectAllowed")
    String getEffectAllowed();

    @JsProperty(name="effectAllowed")
    void setEffectAllowed(String value);

    @JsProperty(name="files")
    FileList getFiles();

    @JsProperty(name="files")
    void setFiles(FileList value);

    @JsProperty(name="items")
    DataTransferItemList getItems();

    @JsProperty(name="items")
    void setItems(DataTransferItemList value);

    @JsProperty(name="types")
    Array<String> getTypes();

    @JsProperty(name="types")
    void setTypes(Array<String> value);

    boolean clearData(String /* optional */ format);

    String getData(String format);

    boolean setData(String format, String data);
}
