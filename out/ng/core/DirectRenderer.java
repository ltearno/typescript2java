package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\core\src\render\api.d.ts
  * Package ng.core
  * Name DirectRenderer
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class DirectRenderer  {
    public native  void remove(Object node);
    public native  void appendChild(Object node,Object parent);
    public native  void insertBefore(Object node,Object refNode);
    public native  Object nextSibling(Object node);
    public native  Object parentElement(Object node);
}
