package net.opentrends.register.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.register.model.Student;

/**
 * The persistence interface for the student service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentPersistenceImpl
 * @see StudentUtil
 * @generated
 */
public interface StudentPersistence extends BasePersistence<Student> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StudentUtil} to access the student persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the students where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Student> findBysiteId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the students where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @return the range of matching students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Student> findBysiteId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the students where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Student> findBysiteId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first student in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student
    * @throws net.opentrends.register.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student findBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchStudentException;

    /**
    * Returns the first student in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student fetchBysiteId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last student in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student
    * @throws net.opentrends.register.NoSuchStudentException if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student findBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchStudentException;

    /**
    * Returns the last student in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching student, or <code>null</code> if a matching student could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student fetchBysiteId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the students before and after the current student in the ordered set where groupId = &#63;.
    *
    * @param studentId the primary key of the current student
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next student
    * @throws net.opentrends.register.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student[] findBysiteId_PrevAndNext(
        long studentId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchStudentException;

    /**
    * Removes all the students where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of students where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching students
    * @throws SystemException if a system exception occurred
    */
    public int countBysiteId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the student in the entity cache if it is enabled.
    *
    * @param student the student
    */
    public void cacheResult(net.opentrends.register.model.Student student);

    /**
    * Caches the students in the entity cache if it is enabled.
    *
    * @param students the students
    */
    public void cacheResult(
        java.util.List<net.opentrends.register.model.Student> students);

    /**
    * Creates a new student with the primary key. Does not add the student to the database.
    *
    * @param studentId the primary key for the new student
    * @return the new student
    */
    public net.opentrends.register.model.Student create(long studentId);

    /**
    * Removes the student with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentId the primary key of the student
    * @return the student that was removed
    * @throws net.opentrends.register.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student remove(long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchStudentException;

    public net.opentrends.register.model.Student updateImpl(
        net.opentrends.register.model.Student student)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student with the primary key or throws a {@link net.opentrends.register.NoSuchStudentException} if it could not be found.
    *
    * @param studentId the primary key of the student
    * @return the student
    * @throws net.opentrends.register.NoSuchStudentException if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student findByPrimaryKey(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.register.NoSuchStudentException;

    /**
    * Returns the student with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param studentId the primary key of the student
    * @return the student, or <code>null</code> if a student with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.register.model.Student fetchByPrimaryKey(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the students.
    *
    * @return the students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Student> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the students.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @return the range of students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Student> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the students.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.register.model.impl.StudentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of students
    * @param end the upper bound of the range of students (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of students
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.register.model.Student> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the students from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of students.
    *
    * @return the number of students
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
