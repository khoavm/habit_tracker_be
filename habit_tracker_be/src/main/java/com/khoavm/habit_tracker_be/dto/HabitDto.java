package com.khoavm.habit_tracker_be.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class HabitDto {
    private UUID id;
    private String name;
    private String description;
}
