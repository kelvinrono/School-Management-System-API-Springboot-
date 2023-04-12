package com.school.management.system.service;

import com.school.management.system.entity.Guardian;
import com.school.management.system.entity.Student;

import java.util.List;

public interface GuardianService {

    List<Guardian> getAllGuardians();

    Guardian createGuardian(Guardian guardian);

    Guardian getOneGuardian(int id);

    void deleteGuardian(int guardian);

    Guardian updateGuardian(Guardian guardian);
}
