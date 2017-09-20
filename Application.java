package fr.lteconsulting;

import com.google.gwt.core.client.EntryPoint;
import fr.lteconsulting.angular2gwt.interop.HTMLButtonElement;
import fr.lteconsulting.angular2gwt.interop.HTMLElement;
import global.GlobalScope;
import jsinterop.base.Js;

import static global.GlobalScope.console;
import static global.GlobalScope.document;

public class Application implements EntryPoint {
    @Override
    public void onModuleLoad() {
        HTMLButtonElement button = (HTMLButtonElement) document.createElement("button");
        document.body.appendChild(button);

        button.addEventListener("click", event -> {
            console.log("Coucou", Js.undefined());
            HTMLElement div = document.createElement("div");
            div.setInnerText("COUCOU");
            document.body.appendChild(div);
        }, false);
    }
}
