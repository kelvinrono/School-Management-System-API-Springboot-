package com.school.management.system.service;

import com.school.management.system.entity.Guardian;
import com.school.management.system.entity.Guardian;
import com.school.management.system.repository.GuardianRepository;
import com.school.management.system.repository.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuardianServiceImp implements GuardianService {
    @Autowired
    private GuardianRepository guardianRepository;

    @Override
    public List<Guardian> getAllGuardians() {
        return guardianRepository.findAll();
    }

    @Override
    public Guardian createGuardian(Guardian guardian) {
        return guardianRepository.save(guardian);
    }

    @Override
    public Guardian getOneGuardian(int id) {
        Optional<Guardian> guardian = guardianRepository.findById(id);
        if (guardian.isPresent()) {
            return guardian.get();
        }
        throw new RuntimeException("Guardian is not found with id: "+id);

    }

    @Override
    public void deleteGuardian(int id) {
        guardianRepository.deleteById(id);
    }

    @Override
    public Guardian updateGuardian(Guardian guardian) {
        return guardianRepository.save(guardian);
    }

}
