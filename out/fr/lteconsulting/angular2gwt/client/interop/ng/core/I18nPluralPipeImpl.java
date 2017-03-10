package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.NgLocalization;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\common\src\pipes\i18n_plural_pipe.d.ts
  * Package ng.core
  * Name I18nPluralPipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="I18nPluralPipe" )
public class I18nPluralPipeImpl extends PipeTransform {
    @JsProperty(name="_localization")
    Object get_localization();
    @JsProperty(name="_localization")
    void set_localization(Object value);
    @JsConstructor
    public I18nPluralPipeImpl(NgLocalization _localization) {}
    public native  String transform(int value,JsTypedObject<String,String> pluralMap);
}
