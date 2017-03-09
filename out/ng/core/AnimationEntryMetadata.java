package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationEntryMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link trigger trigger
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationEntryMetadata  {
    public String name;
    public JsArray<AnimationStateMetadata> definitions;
    @JsConstructor
    public AnimationEntryMetadata(String name,JsArray<AnimationStateMetadata> definitions) {}
}
