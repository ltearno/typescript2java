package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Summary;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\summary_resolver.d.ts
  * Package ng.core
  * Name SummaryResolver
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SummaryResolver<T>  {
     Summary<T> resolveSummary(T reference);
     JsArray<T> getSymbolsOf(String filePath);
}
