package com.khoavm.habit_tracker_be.repository;

import com.khoavm.habit_tracker_be.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HabitRepository extends JpaRepository<Habit,UUID> {

}
