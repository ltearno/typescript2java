package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\view_ref.d.ts
  * Package ng.core
  * Name EmbeddedViewRef
  * Represents an Angular View.
  * 
  * <!-- TODO: move the next two paragraphs to the dev guide -->
  * A View is a fundamental building block of the application UI. It is the smallest grouping of
  * Elements which are created and destroyed together.
  * 
  * Properties of elements in a View can change, but the structure (number and order) of elements in
  * a View cannot. Changing the structure of Elements can only be done by inserting, moving or
  * removing nested Views via a {@link ViewContainerRef}. Each View can contain many View Containers.
  * <!-- /TODO -->
  * 
  * ### Example
  * 
  * Given this template...
  * 
  * ```
  * Count: {{items.length}}
  * <ul>
  *    <li *ngFor="let  item of items">{{item}}</li>
  * </ul>
  * ```
  * 
  * We have two {@link TemplateRef}s:
  * 
  * Outer {@link TemplateRef}:
  * ```
  * Count: {{items.length}}
  * <ul>
  *    <template ngFor let-item [ngForOf]="items"></template>
  * </ul>
  * ```
  * 
  * Inner {@link TemplateRef}:
  * ```
  *    <li>{{item}}</li>
  * ```
  * 
  * Notice that the original template is broken down into two separate {@link TemplateRef}s.
  * 
  * The outer/inner {@link TemplateRef}s are then assembled into views like so:
  * 
  * ```
  * <!-- ViewRef: outer-0 -->
  * Count: 2
  * <ul>
  *    <template view-container-ref></template>
  *    <!-- ViewRef: inner-1 --><li>first</li><!-- /ViewRef: inner-1 -->
  *    <!-- ViewRef: inner-2 --><li>second</li><!-- /ViewRef: inner-2 -->
  * </ul>
  * <!-- /ViewRef: outer-0 -->
  * ```
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface EmbeddedViewRef<C> extends ViewRef {
    @JsProperty(name="context")
    C context();
    @JsProperty(name="context")
    void context(C value);
    @JsProperty(name="rootNodes")
    JsArray<Object> rootNodes();
    @JsProperty(name="rootNodes")
    void rootNodes(JsArray<Object> value);
}
