package net.opentrends.register.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.register.service.AddressLocalServiceUtil;
import net.opentrends.register.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class AddressClp extends BaseModelImpl<Address> implements Address {
    private long _addressId;
    private long _studentId;
    private long _groupId;
    private String _parentAddress;
    private String _parentState;
    private String _parentDistrict;
    private String _parentPin;
    private String _parentPhone;
    private String _parentMail;
    private BaseModel<?> _addressRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.register.service.ClpSerializer.class;

    public AddressClp() {
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
    public long getPrimaryKey() {
        return _addressId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setAddressId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _addressId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getAddressId() {
        return _addressId;
    }

    @Override
    public void setAddressId(long addressId) {
        _addressId = addressId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setAddressId", long.class);

                method.invoke(_addressRemoteModel, addressId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStudentId() {
        return _studentId;
    }

    @Override
    public void setStudentId(long studentId) {
        _studentId = studentId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentId", long.class);

                method.invoke(_addressRemoteModel, studentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_addressRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParentAddress() {
        return _parentAddress;
    }

    @Override
    public void setParentAddress(String parentAddress) {
        _parentAddress = parentAddress;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setParentAddress", String.class);

                method.invoke(_addressRemoteModel, parentAddress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParentState() {
        return _parentState;
    }

    @Override
    public void setParentState(String parentState) {
        _parentState = parentState;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setParentState", String.class);

                method.invoke(_addressRemoteModel, parentState);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParentDistrict() {
        return _parentDistrict;
    }

    @Override
    public void setParentDistrict(String parentDistrict) {
        _parentDistrict = parentDistrict;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setParentDistrict",
                        String.class);

                method.invoke(_addressRemoteModel, parentDistrict);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParentPin() {
        return _parentPin;
    }

    @Override
    public void setParentPin(String parentPin) {
        _parentPin = parentPin;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setParentPin", String.class);

                method.invoke(_addressRemoteModel, parentPin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParentPhone() {
        return _parentPhone;
    }

    @Override
    public void setParentPhone(String parentPhone) {
        _parentPhone = parentPhone;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setParentPhone", String.class);

                method.invoke(_addressRemoteModel, parentPhone);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getParentMail() {
        return _parentMail;
    }

    @Override
    public void setParentMail(String parentMail) {
        _parentMail = parentMail;

        if (_addressRemoteModel != null) {
            try {
                Class<?> clazz = _addressRemoteModel.getClass();

                Method method = clazz.getMethod("setParentMail", String.class);

                method.invoke(_addressRemoteModel, parentMail);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAddressRemoteModel() {
        return _addressRemoteModel;
    }

    public void setAddressRemoteModel(BaseModel<?> addressRemoteModel) {
        _addressRemoteModel = addressRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _addressRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_addressRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AddressLocalServiceUtil.addAddress(this);
        } else {
            AddressLocalServiceUtil.updateAddress(this);
        }
    }

    @Override
    public Address toEscapedModel() {
        return (Address) ProxyUtil.newProxyInstance(Address.class.getClassLoader(),
            new Class[] { Address.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AddressClp clone = new AddressClp();

        clone.setAddressId(getAddressId());
        clone.setStudentId(getStudentId());
        clone.setGroupId(getGroupId());
        clone.setParentAddress(getParentAddress());
        clone.setParentState(getParentState());
        clone.setParentDistrict(getParentDistrict());
        clone.setParentPin(getParentPin());
        clone.setParentPhone(getParentPhone());
        clone.setParentMail(getParentMail());

        return clone;
    }

    @Override
    public int compareTo(Address address) {
        long primaryKey = address.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AddressClp)) {
            return false;
        }

        AddressClp address = (AddressClp) obj;

        long primaryKey = address.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{addressId=");
        sb.append(getAddressId());
        sb.append(", studentId=");
        sb.append(getStudentId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", parentAddress=");
        sb.append(getParentAddress());
        sb.append(", parentState=");
        sb.append(getParentState());
        sb.append(", parentDistrict=");
        sb.append(getParentDistrict());
        sb.append(", parentPin=");
        sb.append(getParentPin());
        sb.append(", parentPhone=");
        sb.append(getParentPhone());
        sb.append(", parentMail=");
        sb.append(getParentMail());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.register.model.Address");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>addressId</column-name><column-value><![CDATA[");
        sb.append(getAddressId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentId</column-name><column-value><![CDATA[");
        sb.append(getStudentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentAddress</column-name><column-value><![CDATA[");
        sb.append(getParentAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentState</column-name><column-value><![CDATA[");
        sb.append(getParentState());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentDistrict</column-name><column-value><![CDATA[");
        sb.append(getParentDistrict());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentPin</column-name><column-value><![CDATA[");
        sb.append(getParentPin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentPhone</column-name><column-value><![CDATA[");
        sb.append(getParentPhone());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentMail</column-name><column-value><![CDATA[");
        sb.append(getParentMail());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
