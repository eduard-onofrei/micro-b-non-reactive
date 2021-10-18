package uk.santander;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AccountCrudRepository extends CrudRepository<Account, String> {
    List<Account> findAllByValue(Double value);
    List<Account> findAllByOwner(String owner);
}