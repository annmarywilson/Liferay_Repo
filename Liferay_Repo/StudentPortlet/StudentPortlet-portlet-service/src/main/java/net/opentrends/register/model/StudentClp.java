package net.opentrends.register.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import net.opentrends.register.service.ClpSerializer;
import net.opentrends.register.service.StudentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class StudentClp extends BaseModelImpl<Student> implements Student {
    private long _studentId;
    private long _groupId;
    private String _studentName;
    private String _studentClass;
    private String _studentEmail;
    private String _phoneNumber;
    private BaseModel<?> _studentRemoteModel;
    private Class<?> _clpSerializerClass = net.opentrends.register.service.ClpSerializer.class;

    public StudentClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Student.class;
    }

    @Override
    public String getModelClassName() {
        return Student.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _studentId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStudentId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _studentId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("studentId", getStudentId());
        attributes.put("groupId", getGroupId());
        attributes.put("studentName", getStudentName());
        attributes.put("studentClass", getStudentClass());
        attributes.put("studentEmail", getStudentEmail());
        attributes.put("phoneNumber", getPhoneNumber());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long studentId = (Long) attributes.get("studentId");

        if (studentId != null) {
            setStudentId(studentId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String studentName = (String) attributes.get("studentName");

        if (studentName != null) {
            setStudentName(studentName);
        }

        String studentClass = (String) attributes.get("studentClass");

        if (studentClass != null) {
            setStudentClass(studentClass);
        }

        String studentEmail = (String) attributes.get("studentEmail");

        if (studentEmail != null) {
            setStudentEmail(studentEmail);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }
    }

    @Override
    public long getStudentId() {
        return _studentId;
    }

    @Override
    public void setStudentId(long studentId) {
        _studentId = studentId;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentId", long.class);

                method.invoke(_studentRemoteModel, studentId);
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

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_studentRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStudentName() {
        return _studentName;
    }

    @Override
    public void setStudentName(String studentName) {
        _studentName = studentName;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentName", String.class);

                method.invoke(_studentRemoteModel, studentName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStudentClass() {
        return _studentClass;
    }

    @Override
    public void setStudentClass(String studentClass) {
        _studentClass = studentClass;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentClass", String.class);

                method.invoke(_studentRemoteModel, studentClass);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStudentEmail() {
        return _studentEmail;
    }

    @Override
    public void setStudentEmail(String studentEmail) {
        _studentEmail = studentEmail;

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setStudentEmail", String.class);

                method.invoke(_studentRemoteModel, studentEmail);
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

        if (_studentRemoteModel != null) {
            try {
                Class<?> clazz = _studentRemoteModel.getClass();

                Method method = clazz.getMethod("setPhoneNumber", String.class);

                method.invoke(_studentRemoteModel, phoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getStudentRemoteModel() {
        return _studentRemoteModel;
    }

    public void setStudentRemoteModel(BaseModel<?> studentRemoteModel) {
        _studentRemoteModel = studentRemoteModel;
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

        Class<?> remoteModelClass = _studentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_studentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            StudentLocalServiceUtil.addStudent(this);
        } else {
            StudentLocalServiceUtil.updateStudent(this);
        }
    }

    @Override
    public Student toEscapedModel() {
        return (Student) ProxyUtil.newProxyInstance(Student.class.getClassLoader(),
            new Class[] { Student.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        StudentClp clone = new StudentClp();

        clone.setStudentId(getStudentId());
        clone.setGroupId(getGroupId());
        clone.setStudentName(getStudentName());
        clone.setStudentClass(getStudentClass());
        clone.setStudentEmail(getStudentEmail());
        clone.setPhoneNumber(getPhoneNumber());

        return clone;
    }

    @Override
    public int compareTo(Student student) {
        long primaryKey = student.getPrimaryKey();

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

        if (!(obj instanceof StudentClp)) {
            return false;
        }

        StudentClp student = (StudentClp) obj;

        long primaryKey = student.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{studentId=");
        sb.append(getStudentId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", studentName=");
        sb.append(getStudentName());
        sb.append(", studentClass=");
        sb.append(getStudentClass());
        sb.append(", studentEmail=");
        sb.append(getStudentEmail());
        sb.append(", phoneNumber=");
        sb.append(getPhoneNumber());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("net.opentrends.register.model.Student");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>studentId</column-name><column-value><![CDATA[");
        sb.append(getStudentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentName</column-name><column-value><![CDATA[");
        sb.append(getStudentName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentClass</column-name><column-value><![CDATA[");
        sb.append(getStudentClass());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>studentEmail</column-name><column-value><![CDATA[");
        sb.append(getStudentEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
        sb.append(getPhoneNumber());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
