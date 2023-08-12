package m.com.vn.api.repository;
import m.com.vn.api.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    public List<Company> findByCode(String code);

    @Query("SELECT c FROM Company c WHERE c.searchStr ILIKE %:searchStr%")
    public List<Company> findBySearchStr(@Param("searchStr") String searchStr);
}