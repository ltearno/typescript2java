package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\compiler_util\expression_converter.d.ts
  * Package ng.core
  * Name NameResolver
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NameResolver  {
     Expression callPipe(String name,Expression input,JsArray<Expression> args);
     Expression getLocal(String name);
}
