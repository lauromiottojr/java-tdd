package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdd.model.BookingModel;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, Integer> {

	Optional<BookingModel> findByReverveName(String name);

}
