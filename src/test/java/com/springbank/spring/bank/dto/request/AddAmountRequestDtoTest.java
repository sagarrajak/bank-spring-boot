package com.springbank.spring.bank.dto.request;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import java.math.BigDecimal;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
@JsonTest
class AddAmountRequestDtoTest {
    @Autowired
    private JacksonTester<AddAmountRequestDto> json;

    private final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @Test
    public void testValidDto() {
        AddAmountRequestDto dto = AddAmountRequestDto.builder().amount(BigDecimal.valueOf(12)).account_id(123L).build();
        Set<ConstraintViolation<AddAmountRequestDto>> violations = validator.validate(dto);
        assertThat(violations).isEmpty();
    }
}