package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Tag;
import ng.core.Text;
import ng.core.Declaration;
import ng.core.Doctype;

/**
  * Generated from tests\@angular\compiler\src\i18n\serializers\xml_helper.d.ts
  * Package ng.core
  * Name IVisitor
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IVisitor  {
     Object visitTag(Tag tag);
     Object visitText(Text text);
     Object visitDeclaration(Declaration decl);
     Object visitDoctype(Doctype doctype);
}
