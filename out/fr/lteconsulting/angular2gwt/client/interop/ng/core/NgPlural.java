package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.NgLocalization;
import jsinterop.annotations.JsConstructor;
import ng.core.SwitchView;

/**
  * Generated from tests\@angular\common\src\directives\ng_plural.d.ts
  * Package ng.core
  * Name NgPlural
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgPlural  {
    @JsProperty(name="_localization")
    Object get_localization();
    @JsProperty(name="_localization")
    void set_localization(Object value);
    @JsProperty(name="_switchValue")
    Object get_switchValue();
    @JsProperty(name="_switchValue")
    void set_switchValue(Object value);
    @JsProperty(name="_activeView")
    Object get_activeView();
    @JsProperty(name="_activeView")
    void set_activeView(Object value);
    @JsProperty(name="_caseViews")
    Object get_caseViews();
    @JsProperty(name="_caseViews")
    void set_caseViews(Object value);
    @JsConstructor
    public NgPlural(NgLocalization _localization) {}
    @JsProperty(name="ngPlural")
    int getNgPlural();
    @JsProperty(name="ngPlural")
    void setNgPlural(int value);
     void addCase(String value,SwitchView switchView);
     void _updateView();
     void _clearViews();
     void _activateView();
}
