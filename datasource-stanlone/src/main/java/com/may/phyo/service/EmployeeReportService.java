package com.may.phyo.service;

import com.may.phyo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeReportService {
    @Autowired
    private EmployeeDao employeeDao;

    public void printReport(){
        System.out.println("Start");
        employeeDao.findEmployeeEmails().forEach(System.out::println);
        System.out.println("Stop");
    }
}
