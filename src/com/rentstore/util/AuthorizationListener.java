package com.rentstore.util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

import com.rentstore.model.Funcionario;


public class AuthorizationListener implements PhaseListener   {

	private static final long serialVersionUID = 3184144360773990687L;

	@Override
	public void afterPhase(PhaseEvent event) {
		
		FacesContext facesContext = event.getFacesContext();
		String currentPage = facesContext.getViewRoot().getViewId();
		 
		boolean isLoginPage = (currentPage.lastIndexOf("login.xhtml") > -1);
		
		System.out.println(currentPage);
		
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
		 
		if(session==null){
			NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
			nh.handleNavigation(facesContext, null, "login");
			
		}else{
			Funcionario loggedUser = (Funcionario) session.getAttribute("loggeduser");	
			
			if (!isLoginPage && loggedUser == null) {
				NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
				nh.handleNavigation(facesContext, null, "login");
			}
		}
	}

	@Override
	public void beforePhase(PhaseEvent event) {
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}
}
