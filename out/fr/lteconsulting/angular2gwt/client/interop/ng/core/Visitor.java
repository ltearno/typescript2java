package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Text;
import ng.core.Container;
import ng.core.Icu;
import ng.core.TagPlaceholder;
import ng.core.Placeholder;
import ng.core.IcuPlaceholder;

/**
  * Generated from tests\@angular\compiler\src\i18n\i18n_ast.d.ts
  * Package ng.core
  * Name Visitor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Visitor  {
     Object visitText(Text text,Object /* optional */ context);
     Object visitContainer(Container container,Object /* optional */ context);
     Object visitIcu(Icu icu,Object /* optional */ context);
     Object visitTagPlaceholder(TagPlaceholder ph,Object /* optional */ context);
     Object visitPlaceholder(Placeholder ph,Object /* optional */ context);
     Object visitIcuPlaceholder(IcuPlaceholder ph,Object /* optional */ context);
}
