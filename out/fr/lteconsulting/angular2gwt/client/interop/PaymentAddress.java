package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PaymentAddress
  * Typescript fqn PaymentAddress
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PaymentAddress {
    @JsProperty(name="addressLine")
    Array<String> getAddressLine();

    @JsProperty(name="addressLine")
    void setAddressLine(Array<String> value);

    @JsProperty(name="city")
    String getCity();

    @JsProperty(name="city")
    void setCity(String value);

    @JsProperty(name="country")
    String getCountry();

    @JsProperty(name="country")
    void setCountry(String value);

    @JsProperty(name="dependentLocality")
    String getDependentLocality();

    @JsProperty(name="dependentLocality")
    void setDependentLocality(String value);

    @JsProperty(name="languageCode")
    String getLanguageCode();

    @JsProperty(name="languageCode")
    void setLanguageCode(String value);

    @JsProperty(name="organization")
    String getOrganization();

    @JsProperty(name="organization")
    void setOrganization(String value);

    @JsProperty(name="phone")
    String getPhone();

    @JsProperty(name="phone")
    void setPhone(String value);

    @JsProperty(name="postalCode")
    String getPostalCode();

    @JsProperty(name="postalCode")
    void setPostalCode(String value);

    @JsProperty(name="recipient")
    String getRecipient();

    @JsProperty(name="recipient")
    void setRecipient(String value);

    @JsProperty(name="region")
    String getRegion();

    @JsProperty(name="region")
    void setRegion(String value);

    @JsProperty(name="sortingCode")
    String getSortingCode();

    @JsProperty(name="sortingCode")
    void setSortingCode(String value);

    Object toJSON();
}
