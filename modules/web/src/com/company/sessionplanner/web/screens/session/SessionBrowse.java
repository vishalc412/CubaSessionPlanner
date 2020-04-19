package com.company.sessionplanner.web.screens.session;

import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.LayoutClickNotifier;
import com.haulmont.cuba.gui.screen.*;
import com.company.sessionplanner.entity.Session;

import javax.inject.Inject;

@UiController("sessionplanner_Session.browse")
@UiDescriptor("session-browse.xml")
@LookupComponent("sessionsTable")
@LoadDataBeforeShow
public class SessionBrowse extends StandardLookup<Session> {
    @Inject
    private ScreenBuilders screenBuilders;

    @Subscribe("tab1")
    public void onTab1LayoutClick(LayoutClickNotifier.LayoutClickEvent event) {
        screenBuilders.editor(Session.class, this).editEntity((Session) event.getClickedComponent() );
    }

}