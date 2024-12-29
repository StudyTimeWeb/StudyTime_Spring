package umc.studytime.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.studytime.Repository.SubjectRepository;
import umc.studytime.Repository.TimerRepository;
import umc.studytime.domain.Subject;
import umc.studytime.domain.Timer;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TimerService {
    private final TimerRepository timerRepository;

    public Optional<Timer> findTimer(Long id) {
        return timerRepository.findById(id);
    }

}