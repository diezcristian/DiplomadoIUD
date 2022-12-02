package co.edu.iudigital.helpmeiud.repository;

import co.edu.iudigital.helpmeiud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String email);

    @Query("SELECT u FROM Usuario u WHERE u.username=?1")
    public Usuario findByUsername2(String email);
}
