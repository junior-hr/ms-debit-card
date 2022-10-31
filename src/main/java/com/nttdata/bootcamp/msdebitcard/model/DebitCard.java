package com.nttdata.bootcamp.msdebitcard.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DebitCard")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DebitCard {

    @Id
    private String idDebitCard;
    private String cardNumber;
    private Boolean state;
    
}
