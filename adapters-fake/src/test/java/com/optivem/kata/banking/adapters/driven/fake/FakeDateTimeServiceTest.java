package com.optivem.kata.banking.adapters.driven.fake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static com.optivem.kata.banking.core.common.Givens.givenThat;
import static org.assertj.core.api.Assertions.assertThat;

class FakeDateTimeServiceTest {
    private FakeDateTimeService service;

    @BeforeEach
    private void init() {
        this.service = new FakeDateTimeService();
    }

    @Test
    void should_return_current_date_time() {
        var dateTime = LocalDateTime.of(2022, 4, 15, 9, 1);
        givenThat(service).willReturn(dateTime);

        assertReturnsNext(dateTime);
    }

    private void assertReturnsNext(LocalDateTime dateTime) {
        var current = service.now();
        assertThat(current).isEqualTo(dateTime);
    }
}
