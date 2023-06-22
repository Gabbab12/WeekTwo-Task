package org.example;

public class Student {
    private String studentID;
    private String email;
    private String firstName;
    private String lastName;
    private String gradeLevel;
    private String guardianEmail1;
    private String guardianEmail2;
    private String isArchived;
    private String isDeleted;

    public Student(String studentID, String email, String firstName, String lastName, String gradeLevel, String guardianEmail1, String guardianEmail2, String isArchived, String isDeleted) {
        this.studentID = studentID;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.guardianEmail1 = guardianEmail1;
        this.guardianEmail2 = guardianEmail2;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
    }

    public Student(){

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }

    public void setGuardianEmail1(String guardianEmail1) {
        this.guardianEmail1 = guardianEmail1;
    }

    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(String isArchived) {
        this.isArchived = isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", guardianEmail1='" + guardianEmail1 + '\'' +
                ", guardianEmail2='" + guardianEmail2 + '\'' +
                ", isArchived='" + isArchived + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}
