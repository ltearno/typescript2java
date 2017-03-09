package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\router\src\router.d.ts
  * Package ng.router
  * Name PreActivation
  * 
  **/
@JsType( isNative=true, namespace="ng.router" )
public class PreActivation  {
    public Object future;
    public Object curr;
    public Object injector;
    public Object checks;
    @JsConstructor
    public PreActivation(RouterStateSnapshot future,RouterStateSnapshot curr,Injector injector) {}
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
