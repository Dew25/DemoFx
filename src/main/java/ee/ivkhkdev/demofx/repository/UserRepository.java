package ee.ivkhkdev.demofx.repository;

import ee.ivkhkdev.demofx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
