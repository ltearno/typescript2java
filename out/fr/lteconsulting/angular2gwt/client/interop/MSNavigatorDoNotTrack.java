package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSNavigatorDoNotTrack
  * Typescript fqn MSNavigatorDoNotTrack
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSNavigatorDoNotTrack {
    boolean confirmSiteSpecificTrackingException(ConfirmSiteSpecificExceptionsInformation args);

    boolean confirmWebWideTrackingException(ExceptionInformation args);

    void removeSiteSpecificTrackingException(ExceptionInformation args);

    void removeWebWideTrackingException(ExceptionInformation args);

    void storeSiteSpecificTrackingException(StoreSiteSpecificExceptionsInformation args);

    void storeWebWideTrackingException(StoreExceptionsInformation args);
}
