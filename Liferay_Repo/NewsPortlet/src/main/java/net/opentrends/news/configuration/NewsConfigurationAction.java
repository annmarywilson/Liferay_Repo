package net.opentrends.news.configuration;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

public class NewsConfigurationAction implements ConfigurationAction {

	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		String portletResource = ParamUtil.getString(actionRequest, "portletResource");
        String portletName=(String) actionRequest.getAttribute(WebKeys.PORTLET_ID);
        
        String structureKey=ParamUtil.getString(actionRequest, "structureKey");
        PortletPreferences preferences=PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource);
        preferences.setValue("structureKey", structureKey);
        preferences.store();
        SessionMessages.add(actionRequest, portletName+".doConfigure");
        SessionMessages.add(actionRequest, "portlet-config-saved");
	}
	@Override
	public String render(PortletConfig portletConfig, RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {
		return "/html/news/configuration.jsp";
	}

}
