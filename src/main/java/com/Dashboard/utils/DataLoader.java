package com.Dashboard.utils;

import com.Dashboard.model.DataPoint;
import com.Dashboard.repo.DataPointRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private DataPointRepository repository;

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ClassPathResource("data.csv").getInputStream()))) {
                CsvToBean<DataPoint> csvToBean = new CsvToBeanBuilder<DataPoint>(reader)
                        .withType(DataPoint.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();

                List<DataPoint> dataPoints = csvToBean.parse();
                repository.saveAll(dataPoints);
            }
        }
    }
}

