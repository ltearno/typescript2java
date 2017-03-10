package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.router.TreeNode;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\router\src\utils\tree.d.ts
  * Package ng.router
  * Name Tree
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="Tree" )
public class TreeImpl<T>  {
    @JsConstructor
    public TreeImpl(TreeNode<T> root) {}
    @JsProperty(name="root")
    T getRoot();
    @JsProperty(name="root")
    void setRoot(T value);
}
