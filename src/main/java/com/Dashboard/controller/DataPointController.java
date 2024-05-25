package com.Dashboard.controller;

import com.Dashboard.model.DataPoint;
import com.Dashboard.service.DataPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/data")
public class DataPointController {
    @Autowired
    private DataPointService service;

    @GetMapping
    public List<DataPoint> getAllData(@RequestParam Map<String, String> filters) {
        if (filters.isEmpty()) {
            return service.getAllDataPoints();
        } else {
            return service.getDataPointsByFilters(filters);
        }
    }
}
