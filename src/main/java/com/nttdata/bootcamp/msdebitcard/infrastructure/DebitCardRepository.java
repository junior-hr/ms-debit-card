package com.nttdata.bootcamp.msdebitcard.infrastructure;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.nttdata.bootcamp.msdebitcard.model.DebitCard;
import reactor.core.publisher.Mono;

/**
 * Class DebitCardRepository.
 * DebiCard microservice class DebitCardRepository.
 */
@Repository
public interface DebitCardRepository extends ReactiveMongoRepository<DebitCard, String> {
    public Mono<DebitCard> findByCardNumber(String cardNumber);
}
