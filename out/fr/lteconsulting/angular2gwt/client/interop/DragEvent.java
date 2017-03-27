package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DragEvent
  * Typescript fqn DragEvent
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DragEvent extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="dataTransfer")
    DataTransfer getDataTransfer();

    @JsProperty(name="dataTransfer")
    void setDataTransfer(DataTransfer value);

    void initDragEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Window viewArg, Number detailArg, Number screenXArg, Number screenYArg, Number clientXArg, Number clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, Number buttonArg, EventTarget relatedTargetArg, DataTransfer dataTransferArg);

    void msConvertURL(File file, String targetType, String /* optional */ targetURL);
}
