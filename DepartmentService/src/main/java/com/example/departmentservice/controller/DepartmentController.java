package com.example.departmentservice.controller;


import com.example.departmentservice.entity.Department;
import com.example.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDeparment(@RequestBody Department derpartment){
//        log.info("inside saveDeparment method if Department controller!");
        return departmentService.saveDepartment(derpartment);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
//        log.info("inside findDeparmentById method if Department controller!");
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello DepartmentService!";
    }
}