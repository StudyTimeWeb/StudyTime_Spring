package umc.studytime.converter;

import umc.studytime.DTO.SubjectResponseDTO;
import umc.studytime.domain.Subject;

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
}

