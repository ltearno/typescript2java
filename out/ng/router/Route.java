package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\router\src\config.d.ts
  * Package ng.router
  * Name Route
  * See {@link Routes} for more details.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class Route  {
    public /* optional */ String path;
    public /* optional */ String pathMatch;
    public /* optional */ UrlMatcher matcher;
    public /* optional */ Type<Object> component;
    public /* optional */ String redirectTo;
    public /* optional */ String outlet;
    public /* optional */ JsArray<Object> canActivate;
    public /* optional */ JsArray<Object> canActivateChild;
    public /* optional */ JsArray<Object> canDeactivate;
    public /* optional */ JsArray<Object> canLoad;
    public /* optional */ Data data;
    public /* optional */ ResolveData resolve;
    public /* optional */ Routes children;
    public /* optional */ /* NO SYMBOL */LoadChildren loadChildren;
}
