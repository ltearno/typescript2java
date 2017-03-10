package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\iterable_differs.d.ts
  * Package ng.core
  * Name IterableDiffer
  * A strategy for tracking changes over time to an iterable. Used for {@link NgFor} to
  * respond to changes in an iterable by effecting equivalent changes in the DOM.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IterableDiffer  {
     Object diff(Object object);
     Object onDestroy();
}
