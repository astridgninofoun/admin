package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.dao.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/roles")
@AllArgsConstructor
public class AppRoleController {
    private AppRoleRepository appRoleRepository;

    //fonction qui insere dans la base de données
    @PostMapping(path = "/save")//post Request

    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }

    //fonction qui retourne la liste des Roles
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }
}
