package net.opentrends.training.service.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.training.service.model.Employee_portlet;

/**
 * The persistence interface for the employee_portlet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee_portletPersistenceImpl
 * @see Employee_portletUtil
 * @generated
 */
public interface Employee_portletPersistence extends BasePersistence<Employee_portlet> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link Employee_portletUtil} to access the employee_portlet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the employee_portlets where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.training.service.model.Employee_portlet> findBysiteId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.service.model.Employee_portlet> findBysiteId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.service.model.Employee_portlet> findBysiteId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee_portlet
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.service.model.Employee_portlet findBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException;

    /**
    * Returns the first employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee_portlet, or <code>null</code> if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.service.model.Employee_portlet fetchBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee_portlet
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.service.model.Employee_portlet findBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException;

    /**
    * Returns the last employee_portlet in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee_portlet, or <code>null</code> if a matching employee_portlet could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.service.model.Employee_portlet fetchBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public net.opentrends.training.service.model.Employee_portlet[] findBysiteId_PrevAndNext(
        long employeeId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException;

    /**
    * Removes all the employee_portlets where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee_portlets where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public int countBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the employee_portlet in the entity cache if it is enabled.
    *
    * @param employee_portlet the employee_portlet
    */
    public void cacheResult(
        net.opentrends.training.service.model.Employee_portlet employee_portlet);

    /**
    * Caches the employee_portlets in the entity cache if it is enabled.
    *
    * @param employee_portlets the employee_portlets
    */
    public void cacheResult(
        java.util.List<net.opentrends.training.service.model.Employee_portlet> employee_portlets);

    /**
    * Creates a new employee_portlet with the primary key. Does not add the employee_portlet to the database.
    *
    * @param employeeId the primary key for the new employee_portlet
    * @return the new employee_portlet
    */
    public net.opentrends.training.service.model.Employee_portlet create(
        long employeeId);

    /**
    * Removes the employee_portlet with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the employee_portlet
    * @return the employee_portlet that was removed
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a employee_portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.service.model.Employee_portlet remove(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException;

    public net.opentrends.training.service.model.Employee_portlet updateImpl(
        net.opentrends.training.service.model.Employee_portlet employee_portlet)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee_portlet with the primary key or throws a {@link net.opentrends.training.service.NoSuchEmployee_portletException} if it could not be found.
    *
    * @param employeeId the primary key of the employee_portlet
    * @return the employee_portlet
    * @throws net.opentrends.training.service.NoSuchEmployee_portletException if a employee_portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.service.model.Employee_portlet findByPrimaryKey(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployee_portletException;

    /**
    * Returns the employee_portlet with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeId the primary key of the employee_portlet
    * @return the employee_portlet, or <code>null</code> if a employee_portlet with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.training.service.model.Employee_portlet fetchByPrimaryKey(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employee_portlets.
    *
    * @return the employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.training.service.model.Employee_portlet> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.service.model.Employee_portlet> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.training.service.model.Employee_portlet> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employee_portlets from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employee_portlets.
    *
    * @return the number of employee_portlets
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
