package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralMapExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class LiteralMapExpr extends Expression {
    public JsArray<LiteralMapEntry> entries;
    public Type valueType;
    @JsConstructor
    public LiteralMapExpr(JsArray<LiteralMapEntry> entries,MapType /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
