import com.khoavm.habit_tracker_be.dto.HabitDto;
import com.khoavm.habit_tracker_be.dto.HabitSearchDto;
import com.khoavm.habit_tracker_be.entity.Habit;
import com.khoavm.habit_tracker_be.mapper.HabitMapper;
import com.khoavm.habit_tracker_be.repository.HabitRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

import java.util.UUID;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HabitServiceImpl implements HabitService, HabitService {

    private final HabitRepository habitRepository;

    @Override
    public HabitDto createHabit(HabitDto habitDto) {
        var habit = habitRepository.save(HabitMapper.mapHabitFromDto(habitDto));
        return HabitMapper.mapHabitToDto(habit);
    }



    @Override
    public Page<HabitDto> searchHabits(HabitSearchDto query, Pageable pageable) {
        Specification<Habit> spec = Specification.where((root, query, criteriaBuilder) ->
            criteriaBuilder.like(root.get("habitName"), "%" + habitName + "%")
        );
        Page<Habit> habits = habitRepository.findAll(spec, pageable);
        return habits.map(HabitMapper::mapHabitToDto);
    }


}