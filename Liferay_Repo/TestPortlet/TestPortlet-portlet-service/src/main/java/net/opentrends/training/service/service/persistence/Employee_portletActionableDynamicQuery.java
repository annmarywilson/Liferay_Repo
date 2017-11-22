package net.opentrends.training.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.training.service.model.Employee_portlet;
import net.opentrends.training.service.service.Employee_portletLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class Employee_portletActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public Employee_portletActionableDynamicQuery() throws SystemException {
        setBaseLocalService(Employee_portletLocalServiceUtil.getService());
        setClass(Employee_portlet.class);

        setClassLoader(net.opentrends.training.service.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("employeeId");
    }
}
