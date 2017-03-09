package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\common\src\pipes\i18n_plural_pipe.d.ts
  * Package ng.core
  * Name I18nPluralPipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class I18nPluralPipe extends PipeTransform {
    public Object _localization;
    @JsConstructor
    public I18nPluralPipe(NgLocalization _localization) {}
    public native  String transform(int value,JsTypedObject<String,String> pluralMap);
}
