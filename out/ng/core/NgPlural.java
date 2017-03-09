package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_plural.d.ts
  * Package ng.core
  * Name NgPlural
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgPlural  {
    public Object _localization;
    public Object _switchValue;
    public Object _activeView;
    public Object _caseViews;
    @JsConstructor
    public NgPlural(NgLocalization _localization) {}
    public int ngPlural;
    public native  void addCase(String value,SwitchView switchView);
    public native  void _updateView();
    public native  void _clearViews();
    public native  void _activateView();
}
