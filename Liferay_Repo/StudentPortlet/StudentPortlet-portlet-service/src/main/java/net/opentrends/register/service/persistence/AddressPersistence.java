package net.opentrends.register.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.register.model.Address;

/**
 * The persistence interface for the address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressPersistenceImpl
 * @see AddressUtil
 * @generated
 */
public interface AddressPersistence extends BasePersistence<Address> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AddressUtil} to access the address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the addresses where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Address> findBysiteId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.register.model.Address> findBysiteId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.register.model.Address> findBysiteId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address
    * @throws net.opentrends.register.NoSuchAddressException if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Address findBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException;

    /**
    * Returns the first address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching address, or <code>null</code> if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Address fetchBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address
    * @throws net.opentrends.register.NoSuchAddressException if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Address findBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException;

    /**
    * Returns the last address in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching address, or <code>null</code> if a matching address could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Address fetchBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public net.opentrends.register.model.Address[] findBysiteId_PrevAndNext(
        long addressId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException;

    /**
    * Removes all the addresses where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of addresses where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching addresses
    * @throws SystemException if a system exception occurred
    */
    public int countBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the address in the entity cache if it is enabled.
    *
    * @param address the address
    */
    public void cacheResult(net.opentrends.register.model.Address address);

    /**
    * Caches the addresses in the entity cache if it is enabled.
    *
    * @param addresses the addresses
    */
    public void cacheResult(
        java.util.List<net.opentrends.register.model.Address> addresses);

    /**
    * Creates a new address with the primary key. Does not add the address to the database.
    *
    * @param addressId the primary key for the new address
    * @return the new address
    */
    public net.opentrends.register.model.Address create(long addressId);

    /**
    * Removes the address with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param addressId the primary key of the address
    * @return the address that was removed
    * @throws net.opentrends.register.NoSuchAddressException if a address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Address remove(long addressId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException;

    public net.opentrends.register.model.Address updateImpl(
        net.opentrends.register.model.Address address)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the address with the primary key or throws a {@link net.opentrends.register.NoSuchAddressException} if it could not be found.
    *
    * @param addressId the primary key of the address
    * @return the address
    * @throws net.opentrends.register.NoSuchAddressException if a address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Address findByPrimaryKey(
        long addressId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchAddressException;

    /**
    * Returns the address with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param addressId the primary key of the address
    * @return the address, or <code>null</code> if a address with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Address fetchByPrimaryKey(
        long addressId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the addresses.
    *
    * @return the addresses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Address> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.register.model.Address> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.register.model.Address> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the addresses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of addresses.
    *
    * @return the number of addresses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
