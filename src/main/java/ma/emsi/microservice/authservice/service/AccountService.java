package ma.emsi.microservice.authservice.service;

import ma.emsi.microservice.authservice.entities.AppRole;
import ma.emsi.microservice.authservice.entities.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}