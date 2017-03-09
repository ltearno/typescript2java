package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import ng.core.ModuleWithProviders;

/**
  * Generated from tests\@angular\router\src\router_module.d.ts
  * Package ng.router
  * Name RouterModule
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class RouterModule  {
    @JsConstructor
    public RouterModule(Object guard) {}
    public static native  ModuleWithProviders forRoot(Routes routes,ExtraOptions /* optional */ config);
    public static native  ModuleWithProviders forChild(Routes routes);
}
