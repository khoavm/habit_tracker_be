package com.khoavm.habit_tracker_be.controller;

import com.khoavm.habit_tracker_be.dto.HabitDto;
import com.khoavm.habit_tracker_be.dto.ResponseDto;
import com.khoavm.habit_tracker_be.helper.ResponseHelper;
import com.khoavm.habit_tracker_be.service.HabitService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habit")
@AllArgsConstructor
public class HabitController {

    private final HabitService habitService;
    @PostMapping
    public ResponseEntity<ResponseDto> createHabit(@RequestBody HabitDto habitDto){
       var habit = habitService.createHabit(habitDto);
       return ResponseHelper.DefaultCreateSuccessResponse(habit);


    }
}
