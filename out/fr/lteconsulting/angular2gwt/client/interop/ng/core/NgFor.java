package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.TrackByFn;
import ng.core.ViewContainerRef;
import ng.core.TemplateRef;
import ng.core.NgForRow;
import ng.core.IterableDiffers;
import ng.core.ChangeDetectorRef;
import jsinterop.annotations.JsConstructor;
import ng.core.SimpleChanges;

/**
  * Generated from tests\@angular\common\src\directives\ng_for.d.ts
  * Package ng.core
  * Name NgFor
  * The `NgFor` directive instantiates a template once per item from an iterable. The context for
  * each instantiated template inherits from the outer context with the given loop variable set
  * to the current item from the iterable.
  * 
  * ### Local Variables
  * 
  * `NgFor` provides several exported values that can be aliased to local variables:
  * 
  * * `index` will be set to the current loop iteration for each template context.
  * * `first` will be set to a boolean value indicating whether the item is the first one in the
  *    iteration.
  * * `last` will be set to a boolean value indicating whether the item is the last one in the
  *    iteration.
  * * `even` will be set to a boolean value indicating whether this item has an even index.
  * * `odd` will be set to a boolean value indicating whether this item has an odd index.
  * 
  * ### Change Propagation
  * 
  * When the contents of the iterator changes, `NgFor` makes the corresponding changes to the DOM:
  * 
  * * When an item is added, a new instance of the template is added to the DOM.
  * * When an item is removed, its template instance is removed from the DOM.
  * * When items are reordered, their respective templates are reordered in the DOM.
  * * Otherwise, the DOM element for that item will remain the same.
  * 
  * Angular uses object identity to track insertions and deletions within the iterator and reproduce
  * those changes in the DOM. This has important implications for animations and any stateful
  * controls
  * (such as `<input>` elements which accept user input) that are present. Inserted rows can be
  * animated in, deleted rows can be animated out, and unchanged rows retain any unsaved state such
  * as user input.
  * 
  * It is possible for the identities of elements in the iterator to change while the data does not.
  * This can happen, for example, if the iterator produced from an RPC to the server, and that
  * RPC is re-run. Even if the data hasn't changed, the second response will produce objects with
  * different identities, and Angular will tear down the entire DOM and rebuild it (as if all old
  * elements were deleted and all new elements inserted). This is an expensive operation and should
  * be avoided if possible.
  * 
  * To customize the default tracking algorithm, `NgFor` supports `trackBy` option.
  * `trackBy` takes a function which has two arguments: `index` and `item`.
  * If `trackBy` is given, Angular tracks changes by the return value of the function.
  * 
  * ### Syntax
  * 
  * - `<li *ngFor="let item of items; let i = index; trackBy: trackByFn">...</li>`
  * - `<li template="ngFor let item of items; let i = index; trackBy: trackByFn">...</li>`
  * 
  * With `<template>` element:
  * 
  * ```
  * <template ngFor let-item [ngForOf]="items" let-i="index" [ngForTrackBy]="trackByFn">
  *    <li>...</li>
  * </template>
  * ```
  * 
  * ### Example
  * 
  * See a [live demo](http://plnkr.co/edit/KVuXxDp0qinGDyo307QW?p=preview) for a more detailed
  * example.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgFor extends DoCheck {
    @JsProperty(name="_viewContainer")
    Object get_viewContainer();
    @JsProperty(name="_viewContainer")
    void set_viewContainer(Object value);
    @JsProperty(name="_template")
    Object get_template();
    @JsProperty(name="_template")
    void set_template(Object value);
    @JsProperty(name="_differs")
    Object get_differs();
    @JsProperty(name="_differs")
    void set_differs(Object value);
    @JsProperty(name="_cdr")
    Object get_cdr();
    @JsProperty(name="_cdr")
    void set_cdr(Object value);
    @JsProperty(name="ngForOf")
    Object getNgForOf();
    @JsProperty(name="ngForOf")
    void setNgForOf(Object value);
    @JsProperty(name="ngForTrackBy")
    TrackByFn getNgForTrackBy();
    @JsProperty(name="ngForTrackBy")
    void setNgForTrackBy(TrackByFn value);
    @JsProperty(name="_differ")
    Object get_differ();
    @JsProperty(name="_differ")
    void set_differ(Object value);
    @JsProperty(name="_trackByFn")
    Object get_trackByFn();
    @JsProperty(name="_trackByFn")
    void set_trackByFn(Object value);
    @JsConstructor
    public NgFor(ViewContainerRef _viewContainer,TemplateRef<NgForRow> _template,IterableDiffers _differs,ChangeDetectorRef _cdr) {}
    @JsProperty(name="ngForTemplate")
    TemplateRef<NgForRow> getNgForTemplate();
    @JsProperty(name="ngForTemplate")
    void setNgForTemplate(TemplateRef<NgForRow> value);
     void ngOnChanges(SimpleChanges changes);
     void ngDoCheck();
     void _applyChanges();
     void _perViewChange();
}
