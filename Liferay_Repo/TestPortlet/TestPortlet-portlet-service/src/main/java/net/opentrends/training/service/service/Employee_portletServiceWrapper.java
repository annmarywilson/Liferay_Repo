package net.opentrends.training.service.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Employee_portletService}.
 *
 * @author Brian Wing Shun Chan
 * @see Employee_portletService
 * @generated
 */
public class Employee_portletServiceWrapper implements Employee_portletService,
    ServiceWrapper<Employee_portletService> {
    private Employee_portletService _employee_portletService;

    public Employee_portletServiceWrapper(
        Employee_portletService employee_portletService) {
        _employee_portletService = employee_portletService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _employee_portletService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employee_portletService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employee_portletService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Employee_portletService getWrappedEmployee_portletService() {
        return _employee_portletService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmployee_portletService(
        Employee_portletService employee_portletService) {
        _employee_portletService = employee_portletService;
    }

    @Override
    public Employee_portletService getWrappedService() {
        return _employee_portletService;
    }

    @Override
    public void setWrappedService(
        Employee_portletService employee_portletService) {
        _employee_portletService = employee_portletService;
    }
}
