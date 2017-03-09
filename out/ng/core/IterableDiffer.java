package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\iterable_differs.d.ts
  * Package ng.core
  * Name IterableDiffer
  * A strategy for tracking changes over time to an iterable. Used for {@link NgFor} to
  * respond to changes in an iterable by effecting equivalent changes in the DOM.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class IterableDiffer  {
    public native  Object diff(Object object);
    public native  Object onDestroy();
}
