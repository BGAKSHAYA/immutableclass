/**.
 * This package contains an immutable class Student
 */
package com.immutableclass;

/**.
 * @author Akshaya_Gowri
 *
 */
public final class Student {
      /** id of Student.*/
      private final int id;
      /** age of Student.*/
      private final int age;
      /** yearOfStudy of Student.*/
      private final int yearOfStudy;
      /** firstName of Student.*/
      private final String firstName;
      /** lastName of Student.*/
      private final String lastName;
      /** department of Student.*/
      private final String department;
      /** gender of Student.*/
      private final String gender;

    /** Student constructor.
     * @param f firstName
     * @param l lastName
     * @param genderStu Gender
     * @param ageStu Age of student
     * @param dept department of Student
     * @param year Year of study
     * @param idStu id of student
     */
    public Student(final String f, final String l,
            final String genderStu,
            final int ageStu, final String dept,
            final int year, final int idStu) {
      this.id = idStu;
      this.firstName = f;
      this.lastName = l;
      this.gender = genderStu;
      this.age = ageStu;
      this.department = dept;
      this.yearOfStudy = year;
    }

    /**Method to get FirstName.
     * @return FirstName
     */
    public String getFirstName() {
      return firstName;
    }
    /**Method to get LastName.
     * @return LastName
     */
    public String getLastName() {
      return lastName;
    }
    /**Method to get Gender.
     * @return gender
     */
    public String getGender() {
      return gender;
    }
    /**Method to get Age.
     * @return age
     */
    public int getAge() {
      return age;
    }
    /**Method to get Department.
     * @return department
     */
    public String getDepartment() {
      return department;
    }
    /**Method to get yearOfStudy.
     * @return yearOfStudy
     */
    public int getYearOfStudy() {
      return yearOfStudy;
    }
    /**Method to get id.
     * @return id
     */
    public int getId() {
      return id;
    }


}

