package net.opentrends.training.service.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.training.service.model.Employee_portlet;

import java.util.List;

/**
 * The persistence utility for the employee_portlet service. This utility wraps {@link Employee_portletPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee_portletPersistence
 * @see Employee_portletPersistenceImpl
 * @generated
 */
public class Employee_portletUtil {
    private static Employee_portletPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Employee_portlet employee_portlet) {
        getPersistence().clearCache(employee_portlet);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Employee_portlet> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Employee_portlet> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Employee_portlet> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Employee_portlet update(Employee_portlet employee_portlet)
        throws SystemException {
        return getPersistence().update(employee_portlet);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Employee_portlet update(Employee_portlet employee_portlet,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employee_portlet, serviceContext);
    }

    /**
    * Returns all the employee_portlets where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee_portlet> findBysiteId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBysiteId(groupId);
    }

    /**
    * Returns a range of all the employee_portlets where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.service.model.impl.Employee_portletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of employee_portlets
    * @param end the upper bound of the range of employee_portlets (not inclusive)
    * @return the range of matching employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee_portlet> findBysiteId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBysiteId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the employee_portlets where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.service.model.impl.Employee_portletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of employee_portlets
    * @param end the upper bound of the range of employee_portlets (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee_portlet> findBysiteId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBysiteId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee_portlet
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet findBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException {
        return getPersistence().findBysiteId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee_portlet, or <code>null</code> if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet fetchBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBysiteId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee_portlet
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet findBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException {
        return getPersistence().findBysiteId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee_portlet, or <code>null</code> if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet fetchBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBysiteId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the employee_portlets before and after the current employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param employeeId the primary key of the current employee_portlet
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee_portlet
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a employee_portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet[] findBysiteId_PrevAndNext(
        long employeeId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException {
        return getPersistence()
                   .findBysiteId_PrevAndNext(employeeId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the employee_portlets where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBysiteId(groupId);
    }

    /**
    * Returns the number of employee_portlets where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static int countBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBysiteId(groupId);
    }

    /**
    * Caches the employee_portlet in the entity cache if it is enabled.
    *
    * @param employee_portlet the employee_portlet
    */
    public static void cacheResult(
        net.opentrends.training.service.model.Employee_portlet employee_portlet) {
        getPersistence().cacheResult(employee_portlet);
    }

    /**
    * Caches the employee_portlets in the entity cache if it is enabled.
    *
    * @param employee_portlets the employee_portlets
    */
    public static void cacheResult(
        java.util.List<net.opentrends.training.service.model.Employee_portlet> employee_portlets) {
        getPersistence().cacheResult(employee_portlets);
    }

    /**
    * Creates a new employee_portlet with the primary key. Does not add the employee_portlet to the database.
    *
    * @param employeeId the primary key for the new employee_portlet
    * @return the new employee_portlet
    */
    public static net.opentrends.training.service.model.Employee_portlet create(
        long employeeId) {
        return getPersistence().create(employeeId);
    }

    /**
    * Removes the employee_portlet with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the employee_portlet
    * @return the employee_portlet that was removed
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a employee_portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet remove(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException {
        return getPersistence().remove(employeeId);
    }

    public static net.opentrends.training.service.model.Employee_portlet updateImpl(
        net.opentrends.training.service.model.Employee_portlet employee_portlet)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employee_portlet);
    }

    /**
    * Returns the employee_portlet with the primary key or throws a {@link net.opentrends.training.service.NoSuchEmployee_portletException} if it could not be found.
    *
    * @param employeeId the primary key of the employee_portlet
    * @return the employee_portlet
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a employee_portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet findByPrimaryKey(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException {
        return getPersistence().findByPrimaryKey(employeeId);
    }

    /**
    * Returns the employee_portlet with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeId the primary key of the employee_portlet
    * @return the employee_portlet, or <code>null</code> if a employee_portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee_portlet fetchByPrimaryKey(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employeeId);
    }

    /**
    * Returns all the employee_portlets.
    *
    * @return the employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee_portlet> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the employee_portlets.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.service.model.impl.Employee_portletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee_portlets
    * @param end the upper bound of the range of employee_portlets (not inclusive)
    * @return the range of employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee_portlet> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employee_portlets.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.service.model.impl.Employee_portletModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employee_portlets
    * @param end the upper bound of the range of employee_portlets (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee_portlet> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employee_portlets from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employee_portlets.
    *
    * @return the number of employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Employee_portletPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Employee_portletPersistence) PortletBeanLocatorUtil.locate(net.opentrends.training.service.service.ClpSerializer.getServletContextName(),
                    Employee_portletPersistence.class.getName());

            ReferenceRegistry.registerReference(Employee_portletUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Employee_portletPersistence persistence) {
    }
}
