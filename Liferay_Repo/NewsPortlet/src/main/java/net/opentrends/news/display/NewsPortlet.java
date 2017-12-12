package net.opentrends.news.display;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;
public class NewsPortlet extends MVCPortlet {
 
public void serveResource(ResourceRequest request,ResourceResponse response) throws IOException, PortletException{
	String selectedStructure = request.getParameter("selectedStructure");
    response.setContentType("text/html");
	super.serveResource(request, response);
}
}
