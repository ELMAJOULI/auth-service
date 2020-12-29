package ma.emsi.microservice.authservice.repositories;

import ma.emsi.microservice.authservice.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);
}