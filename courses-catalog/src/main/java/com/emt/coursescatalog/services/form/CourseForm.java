package com.emt.coursescatalog.services.form;

import com.emt.sharedkernel.domain.financial.Money;
import lombok.Data;

@Data
public class CourseForm {
    private String courseName;
    private String courseDescription;
    private Money price;
    private int sales;
}
