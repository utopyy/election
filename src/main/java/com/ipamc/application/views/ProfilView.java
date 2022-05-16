package com.ipamc.application.views;


import com.ipamc.application.views.MainLayout;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Profil")
@Route(value = "profil", layout = MainLayout.class)
@Uses(Icon.class)
public class ProfilView extends Div {



    public ProfilView() {
        addClassName("profil-view");

    }


}
