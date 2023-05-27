package com.emt.sharedkernel.infra;

import com.emt.sharedkernel.domain.events.DomainEvent;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
}
