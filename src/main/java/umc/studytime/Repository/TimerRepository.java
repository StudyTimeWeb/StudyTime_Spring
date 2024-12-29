package umc.studytime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.studytime.domain.Timer;

import java.util.Optional;

@Repository
public interface TimerRepository extends JpaRepository<Timer, Long> {
    ;
}
