package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerUpcRepository extends JpaRepository<Beer,String> {

    Beer findByUpc (String upc);
}
