package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name URL
  * Typescript fqn URL
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface URL {
    @JsProperty(name="hash")
    String getHash();

    @JsProperty(name="hash")
    void setHash(String value);

    @JsProperty(name="host")
    String getHost();

    @JsProperty(name="host")
    void setHost(String value);

    @JsProperty(name="hostname")
    String getHostname();

    @JsProperty(name="hostname")
    void setHostname(String value);

    @JsProperty(name="href")
    String getHref();

    @JsProperty(name="href")
    void setHref(String value);

    @JsProperty(name="origin")
    String getOrigin();

    @JsProperty(name="origin")
    void setOrigin(String value);

    @JsProperty(name="password")
    String getPassword();

    @JsProperty(name="password")
    void setPassword(String value);

    @JsProperty(name="pathname")
    String getPathname();

    @JsProperty(name="pathname")
    void setPathname(String value);

    @JsProperty(name="port")
    String getPort();

    @JsProperty(name="port")
    void setPort(String value);

    @JsProperty(name="protocol")
    String getProtocol();

    @JsProperty(name="protocol")
    void setProtocol(String value);

    @JsProperty(name="search")
    String getSearch();

    @JsProperty(name="search")
    void setSearch(String value);

    @JsProperty(name="username")
    String getUsername();

    @JsProperty(name="username")
    void setUsername(String value);

    @JsProperty(name="searchparams")
    URLSearchParams getSearchparams();

    @JsProperty(name="searchparams")
    void setSearchparams(URLSearchParams value);

    String toString();
}
