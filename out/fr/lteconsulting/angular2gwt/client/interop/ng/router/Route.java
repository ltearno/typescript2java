package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\router\src\config.d.ts
  * Package ng.router
  * Name Route
  * See {@link Routes} for more details.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Route  {
    /* optional property path*/    @JsProperty(name="path")
    String path();
    @JsProperty(name="path")
    void path(String value);
    /* optional property pathMatch*/    @JsProperty(name="pathMatch")
    String pathMatch();
    @JsProperty(name="pathMatch")
    void pathMatch(String value);
    /* optional property matcher*/    @JsProperty(name="matcher")
    UrlMatcher matcher();
    @JsProperty(name="matcher")
    void matcher(UrlMatcher value);
    /* optional property component*/    @JsProperty(name="component")
    Type<Object> component();
    @JsProperty(name="component")
    void component(Type<Object> value);
    /* optional property redirectTo*/    @JsProperty(name="redirectTo")
    String redirectTo();
    @JsProperty(name="redirectTo")
    void redirectTo(String value);
    /* optional property outlet*/    @JsProperty(name="outlet")
    String outlet();
    @JsProperty(name="outlet")
    void outlet(String value);
    /* optional property canActivate*/    @JsProperty(name="canActivate")
    JsArray<Object> canActivate();
    @JsProperty(name="canActivate")
    void canActivate(JsArray<Object> value);
    /* optional property canActivateChild*/    @JsProperty(name="canActivateChild")
    JsArray<Object> canActivateChild();
    @JsProperty(name="canActivateChild")
    void canActivateChild(JsArray<Object> value);
    /* optional property canDeactivate*/    @JsProperty(name="canDeactivate")
    JsArray<Object> canDeactivate();
    @JsProperty(name="canDeactivate")
    void canDeactivate(JsArray<Object> value);
    /* optional property canLoad*/    @JsProperty(name="canLoad")
    JsArray<Object> canLoad();
    @JsProperty(name="canLoad")
    void canLoad(JsArray<Object> value);
    /* optional property data*/    @JsProperty(name="data")
    Data data();
    @JsProperty(name="data")
    void data(Data value);
    /* optional property resolve*/    @JsProperty(name="resolve")
    ResolveData resolve();
    @JsProperty(name="resolve")
    void resolve(ResolveData value);
    /* optional property children*/    @JsProperty(name="children")
    Routes children();
    @JsProperty(name="children")
    void children(Routes value);
    /* optional property loadChildren*/    @JsProperty(name="loadChildren")
    /* NO SYMBOL */LoadChildren loadChildren();
    @JsProperty(name="loadChildren")
    void loadChildren(/* NO SYMBOL */LoadChildren value);
}
