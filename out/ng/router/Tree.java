package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\router\src\utils\tree.d.ts
  * Package ng.router
  * Name Tree
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class Tree<T>  {
    @JsConstructor
    public Tree(TreeNode<T> root) {}
    public T root;
}
