package com.first.web.portlet;

import com.first.web.constants.FirstWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.annotations.ActionMethod;

import org.osgi.service.component.annotations.Component;

/**
 * @author dell
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=Mine",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=First Web", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.name=" + FirstWebPortletKeys.FIRSTWEB,
		"javax.portlet.resource-bundle=content.Language", "javax.portlet.security-role-ref=power-user,user"

}, service = Portlet.class)
public class FirstWebPortlet extends MVCPortlet {
	@ProcessAction(name = "submitForm")
	public void submitForm(ActionRequest ac, ActionResponse ar) {
		String name = ParamUtil.getString(ac, "firstname");
		System.out.println(name);
	}
	
	@Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse)
				throws IOException, PortletException {
			// TODO Auto-generated method stub
			super.render(renderRequest, renderResponse);
		}
	
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.serveResource(resourceRequest, resourceResponse);
	}
}