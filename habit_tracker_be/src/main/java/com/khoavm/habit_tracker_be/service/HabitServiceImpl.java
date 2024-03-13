package com.khoavm.habit_tracker_be.service;

import com.khoavm.habit_tracker_be.dto.HabitDto;
import com.khoavm.habit_tracker_be.mapper.HabitMapper;
import com.khoavm.habit_tracker_be.repository.HabitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HabitServiceImpl implements HabitService {

    private final HabitRepository habitRepository;

    @Override
    public HabitDto createHabit(HabitDto habitDto) {
        var habit = habitRepository.save(HabitMapper.mapHabitFromDto(habitDto));
        return HabitMapper.mapHabitToDto(habit);
    }
}
