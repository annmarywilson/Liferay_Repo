package net.opentrends.register.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import net.opentrends.register.service.AddressLocalServiceUtil;
import net.opentrends.register.service.ClpSerializer;
import net.opentrends.register.service.StudentLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AddressLocalServiceUtil.clearService();

            StudentLocalServiceUtil.clearService();
        }
    }
}
