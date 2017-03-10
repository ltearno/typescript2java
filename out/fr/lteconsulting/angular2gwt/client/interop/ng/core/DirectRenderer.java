package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\core\src\render\api.d.ts
  * Package ng.core
  * Name DirectRenderer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DirectRenderer  {
     void remove(Object node);
     void appendChild(Object node,Object parent);
     void insertBefore(Object node,Object refNode);
     Object nextSibling(Object node);
     Object parentElement(Object node);
}
