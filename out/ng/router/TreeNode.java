package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\utils\tree.d.ts
  * Package ng.router
  * Name TreeNode
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class TreeNode<T>  {
    public T value;
    public JsArray<TreeNode<T>> children;
    @JsConstructor
    public TreeNode(T value,JsArray<TreeNode<T>> children) {}
    public native  String toString();
}
