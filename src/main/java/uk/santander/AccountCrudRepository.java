package uk.santander;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface AccountCrudRepository
        extends ReactiveCrudRepository<Account, String> {

    Flux<Account> findAllByValue(String value);
    Flux<Account> findAllByOwner(String owner);
}