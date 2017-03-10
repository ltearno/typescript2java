package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationStateMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\animation\metadata.d.ts
  * Package ng.core
  * Name AnimationEntryMetadata
  * Metadata representing the entry of animations.
  * Instances of this class are provided via the animation DSL when the {@link trigger trigger
  * animation function} is called.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationEntryMetadata  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="definitions")
    JsArray<AnimationStateMetadata> getDefinitions();
    @JsProperty(name="definitions")
    void setDefinitions(JsArray<AnimationStateMetadata> value);
    @JsConstructor
    public AnimationEntryMetadata(String name,JsArray<AnimationStateMetadata> definitions) {}
}
