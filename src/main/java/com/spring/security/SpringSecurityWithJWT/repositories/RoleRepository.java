package com.spring.security.SpringSecurityWithJWT.repositories;

import com.spring.security.SpringSecurityWithJWT.models.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository  extends CrudRepository<RoleEntity,Long> {
}
