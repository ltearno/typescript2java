package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xmb.d.ts
  * Package ng.core
  * Name XmbPlaceholderMapper
  * XMB/XTB placeholders can only contain A-Z, 0-9 and _
  * 
  * Because such restrictions do not exist on placeholder names generated locally, the
  * `PlaceholderMapper` is used to convert internal names to XMB names when the XMB file is
  * serialized and back from XTB to internal names when an XTB is loaded.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class XmbPlaceholderMapper extends PlaceholderMapper {
    public Object internalToXmb;
    public Object xmbToNextId;
    public Object xmbToInternal;
    @JsConstructor
    public XmbPlaceholderMapper(Message message) {}
    public native  String toPublicName(String internalName);
    public native  String toInternalName(String publicName);
    public native  Object visitText(Text text,Object /* optional */ ctx);
    public native  Object visitContainer(Container container,Object /* optional */ ctx);
    public native  Object visitIcu(Icu icu,Object /* optional */ ctx);
    public native  Object visitTagPlaceholder(TagPlaceholder ph,Object /* optional */ ctx);
    public native  Object visitPlaceholder(Placeholder ph,Object /* optional */ ctx);
    public native  Object visitIcuPlaceholder(IcuPlaceholder ph,Object /* optional */ ctx);
    public native  void addPlaceholder();
}
