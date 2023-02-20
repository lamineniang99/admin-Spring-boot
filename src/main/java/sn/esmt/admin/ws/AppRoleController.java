package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRolesRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@Controller
@RestController
@RequestMapping(value = "roles")
@AllArgsConstructor

public class AppRoleController {
    private AppRolesRepository appRolesRepository ;
    @PostMapping(path = "/save")
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRolesRepository.save(appRoleEntity);
    }
    @GetMapping(path = "/all")
    public List<AppRoleEntity> all(){
        return appRolesRepository.findAll();
    }
    @GetMapping(path = "/login")
    public AppRoleEntity login(@RequestParam String nom){
        return appRolesRepository.findByNom(nom);
    }
}
