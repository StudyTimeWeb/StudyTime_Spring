package umc.studytime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.studytime.domain.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
