package umc.studytime.converter;

import umc.studytime.domain.Subject;
import umc.studytime.dto.SubjectRequestDTO;
import umc.studytime.dto.SubjectResponseDTO;

public class SubjectConverter {
    public static Subject toSubject(SubjectRequestDTO.createDTO request){
        return Subject.builder()
                .name(request.getName())
                .studyGoal(request.getStudyGoal())
                .restGoal(request.getRestGoal())
                .build();
    }

    public static SubjectResponseDTO.CreateResultDTO toCreateResultDTO(Subject subject) {
        return SubjectResponseDTO.CreateResultDTO.builder()
                .subjectId(subject.getId())
                .build();
    }
}
