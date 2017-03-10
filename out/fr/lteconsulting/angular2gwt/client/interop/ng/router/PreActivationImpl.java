package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.router.RouterStateSnapshot;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import ng.router.RouterOutletMap;
import rxjs.Observable;
import ng.router.TreeNode;
import ng.router.ActivatedRouteSnapshot;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name PreActivation
  * 
  **/
@JsType( isNative=true, namespace="ng.router", name="PreActivation" )
public class PreActivationImpl  {
    @JsProperty(name="future")
    Object getFuture();
    @JsProperty(name="future")
    void setFuture(Object value);
    @JsProperty(name="curr")
    Object getCurr();
    @JsProperty(name="curr")
    void setCurr(Object value);
    @JsProperty(name="injector")
    Object getInjector();
    @JsProperty(name="injector")
    void setInjector(Object value);
    @JsProperty(name="checks")
    Object getChecks();
    @JsProperty(name="checks")
    void setChecks(Object value);
    @JsConstructor
    public PreActivationImpl(RouterStateSnapshot future,RouterStateSnapshot curr,Injector injector) {}
    public native  void traverse(RouterOutletMap parentOutletMap);
    public native  Observable<Boolean> checkGuards();
    public native  Observable<Object> resolveData();
    public native  void traverseChildRoutes();
    public native  void traverseRoutes(TreeNode<ActivatedRouteSnapshot> futureNode,TreeNode<ActivatedRouteSnapshot> currNode,RouterOutletMap parentOutletMap,JsArray<ActivatedRouteSnapshot> futurePath);
    public native  void deactiveRouteAndItsChildren();
    public native  void runCanActivate();
    public native  void runCanActivateChild();
    public native  void extractCanActivateChild();
    public native  void runCanDeactivate();
    public native  void runResolve();
    public native  void resolveNode();
    public native  void getToken();
}
