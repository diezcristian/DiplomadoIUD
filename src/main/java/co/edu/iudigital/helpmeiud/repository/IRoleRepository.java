package co.edu.iudigital.helpmeiud.repository;

import co.edu.iudigital.helpmeiud.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
