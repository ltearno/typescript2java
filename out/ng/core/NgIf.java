package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_if.d.ts
  * Package ng.core
  * Name NgIf
  * Removes or recreates a portion of the DOM tree based on an {expression}.
  * 
  * If the expression assigned to `ngIf` evaluates to a falsy value then the element
  * is removed from the DOM, otherwise a clone of the element is reinserted into the DOM.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/fe0kgemFBtmQOY31b4tw?p=preview)):
  * 
  * ```
  * <div *ngIf="errorCount > 0" class="error">
  *    <!-- Error message displayed when the errorCount property in the current context is greater
  * than 0. -->
  *    {{errorCount}} errors detected
  * </div>
  * ```
  * 
  * ### Syntax
  * 
  * - `<div *ngIf="condition">...</div>`
  * - `<div template="ngIf condition">...</div>`
  * - `<template [ngIf]="condition"><div>...</div></template>`
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgIf  {
    public Object _viewContainer;
    public Object _template;
    public Object _hasView;
    @JsConstructor
    public NgIf(ViewContainerRef _viewContainer,TemplateRef<Object> _template) {}
    public Object ngIf;
}