package com.java.sample.java8.streams.examples.e004;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentBranch;
    private Integer totalMarks;

    public Student(Integer studentId, String studentName, String studentBranch, Integer totalMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentBranch = studentBranch;
        this.totalMarks = totalMarks;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void print() {
        System.out.println("Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentBranch='" + studentBranch + '\'' +
                ", totalMarks=" + totalMarks +
                '}');
    }
}
