package net.opentrends.register.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.register.model.Address;
import net.opentrends.register.service.AddressLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AddressActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AddressActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AddressLocalServiceUtil.getService());
        setClass(Address.class);

        setClassLoader(net.opentrends.register.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("addressId");
    }
}
