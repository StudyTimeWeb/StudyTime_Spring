package umc.studytime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.studytime.Repository.SubjectRepository;
import umc.studytime.domain.Subject;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public Optional<Subject> findSubject(Long id) {
        return subjectRepository.findById(id);
    }

}
