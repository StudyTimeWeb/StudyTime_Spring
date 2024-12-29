package umc.studytime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.studytime.Repository.SubjectRepository;
import umc.studytime.converter.SubjectConverter;
import umc.studytime.domain.Subject;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public Subject createSubject(umc.studytime.dto.SubjectRequestDTO.createDTO request) {

        Subject subject = SubjectConverter.toSubject(request);

        return subjectRepository.save(subject);
    }

    public void deleteSubject(Long subjectId) {

        Subject subject = subjectRepository.findById(subjectId)
                .orElseThrow(() -> new IllegalArgumentException("Subject not found with id: " + subjectId));
        subjectRepository.delete(subject);
    }
}
