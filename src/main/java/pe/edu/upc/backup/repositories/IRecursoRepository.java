package pe.edu.upc.backup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backup.entities.Recurso;

import java.util.List;

    @Repository
    public interface IRecursoRepository extends JpaRepository<Recurso,Integer> {

    @Query(value = "SELECT re.tipo_contendo, COUNT(re.idrecurso)," +
            " FROM recursos re GROUP BY re.tipo_contendo ORDER BY COUNT(re.idrecurso) ASC limit 1", nativeQuery = true)
    List<String[]> get2tipoconteido();

}
