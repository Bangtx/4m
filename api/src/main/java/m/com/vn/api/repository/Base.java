package m.com.vn.api.repository;

import m.com.vn.api.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;

@NoRepositoryBean
public interface Base<T, ID>  extends JpaRepository<T, ID> {
    @Query("SELECT e FROM #{#entityName} e WHERE e.searchStr ILIKE %:searchStr%")
    public List<T> findBySearchStr(@Param("searchStr") String searchStr);

    @Modifying
    @Query("UPDATE #{#entityName} e SET e.active = false WHERE e.id = :id")
    void softDelete(@Param("id") ID id);
}
