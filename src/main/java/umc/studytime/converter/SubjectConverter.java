package umc.studytime.converter;

import umc.studytime.domain.Subject;
import umc.studytime.dto.SubjectRequestDTO;
import umc.studytime.dto.SubjectResponseDTO;

import java.util.Optional;

public class SubjectConverter {
    public static SubjectResponseDTO.TimerResultDTO toTimerResultDTO(Optional<Subject> subject) {
        return SubjectResponseDTO.TimerResultDTO.builder()
                .subjectId(subject.get().getId())
                .subjectName(subject.get().getName())
                .restGoal(subject.get().getRestGoal())
                .dayGoal(subject.get().getCal().getDayGoal())
                .studyGoal(subject.get().getStudyGoal())
                .build();
    }

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
