package com.example.abrahamyann.reportcardultimate;

/**
 * Created by Abraham on 04/05/18.
 * Each object has three properties : studentName, studentImage, studentGrade.
 */
public class reportCard {
    private String studentName;
    private String studentGrade;
    private int studentImage;

    public reportCard(String studentName, String studentGrade, int studentImage) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentImage = studentImage;
    }

    /**
     * get the student name.
     * @return the name of the student.
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * get the student grade
     * @return the grades of the student.
     */
    public String getStudentGrade() {
        return studentGrade;
    }

    /**
     * get the picture of the student
     * @return student's picture.
     */
    public int getStudentImage() {
        return studentImage;
    }
}
