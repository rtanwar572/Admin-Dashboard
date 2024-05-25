package com.Dashboard.service;

import com.Dashboard.model.DataPoint;
import com.Dashboard.repo.DataPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DataPointService {
    @Autowired
    private DataPointRepository repository;

    public List<DataPoint> getAllDataPoints() {
        return repository.findAll();
    }

    public List<DataPoint> getDataPointsByFilters(Map<String, String> filters) {
        return repository.findAll().stream()
                .filter(dataPoint -> filters.entrySet().stream()
                        .allMatch(filter -> {
                            switch (filter.getKey()) {
                                case "year":
                                    return dataPoint.getYear() == Integer.parseInt(filter.getValue());
                                case "country":
                                    return dataPoint.getCountry().equalsIgnoreCase(filter.getValue());
                                case "topic":
                                    return dataPoint.getTopic().equalsIgnoreCase(filter.getValue());
                                case "region":
                                    return dataPoint.getRegion().equalsIgnoreCase(filter.getValue());
                                case "city":
                                    return dataPoint.getCity().equalsIgnoreCase(filter.getValue());
                                default:
                                    return true;
                            }
                        }))
                .collect(Collectors.toList());
    }
}
