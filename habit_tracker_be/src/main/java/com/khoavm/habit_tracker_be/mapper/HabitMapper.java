package com.khoavm.habit_tracker_be.mapper;

import com.khoavm.habit_tracker_be.dto.HabitDto;
import com.khoavm.habit_tracker_be.entity.Habit;

public class HabitMapper {

    public static Habit mapHabitFromDto(HabitDto habitDto) {
        Habit habit = new Habit();
        habit.setId(habitDto.getId());
        habit.setName(habitDto.getName());
        habit.setDescription(habitDto.getDescription());
        return habit;
    }

    public static HabitDto mapHabitToDto(Habit habit){
        return HabitDto.builder()
                .id(habit.getId())
                .name(habit.getName())
                .description(habit.getDescription())
                .build();
    }
}
