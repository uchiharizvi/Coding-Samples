package com.java.sample.java8.streams.examples.e004;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;

public class CollegeOperations {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(001,"Kavish","CSE",800));
        students.add(new Student(002,"Baxter","CSE",700));
        students.add(new Student(003,"Raksha","Mech",950));
        students.add(new Student(004,"Tooba","CSE",450));
        students.add(new Student(005,"Kamala","Mech",679));
        students.add(new Student(006,"Jahangeer","Elec",815));
        students.add(new Student(007,"Randy","CSE",654));
        students.add(new Student(010,"Hoor","Apps",802));
        students.add(new Student(011,"Noor","MCA",892));
        students.add(new Student(012,"Anfal","Apps",990));
        students.add(new Student(013,"Aaraf","CSE",654));
        students.add(new Student(014,"Hasnain","Elec",954));
        students.add(new Student(015,"Anam","MCA",675));

        /**Problems
         * 1) Get no. of students in each branch by branch ID
         * 2) Get all the students sorted by their branch name(desc), if same branch, sort by student name(asc)
         * **/
        /**Solution :- Get Total Students**/
        System.out.println("Count = " + students.stream().count());
        students.stream().filter(x->x.getTotalMarks()>950).forEach(Student::print);
        students.stream().filter(x->x.getStudentName()=="Kavish").forEach(Student::print);
        /*Map<String, Map<String, Integer>> groupByBranch = (Map<String, Map<String, Integer>>) students
                .stream()
                .map(Student::getTotalMarks)
                .collect(groupingBy(Student::getStudentBranch, groupingBy(Student::getStudentName)));*/
        /*for(Map.Entry entry: groupByBranch.entrySet()){
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }*/
    }
}
