package co.yom.repository;

import co.yom.model.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends  JpaRepository<Articulos, Long>{
}
