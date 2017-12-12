package net.opentrends.register.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Student}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Student
 * @generated
 */
public class StudentWrapper implements Student, ModelWrapper<Student> {
    private Student _student;

    public StudentWrapper(Student student) {
        _student = student;
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

    /**
    * Returns the primary key of this student.
    *
    * @return the primary key of this student
    */
    @Override
    public long getPrimaryKey() {
        return _student.getPrimaryKey();
    }

    /**
    * Sets the primary key of this student.
    *
    * @param primaryKey the primary key of this student
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _student.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the student ID of this student.
    *
    * @return the student ID of this student
    */
    @Override
    public long getStudentId() {
        return _student.getStudentId();
    }

    /**
    * Sets the student ID of this student.
    *
    * @param studentId the student ID of this student
    */
    @Override
    public void setStudentId(long studentId) {
        _student.setStudentId(studentId);
    }

    /**
    * Returns the group ID of this student.
    *
    * @return the group ID of this student
    */
    @Override
    public long getGroupId() {
        return _student.getGroupId();
    }

    /**
    * Sets the group ID of this student.
    *
    * @param groupId the group ID of this student
    */
    @Override
    public void setGroupId(long groupId) {
        _student.setGroupId(groupId);
    }

    /**
    * Returns the student name of this student.
    *
    * @return the student name of this student
    */
    @Override
    public java.lang.String getStudentName() {
        return _student.getStudentName();
    }

    /**
    * Sets the student name of this student.
    *
    * @param studentName the student name of this student
    */
    @Override
    public void setStudentName(java.lang.String studentName) {
        _student.setStudentName(studentName);
    }

    /**
    * Returns the student class of this student.
    *
    * @return the student class of this student
    */
    @Override
    public java.lang.String getStudentClass() {
        return _student.getStudentClass();
    }

    /**
    * Sets the student class of this student.
    *
    * @param studentClass the student class of this student
    */
    @Override
    public void setStudentClass(java.lang.String studentClass) {
        _student.setStudentClass(studentClass);
    }

    /**
    * Returns the student email of this student.
    *
    * @return the student email of this student
    */
    @Override
    public java.lang.String getStudentEmail() {
        return _student.getStudentEmail();
    }

    /**
    * Sets the student email of this student.
    *
    * @param studentEmail the student email of this student
    */
    @Override
    public void setStudentEmail(java.lang.String studentEmail) {
        _student.setStudentEmail(studentEmail);
    }

    /**
    * Returns the phone number of this student.
    *
    * @return the phone number of this student
    */
    @Override
    public java.lang.String getPhoneNumber() {
        return _student.getPhoneNumber();
    }

    /**
    * Sets the phone number of this student.
    *
    * @param phoneNumber the phone number of this student
    */
    @Override
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _student.setPhoneNumber(phoneNumber);
    }

    @Override
    public boolean isNew() {
        return _student.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _student.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _student.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _student.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _student.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _student.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _student.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _student.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _student.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _student.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _student.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StudentWrapper((Student) _student.clone());
    }

    @Override
    public int compareTo(net.opentrends.register.model.Student student) {
        return _student.compareTo(student);
    }

    @Override
    public int hashCode() {
        return _student.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<net.opentrends.register.model.Student> toCacheModel() {
        return _student.toCacheModel();
    }

    @Override
    public net.opentrends.register.model.Student toEscapedModel() {
        return new StudentWrapper(_student.toEscapedModel());
    }

    @Override
    public net.opentrends.register.model.Student toUnescapedModel() {
        return new StudentWrapper(_student.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _student.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _student.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _student.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StudentWrapper)) {
            return false;
        }

        StudentWrapper studentWrapper = (StudentWrapper) obj;

        if (Validator.equals(_student, studentWrapper._student)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Student getWrappedStudent() {
        return _student;
    }

    @Override
    public Student getWrappedModel() {
        return _student;
    }

    @Override
    public void resetOriginalValues() {
        _student.resetOriginalValues();
    }
}
