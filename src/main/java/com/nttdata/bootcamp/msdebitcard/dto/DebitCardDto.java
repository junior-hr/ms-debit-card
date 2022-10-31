package com.nttdata.bootcamp.msdebitcard.dto;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DebitCardDto {
    @Id
    private Integer id;
    private String cardNumber;
    private Boolean state;
}
