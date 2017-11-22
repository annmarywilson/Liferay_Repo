package net.opentrends.training.service.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import net.opentrends.training.service.service.ClpSerializer;
import net.opentrends.training.service.service.Employee_portletLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class Employee_portletClp extends BaseModelImpl<Employee_portlet>
    implements Employee_portlet {
    private long _employeeId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private String _address;
    private String _email;
    private String _phoneNumber;
    private String _password;
    private BaseModel<?> _employee_portletRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.training.service.service.ClpSerializer.class;

    public Employee_portletClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Employee_portlet.class;
    }

    @Override
    public String getModelClassName() {
        return Employee_portlet.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployeeId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employeeId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employeeId", getEmployeeId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("address", getAddress());
        attributes.put("email", getEmail());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("password", getPassword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }

        String password = (String) attributes.get("password");

        if (password != null) {
            setPassword(password);
        }
    }

    @Override
    public long getEmployeeId() {
        return _employeeId;
    }

    @Override
    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployeeId", long.class);

                method.invoke(_employee_portletRemoteModel, employeeId);
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

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_employee_portletRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_employee_portletRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_employee_portletRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_employee_portletRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAddress() {
        return _address;
    }

    @Override
    public void setAddress(String address) {
        _address = address;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_employee_portletRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getEmail() {
        return _email;
    }

    @Override
    public void setEmail(String email) {
        _email = email;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_employee_portletRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPhoneNumber() {
        return _phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setPhoneNumber", String.class);

                method.invoke(_employee_portletRemoteModel, phoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPassword() {
        return _password;
    }

    @Override
    public void setPassword(String password) {
        _password = password;

        if (_employee_portletRemoteModel != null) {
            try {
                Class<?> clazz = _employee_portletRemoteModel.getClass();

                Method method = clazz.getMethod("setPassword", String.class);

                method.invoke(_employee_portletRemoteModel, password);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployee_portletRemoteModel() {
        return _employee_portletRemoteModel;
    }

    public void setEmployee_portletRemoteModel(
        BaseModel<?> employee_portletRemoteModel) {
        _employee_portletRemoteModel = employee_portletRemoteModel;
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

        Class<?> remoteModelClass = _employee_portletRemoteModel.getClass();

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

        Object returnValue = method.invoke(_employee_portletRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Employee_portletLocalServiceUtil.addEmployee_portlet(this);
        } else {
            Employee_portletLocalServiceUtil.updateEmployee_portlet(this);
        }
    }

    @Override
    public Employee_portlet toEscapedModel() {
        return (Employee_portlet) ProxyUtil.newProxyInstance(Employee_portlet.class.getClassLoader(),
            new Class[] { Employee_portlet.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Employee_portletClp clone = new Employee_portletClp();

        clone.setEmployeeId(getEmployeeId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setAddress(getAddress());
        clone.setEmail(getEmail());
        clone.setPhoneNumber(getPhoneNumber());
        clone.setPassword(getPassword());

        return clone;
    }

    @Override
    public int compareTo(Employee_portlet employee_portlet) {
        long primaryKey = employee_portlet.getPrimaryKey();

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

        if (!(obj instanceof Employee_portletClp)) {
            return false;
        }

        Employee_portletClp employee_portlet = (Employee_portletClp) obj;

        long primaryKey = employee_portlet.getPrimaryKey();

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

        sb.append("{employeeId=");
        sb.append(getEmployeeId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", phoneNumber=");
        sb.append(getPhoneNumber());
        sb.append(", password=");
        sb.append(getPassword());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.training.service.model.Employee_portlet");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employeeId</column-name><column-value><![CDATA[");
        sb.append(getEmployeeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
        sb.append(getPhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>password</column-name><column-value><![CDATA[");
        sb.append(getPassword());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
