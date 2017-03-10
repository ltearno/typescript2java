package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationPlayer;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\animation\view_animation_map.d.ts
  * Package ng.core
  * Name ViewAnimationMap
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewAnimationMap" )
public class ViewAnimationMapImpl  {
    @JsProperty(name="_map")
    Object get_map();
    @JsProperty(name="_map")
    void set_map(Object value);
    @JsProperty(name="_allPlayers")
    Object get_allPlayers();
    @JsProperty(name="_allPlayers")
    void set_allPlayers(Object value);
    public native  AnimationPlayer find(Object element,String animationName);
    public native  JsArray<AnimationPlayer> findAllPlayersByElement(Object element);
    public native  void set(Object element,String animationName,AnimationPlayer player);
    public native  JsArray<AnimationPlayer> getAllPlayers();
    public native  void remove(Object element,String animationName,AnimationPlayer /* optional */ targetPlayer);
}
