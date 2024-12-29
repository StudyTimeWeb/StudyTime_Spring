package umc.studytime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.studytime.domain.HourCount;

@Repository
public interface HourCountRepository extends JpaRepository<HourCount, Integer> {
}
