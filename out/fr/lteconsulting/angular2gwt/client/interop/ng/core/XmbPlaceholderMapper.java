package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Message;
import jsinterop.annotations.JsConstructor;
import ng.core.Text;
import ng.core.Container;
import ng.core.Icu;
import ng.core.TagPlaceholder;
import ng.core.Placeholder;
import ng.core.IcuPlaceholder;

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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface XmbPlaceholderMapper extends PlaceholderMapper {
    @JsProperty(name="internalToXmb")
    Object getInternalToXmb();
    @JsProperty(name="internalToXmb")
    void setInternalToXmb(Object value);
    @JsProperty(name="xmbToNextId")
    Object getXmbToNextId();
    @JsProperty(name="xmbToNextId")
    void setXmbToNextId(Object value);
    @JsProperty(name="xmbToInternal")
    Object getXmbToInternal();
    @JsProperty(name="xmbToInternal")
    void setXmbToInternal(Object value);
    @JsConstructor
    public XmbPlaceholderMapper(Message message) {}
     String toPublicName(String internalName);
     String toInternalName(String publicName);
     Object visitText(Text text,Object /* optional */ ctx);
     Object visitContainer(Container container,Object /* optional */ ctx);
     Object visitIcu(Icu icu,Object /* optional */ ctx);
     Object visitTagPlaceholder(TagPlaceholder ph,Object /* optional */ ctx);
     Object visitPlaceholder(Placeholder ph,Object /* optional */ ctx);
     Object visitIcuPlaceholder(IcuPlaceholder ph,Object /* optional */ ctx);
     void addPlaceholder();
}
