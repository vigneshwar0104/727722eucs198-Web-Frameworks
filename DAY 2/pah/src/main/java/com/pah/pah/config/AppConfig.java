package com.pah.pah.config;

import org.springframework.beans.factory.annotation.Value;

public class AppConfig {
    @Value("${myname.name}")
    private String studentName;
    @Value("${mydep.dep}")
    private String studentDepartment;
    public String getStudentName() {
        return studentName;
    }
    public String getStudentDepartment() {
        return studentDepartment;
    }
    public AppConfig() {
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
    
    
}
