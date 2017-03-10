package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_preparser.d.ts
  * Package ng.core
  * Name PreparsedElement
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="PreparsedElement" )
public class PreparsedElementImpl  {
    @JsProperty(name="type")
    /* ng.core.PreparsedElementType */ int getType();
    @JsProperty(name="type")
    void setType(/* ng.core.PreparsedElementType */ int value);
    @JsProperty(name="selectAttr")
    String getSelectAttr();
    @JsProperty(name="selectAttr")
    void setSelectAttr(String value);
    @JsProperty(name="hrefAttr")
    String getHrefAttr();
    @JsProperty(name="hrefAttr")
    void setHrefAttr(String value);
    @JsProperty(name="nonBindable")
    boolean getNonBindable();
    @JsProperty(name="nonBindable")
    void setNonBindable(boolean value);
    @JsProperty(name="projectAs")
    String getProjectAs();
    @JsProperty(name="projectAs")
    void setProjectAs(String value);
    @JsConstructor
    public PreparsedElementImpl(/* ng.core.PreparsedElementType */ int type,String selectAttr,String hrefAttr,boolean nonBindable,String projectAs) {}
}
