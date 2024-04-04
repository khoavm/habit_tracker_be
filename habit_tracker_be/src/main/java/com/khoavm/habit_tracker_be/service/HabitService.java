package com.khoavm.habit_tracker_be.service;

import com.khoavm.habit_tracker_be.dto.HabitDto;
import com.khoavm.habit_tracker_be.repository.HabitRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface HabitService {

    HabitDto createHabit(HabitDto habitDto);


    List<HabitDto> getAllHabits();

    HabitDto getHabitById(UUID id) throws ChangeSetPersister.NotFoundException;
}
