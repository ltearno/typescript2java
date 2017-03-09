package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\animation\view_animation_map.d.ts
  * Package ng.core
  * Name ViewAnimationMap
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ViewAnimationMap  {
    public Object _map;
    public Object _allPlayers;
    public native  AnimationPlayer find(Object element,String animationName);
    public native  JsArray<AnimationPlayer> findAllPlayersByElement(Object element);
    public native  void set(Object element,String animationName,AnimationPlayer player);
    public native  JsArray<AnimationPlayer> getAllPlayers();
    public native  void remove(Object element,String animationName,AnimationPlayer /* optional */ targetPlayer);
}
