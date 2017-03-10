package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.BuiltinType;
import ng.core.ExpressionType;
import ng.core.ArrayType;
import ng.core.MapType;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name TypeVisitor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TypeVisitor  {
     Object visitBuiltintType(BuiltinType type,Object context);
     Object visitExpressionType(ExpressionType type,Object context);
     Object visitArrayType(ArrayType type,Object context);
     Object visitMapType(MapType type,Object context);
}
