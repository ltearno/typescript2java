package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.router.TreeNode;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\utils\tree.d.ts
  * Package ng.router
  * Name TreeNode
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="TreeNode" )
public class TreeNodeImpl<T>  {
    @JsProperty(name="value")
    T getValue();
    @JsProperty(name="value")
    void setValue(T value);
    @JsProperty(name="children")
    JsArray<TreeNode<T>> getChildren();
    @JsProperty(name="children")
    void setChildren(JsArray<TreeNode<T>> value);
    @JsConstructor
    public TreeNodeImpl(T value,JsArray<TreeNode<T>> children) {}
    public native  String toString();
}
