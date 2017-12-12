package net.opentrends.register.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.register.model.Address;

import java.util.List;

/**
 * The persistence utility for the address service. This utility wraps {@link AddressPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressPersistence
 * @see AddressPersistenceImpl
 * @generated
 */
public class AddressUtil {
    private static AddressPersistence _persistence;

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
    public static void clearCache(Address address) {
        getPersistence().clearCache(address);
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
    public static List<Address> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Address> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Address> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Address update(Address address) throws SystemException {
        return getPersistence().update(address);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Address update(Address address, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(address, serviceContext);
    }

    /**
    * Returns all the addresses where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.register.model.Address> findBysiteId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBysiteId(groupId);
    }

    /**
    * Returns a range of all the addresses where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of addresses
    * @param end the upper bound of the range of addresses (not inclusive)
    * @return the range of matching addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.register.model.Address> findBysiteId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBysiteId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the addresses where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of addresses
    * @param end the upper bound of the range of addresses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.register.model.Address> findBysiteId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBysiteId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address
    * @throws net.opentrends.register.NoSuchAddressException if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address findBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException {
        return getPersistence().findBysiteId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address, or <code>null</code> if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address fetchBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBysiteId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address
    * @throws net.opentrends.register.NoSuchAddressException if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address findBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException {
        return getPersistence().findBysiteId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address, or <code>null</code> if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address fetchBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBysiteId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the addresses before and after the current address in the ordered set where groupId = &#63;.
    *
    * @param addressId the primary key of the current address
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next address
    * @throws net.opentrends.register.NoSuchAddressException if a address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address[] findBysiteId_PrevAndNext(
        long addressId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException {
        return getPersistence()
                   .findBysiteId_PrevAndNext(addressId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the addresses where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBysiteId(groupId);
    }

    /**
    * Returns the number of addresses where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching addresses
    * @throws SystemException if a system exception occurred
    */
    public static int countBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBysiteId(groupId);
    }

    /**
    * Caches the address in the entity cache if it is enabled.
    *
    * @param address the address
    */
    public static void cacheResult(
        net.opentrends.register.model.Address address) {
        getPersistence().cacheResult(address);
    }

    /**
    * Caches the addresses in the entity cache if it is enabled.
    *
    * @param addresses the addresses
    */
    public static void cacheResult(
        java.util.List<net.opentrends.register.model.Address> addresses) {
        getPersistence().cacheResult(addresses);
    }

    /**
    * Creates a new address with the primary key. Does not add the address to the database.
    *
    * @param addressId the primary key for the new address
    * @return the new address
    */
    public static net.opentrends.register.model.Address create(long addressId) {
        return getPersistence().create(addressId);
    }

    /**
    * Removes the address with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param addressId the primary key of the address
    * @return the address that was removed
    * @throws net.opentrends.register.NoSuchAddressException if a address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address remove(long addressId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException {
        return getPersistence().remove(addressId);
    }

    public static net.opentrends.register.model.Address updateImpl(
        net.opentrends.register.model.Address address)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(address);
    }

    /**
    * Returns the address with the primary key or throws a {@link net.opentrends.register.NoSuchAddressException} if it could not be found.
    *
    * @param addressId the primary key of the address
    * @return the address
    * @throws net.opentrends.register.NoSuchAddressException if a address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address findByPrimaryKey(
        long addressId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException {
        return getPersistence().findByPrimaryKey(addressId);
    }

    /**
    * Returns the address with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param addressId the primary key of the address
    * @return the address, or <code>null</code> if a address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.register.model.Address fetchByPrimaryKey(
        long addressId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(addressId);
    }

    /**
    * Returns all the addresses.
    *
    * @return the addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.register.model.Address> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the addresses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of addresses
    * @param end the upper bound of the range of addresses (not inclusive)
    * @return the range of addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.register.model.Address> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the addresses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.AddressModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of addresses
    * @param end the upper bound of the range of addresses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of addresses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.register.model.Address> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the addresses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of addresses.
    *
    * @return the number of addresses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AddressPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AddressPersistence) PortletBeanLocatorUtil.locate(net.opentrends.register.service.ClpSerializer.getServletContextName(),
                    AddressPersistence.class.getName());

            ReferenceRegistry.registerReference(AddressUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AddressPersistence persistence) {
    }
}
