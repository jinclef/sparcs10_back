package com.sparcs10.demo.repository;

import com.sparcs10.demo.entity.Quest;
import com.sparcs10.demo.entity.UserQuest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserQuestRepository extends JpaRepository<UserQuest, String> {
    int countAllByUser_UsernameAndSuccessDate(String userName, LocalDate successDate);
    List<UserQuest> findAllByUser_UsernameAndSuccessDate(String userName, LocalDate successDate);
}
