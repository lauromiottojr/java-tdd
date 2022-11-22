package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdd.model.BookingModel;

public interface BookingRepository extends JpaRepository<BookingModel, Integer> {

	Optional<BookingModel> findByReverveName(String name);

}
