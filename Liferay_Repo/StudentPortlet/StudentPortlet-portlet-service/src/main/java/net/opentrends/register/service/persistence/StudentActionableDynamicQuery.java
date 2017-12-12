package net.opentrends.register.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import net.opentrends.register.model.Student;
import net.opentrends.register.service.StudentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class StudentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StudentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StudentLocalServiceUtil.getService());
        setClass(Student.class);

        setClassLoader(net.opentrends.register.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("studentId");
    }
}
