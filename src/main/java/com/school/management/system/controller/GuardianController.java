package com.school.management.system.controller;


import com.school.management.system.entity.Guardian;
import com.school.management.system.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("guardian")
public class GuardianController {

    @Autowired
    private GuardianService guardianService;

    @GetMapping("/getAllGuardians")
   public List<Guardian> getAllGuardians(){
        return guardianService.getAllGuardians();
    }

    @PostMapping("/createGuardians")
    public Guardian createGuardian(@RequestBody Guardian guardian){
        return guardianService.createGuardian(guardian);
    }

    @GetMapping("/getSingleGuardian/{id}")
    public Guardian getSingleGuardian(@PathVariable("id") int id){
        return guardianService.getOneGuardian(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGuardian(@PathVariable("id") int id){
         guardianService.deleteGuardian(id);
    }

    @PutMapping("update/{id}")
    public Guardian updateGuardian(@RequestBody Guardian guardian, @PathVariable("id") int id){
        return guardianService.updateGuardian(guardian);

    }
}
