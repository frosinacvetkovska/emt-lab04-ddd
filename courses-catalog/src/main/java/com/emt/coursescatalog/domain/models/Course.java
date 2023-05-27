package com.emt.coursescatalog.domain.models;

import com.emt.sharedkernel.domain.base.AbstractEntity;
import com.emt.sharedkernel.domain.financial.Money;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="testdb")
@Getter
public class Course extends AbstractEntity<CourseId> {
    private String courseName;
    private String description;
    private int sales = 0;

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="price_amount")),
            @AttributeOverride(name="currency", column = @Column(name="price_currency"))
    })
    private Money price;

    protected Course() {
        super(CourseId.randomId(CourseId.class));
    }

    public static Course build(String courseName, String description, Money price, int sales) {
        Course course = new Course();
        course.price = price;
        course.courseName = courseName;
        course.description = description;
        course.sales = sales;
        return course;
    }

    public void addSales(int qty) {
        this.sales = this.sales - qty;
    }

    public void removeSales(int qty) {
        this.sales -= qty;
    }

}
