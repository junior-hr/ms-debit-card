package com.nttdata.bootcamp.msdebitcard.infrastructure;

import com.nttdata.bootcamp.msdebitcard.model.DebitCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface DebitCardRepository extends ReactiveMongoRepository<DebitCard, String> {
    public Mono<DebitCard> findByCardNumber(String cardNumber);
}
