package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGElementInstance
  * Typescript fqn SVGElementInstance
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGElementInstance extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="childNodes")
    SVGElementInstanceList getChildNodes();

    @JsProperty(name="childNodes")
    void setChildNodes(SVGElementInstanceList value);

    @JsProperty(name="correspondingElement")
    SVGElement getCorrespondingElement();

    @JsProperty(name="correspondingElement")
    void setCorrespondingElement(SVGElement value);

    @JsProperty(name="correspondingUseElement")
    SVGUseElement getCorrespondingUseElement();

    @JsProperty(name="correspondingUseElement")
    void setCorrespondingUseElement(SVGUseElement value);

    @JsProperty(name="firstChild")
    SVGElementInstance getFirstChild();

    @JsProperty(name="firstChild")
    void setFirstChild(SVGElementInstance value);

    @JsProperty(name="lastChild")
    SVGElementInstance getLastChild();

    @JsProperty(name="lastChild")
    void setLastChild(SVGElementInstance value);

    @JsProperty(name="nextSibling")
    SVGElementInstance getNextSibling();

    @JsProperty(name="nextSibling")
    void setNextSibling(SVGElementInstance value);

    @JsProperty(name="parentNode")
    SVGElementInstance getParentNode();

    @JsProperty(name="parentNode")
    void setParentNode(SVGElementInstance value);

    @JsProperty(name="previousSibling")
    SVGElementInstance getPreviousSibling();

    @JsProperty(name="previousSibling")
    void setPreviousSibling(SVGElementInstance value);
}
