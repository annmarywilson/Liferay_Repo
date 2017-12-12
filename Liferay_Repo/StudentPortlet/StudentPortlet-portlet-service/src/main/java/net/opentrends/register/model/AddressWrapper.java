package net.opentrends.register.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Address}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Address
 * @generated
 */
public class AddressWrapper implements Address, ModelWrapper<Address> {
    private Address _address;

    public AddressWrapper(Address address) {
        _address = address;
    }

    @Override
    public Class<?> getModelClass() {
        return Address.class;
    }

    @Override
    public String getModelClassName() {
        return Address.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("addressId", getAddressId());
        attributes.put("studentId", getStudentId());
        attributes.put("groupId", getGroupId());
        attributes.put("parentAddress", getParentAddress());
        attributes.put("parentState", getParentState());
        attributes.put("parentDistrict", getParentDistrict());
        attributes.put("parentPin", getParentPin());
        attributes.put("parentPhone", getParentPhone());
        attributes.put("parentMail", getParentMail());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long addressId = (Long) attributes.get("addressId");

        if (addressId != null) {
            setAddressId(addressId);
        }

        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String parentAddress = (String) attributes.get("parentAddress");

        if (parentAddress != null) {
            setParentAddress(parentAddress);
        }

        String parentState = (String) attributes.get("parentState");

        if (parentState != null) {
            setParentState(parentState);
        }

        String parentDistrict = (String) attributes.get("parentDistrict");

        if (parentDistrict != null) {
            setParentDistrict(parentDistrict);
        }

        String parentPin = (String) attributes.get("parentPin");

        if (parentPin != null) {
            setParentPin(parentPin);
        }

        String parentPhone = (String) attributes.get("parentPhone");

        if (parentPhone != null) {
            setParentPhone(parentPhone);
        }

        String parentMail = (String) attributes.get("parentMail");

        if (parentMail != null) {
            setParentMail(parentMail);
        }
    }

    /**
    * Returns the primary key of this address.
    *
    * @return the primary key of this address
    */
    @Override
    public long getPrimaryKey() {
        return _address.getPrimaryKey();
    }

    /**
    * Sets the primary key of this address.
    *
    * @param primaryKey the primary key of this address
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _address.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the address ID of this address.
    *
    * @return the address ID of this address
    */
    @Override
    public long getAddressId() {
        return _address.getAddressId();
    }

    /**
    * Sets the address ID of this address.
    *
    * @param addressId the address ID of this address
    */
    @Override
    public void setAddressId(long addressId) {
        _address.setAddressId(addressId);
    }

    /**
    * Returns the student ID of this address.
    *
    * @return the student ID of this address
    */
    @Override
    public long getStudentId() {
        return _address.getStudentId();
    }

    /**
    * Sets the student ID of this address.
    *
    * @param studentId the student ID of this address
    */
    @Override
    public void setStudentId(long studentId) {
        _address.setStudentId(studentId);
    }

    /**
    * Returns the group ID of this address.
    *
    * @return the group ID of this address
    */
    @Override
    public long getGroupId() {
        return _address.getGroupId();
    }

    /**
    * Sets the group ID of this address.
    *
    * @param groupId the group ID of this address
    */
    @Override
    public void setGroupId(long groupId) {
        _address.setGroupId(groupId);
    }

    /**
    * Returns the parent address of this address.
    *
    * @return the parent address of this address
    */
    @Override
    public java.lang.String getParentAddress() {
        return _address.getParentAddress();
    }

    /**
    * Sets the parent address of this address.
    *
    * @param parentAddress the parent address of this address
    */
    @Override
    public void setParentAddress(java.lang.String parentAddress) {
        _address.setParentAddress(parentAddress);
    }

    /**
    * Returns the parent state of this address.
    *
    * @return the parent state of this address
    */
    @Override
    public java.lang.String getParentState() {
        return _address.getParentState();
    }

    /**
    * Sets the parent state of this address.
    *
    * @param parentState the parent state of this address
    */
    @Override
    public void setParentState(java.lang.String parentState) {
        _address.setParentState(parentState);
    }

    /**
    * Returns the parent district of this address.
    *
    * @return the parent district of this address
    */
    @Override
    public java.lang.String getParentDistrict() {
        return _address.getParentDistrict();
    }

    /**
    * Sets the parent district of this address.
    *
    * @param parentDistrict the parent district of this address
    */
    @Override
    public void setParentDistrict(java.lang.String parentDistrict) {
        _address.setParentDistrict(parentDistrict);
    }

    /**
    * Returns the parent pin of this address.
    *
    * @return the parent pin of this address
    */
    @Override
    public java.lang.String getParentPin() {
        return _address.getParentPin();
    }

    /**
    * Sets the parent pin of this address.
    *
    * @param parentPin the parent pin of this address
    */
    @Override
    public void setParentPin(java.lang.String parentPin) {
        _address.setParentPin(parentPin);
    }

    /**
    * Returns the parent phone of this address.
    *
    * @return the parent phone of this address
    */
    @Override
    public java.lang.String getParentPhone() {
        return _address.getParentPhone();
    }

    /**
    * Sets the parent phone of this address.
    *
    * @param parentPhone the parent phone of this address
    */
    @Override
    public void setParentPhone(java.lang.String parentPhone) {
        _address.setParentPhone(parentPhone);
    }

    /**
    * Returns the parent mail of this address.
    *
    * @return the parent mail of this address
    */
    @Override
    public java.lang.String getParentMail() {
        return _address.getParentMail();
    }

    /**
    * Sets the parent mail of this address.
    *
    * @param parentMail the parent mail of this address
    */
    @Override
    public void setParentMail(java.lang.String parentMail) {
        _address.setParentMail(parentMail);
    }

    @Override
    public boolean isNew() {
        return _address.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _address.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _address.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _address.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _address.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _address.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _address.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _address.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _address.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _address.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _address.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AddressWrapper((Address) _address.clone());
    }

    @Override
    public int compareTo(net.opentrends.register.model.Address address) {
        return _address.compareTo(address);
    }

    @Override
    public int hashCode() {
        return _address.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.register.model.Address> toCacheModel() {
        return _address.toCacheModel();
    }

    @Override
    public net.opentrends.register.model.Address toEscapedModel() {
        return new AddressWrapper(_address.toEscapedModel());
    }

    @Override
    public net.opentrends.register.model.Address toUnescapedModel() {
        return new AddressWrapper(_address.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _address.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _address.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _address.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AddressWrapper)) {
            return false;
        }

        AddressWrapper addressWrapper = (AddressWrapper) obj;

        if (Validator.equals(_address, addressWrapper._address)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Address getWrappedAddress() {
        return _address;
    }

    @Override
    public Address getWrappedModel() {
        return _address;
    }

    @Override
    public void resetOriginalValues() {
        _address.resetOriginalValues();
    }
}
