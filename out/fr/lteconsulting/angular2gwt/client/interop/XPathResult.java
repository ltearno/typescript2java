package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name XPathResult
  * Typescript fqn XPathResult
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface XPathResult {
    @JsProperty(name="booleanValue")
    boolean getBooleanValue();

    @JsProperty(name="booleanValue")
    void setBooleanValue(boolean value);

    @JsProperty(name="invalidIteratorState")
    boolean getInvalidIteratorState();

    @JsProperty(name="invalidIteratorState")
    void setInvalidIteratorState(boolean value);

    @JsProperty(name="numberValue")
    Number getNumberValue();

    @JsProperty(name="numberValue")
    void setNumberValue(Number value);

    @JsProperty(name="resultType")
    Number getResultType();

    @JsProperty(name="resultType")
    void setResultType(Number value);

    @JsProperty(name="singleNodeValue")
    Node getSingleNodeValue();

    @JsProperty(name="singleNodeValue")
    void setSingleNodeValue(Node value);

    @JsProperty(name="snapshotLength")
    Number getSnapshotLength();

    @JsProperty(name="snapshotLength")
    void setSnapshotLength(Number value);

    @JsProperty(name="stringValue")
    String getStringValue();

    @JsProperty(name="stringValue")
    void setStringValue(String value);

    @JsProperty(name="ANY_TYPE")
    Number getANY_TYPE();

    @JsProperty(name="ANY_TYPE")
    void setANY_TYPE(Number value);

    @JsProperty(name="ANY_UNORDERED_NODE_TYPE")
    Number getANY_UNORDERED_NODE_TYPE();

    @JsProperty(name="ANY_UNORDERED_NODE_TYPE")
    void setANY_UNORDERED_NODE_TYPE(Number value);

    @JsProperty(name="BOOLEAN_TYPE")
    Number getBOOLEAN_TYPE();

    @JsProperty(name="BOOLEAN_TYPE")
    void setBOOLEAN_TYPE(Number value);

    @JsProperty(name="FIRST_ORDERED_NODE_TYPE")
    Number getFIRST_ORDERED_NODE_TYPE();

    @JsProperty(name="FIRST_ORDERED_NODE_TYPE")
    void setFIRST_ORDERED_NODE_TYPE(Number value);

    @JsProperty(name="NUMBER_TYPE")
    Number getNUMBER_TYPE();

    @JsProperty(name="NUMBER_TYPE")
    void setNUMBER_TYPE(Number value);

    @JsProperty(name="ORDERED_NODE_ITERATOR_TYPE")
    Number getORDERED_NODE_ITERATOR_TYPE();

    @JsProperty(name="ORDERED_NODE_ITERATOR_TYPE")
    void setORDERED_NODE_ITERATOR_TYPE(Number value);

    @JsProperty(name="ORDERED_NODE_SNAPSHOT_TYPE")
    Number getORDERED_NODE_SNAPSHOT_TYPE();

    @JsProperty(name="ORDERED_NODE_SNAPSHOT_TYPE")
    void setORDERED_NODE_SNAPSHOT_TYPE(Number value);

    @JsProperty(name="STRING_TYPE")
    Number getSTRING_TYPE();

    @JsProperty(name="STRING_TYPE")
    void setSTRING_TYPE(Number value);

    @JsProperty(name="UNORDERED_NODE_ITERATOR_TYPE")
    Number getUNORDERED_NODE_ITERATOR_TYPE();

    @JsProperty(name="UNORDERED_NODE_ITERATOR_TYPE")
    void setUNORDERED_NODE_ITERATOR_TYPE(Number value);

    @JsProperty(name="UNORDERED_NODE_SNAPSHOT_TYPE")
    Number getUNORDERED_NODE_SNAPSHOT_TYPE();

    @JsProperty(name="UNORDERED_NODE_SNAPSHOT_TYPE")
    void setUNORDERED_NODE_SNAPSHOT_TYPE(Number value);

    Node iterateNext();

    Node snapshotItem(Number index);
}
