package ma.emsi.microservice.authservice.dto;

import lombok.Data;

@Data
public
class RoleUserForm{
    private String username;
    private String roleName;
}