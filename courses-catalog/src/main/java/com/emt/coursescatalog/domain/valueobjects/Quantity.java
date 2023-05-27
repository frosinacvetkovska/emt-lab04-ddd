package com.emt.coursescatalog.domain.valueobjects;

import com.emt.sharedkernel.domain.base.ValueObject;
import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter

public class Quantity implements ValueObject {
    private final int quantity;

    protected Quantity() {
        this.quantity = 0;
    }

}