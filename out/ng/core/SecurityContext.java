package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\core\src\security.d.ts
  * Package ng.core
  * Name SecurityContext
  * A SecurityContext marks a location that has dangerous security implications, e.g. a DOM property
  * like `innerHTML` that could cause Cross Site Scripting (XSS) security bugs when improperly
  * handled.
  * 
  * See DomSanitizer for more details on security in Angular applications.
  **/
public interface SecurityContext {
    final int NONE = 0;
    final int HTML = 1;
    final int STYLE = 2;
    final int SCRIPT = 3;
    final int URL = 4;
    final int RESOURCE_URL = 5;
}
