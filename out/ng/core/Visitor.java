package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Visitor
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class Visitor  {
    public native  Object visitText(Text text,Object /* optional */ context);
    public native  Object visitContainer(Container container,Object /* optional */ context);
    public native  Object visitIcu(Icu icu,Object /* optional */ context);
    public native  Object visitTagPlaceholder(TagPlaceholder ph,Object /* optional */ context);
    public native  Object visitPlaceholder(Placeholder ph,Object /* optional */ context);
    public native  Object visitIcuPlaceholder(IcuPlaceholder ph,Object /* optional */ context);
}
