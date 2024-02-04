package com.springbank.spring.bank.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddAmountRequestDto {
    @NotBlank(message = "Amount can't be empty!")
    @Positive(message = "Can't add negative amount!")
    private BigDecimal amount;

    @NotBlank(message = "Account id can't be empty!")
    private Long account_id;
}
