package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGElement
  * Typescript fqn SVGElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="className")
    Object getClassName();

    @JsProperty(name="className")
    void setClassName(Object value);

    @JsProperty(name="onclick")
    JsFunction2<SVGElement,MouseEvent,Object> getOnclick();

    @JsProperty(name="onclick")
    void setOnclick(JsFunction2<SVGElement,MouseEvent,Object> value);

    @JsProperty(name="ondblclick")
    JsFunction2<SVGElement,MouseEvent,Object> getOndblclick();

    @JsProperty(name="ondblclick")
    void setOndblclick(JsFunction2<SVGElement,MouseEvent,Object> value);

    @JsProperty(name="onfocusin")
    JsFunction2<SVGElement,FocusEvent,Object> getOnfocusin();

    @JsProperty(name="onfocusin")
    void setOnfocusin(JsFunction2<SVGElement,FocusEvent,Object> value);

    @JsProperty(name="onfocusout")
    JsFunction2<SVGElement,FocusEvent,Object> getOnfocusout();

    @JsProperty(name="onfocusout")
    void setOnfocusout(JsFunction2<SVGElement,FocusEvent,Object> value);

    @JsProperty(name="onload")
    JsFunction2<SVGElement,Event,Object> getOnload();

    @JsProperty(name="onload")
    void setOnload(JsFunction2<SVGElement,Event,Object> value);

    @JsProperty(name="onmousedown")
    JsFunction2<SVGElement,MouseEvent,Object> getOnmousedown();

    @JsProperty(name="onmousedown")
    void setOnmousedown(JsFunction2<SVGElement,MouseEvent,Object> value);

    @JsProperty(name="onmousemove")
    JsFunction2<SVGElement,MouseEvent,Object> getOnmousemove();

    @JsProperty(name="onmousemove")
    void setOnmousemove(JsFunction2<SVGElement,MouseEvent,Object> value);

    @JsProperty(name="onmouseout")
    JsFunction2<SVGElement,MouseEvent,Object> getOnmouseout();

    @JsProperty(name="onmouseout")
    void setOnmouseout(JsFunction2<SVGElement,MouseEvent,Object> value);

    @JsProperty(name="onmouseover")
    JsFunction2<SVGElement,MouseEvent,Object> getOnmouseover();

    @JsProperty(name="onmouseover")
    void setOnmouseover(JsFunction2<SVGElement,MouseEvent,Object> value);

    @JsProperty(name="onmouseup")
    JsFunction2<SVGElement,MouseEvent,Object> getOnmouseup();

    @JsProperty(name="onmouseup")
    void setOnmouseup(JsFunction2<SVGElement,MouseEvent,Object> value);

    @JsProperty(name="ownerSVGElement")
    SVGSVGElement getOwnerSVGElement();

    @JsProperty(name="ownerSVGElement")
    void setOwnerSVGElement(SVGSVGElement value);

    @JsProperty(name="style")
    CSSStyleDeclaration getStyle();

    @JsProperty(name="style")
    void setStyle(CSSStyleDeclaration value);

    @JsProperty(name="viewportElement")
    SVGElement getViewportElement();

    @JsProperty(name="viewportElement")
    void setViewportElement(SVGElement value);

    @JsProperty(name="xmlbase")
    String getXmlbase();

    @JsProperty(name="xmlbase")
    void setXmlbase(String value);

    <K> void addEventListener(K type, JsFunction2<SVGElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
