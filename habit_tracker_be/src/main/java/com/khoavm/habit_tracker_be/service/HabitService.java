package com.khoavm.habit_tracker_be.service;

import com.khoavm.habit_tracker_be.dto.HabitDto;
import com.khoavm.habit_tracker_be.repository.HabitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

public interface HabitService {

    HabitDto createHabit(HabitDto habitDto);


}
