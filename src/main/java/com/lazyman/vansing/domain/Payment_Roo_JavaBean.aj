// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.lazyman.vansing.domain;

import com.lazyman.vansing.domain.Course;
import com.lazyman.vansing.domain.Payment;
import com.lazyman.vansing.domain.Student;
import java.util.Date;

privileged aspect Payment_Roo_JavaBean {
    
    public Student Payment.getStudent() {
        return this.student;
    }
    
    public void Payment.setStudent(Student student) {
        this.student = student;
    }
    
    public Course Payment.getCourse() {
        return this.course;
    }
    
    public void Payment.setCourse(Course course) {
        this.course = course;
    }
    
    public int Payment.getFee() {
        return this.fee;
    }
    
    public void Payment.setFee(int fee) {
        this.fee = fee;
    }
    
    public Date Payment.getPayDate() {
        return this.payDate;
    }
    
    public void Payment.setPayDate(Date payDate) {
        this.payDate = payDate;
    }
    
    public String Payment.getMemo() {
        return this.memo;
    }
    
    public void Payment.setMemo(String memo) {
        this.memo = memo;
    }
    
}