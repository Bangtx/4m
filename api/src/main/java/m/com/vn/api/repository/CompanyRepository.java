package m.com.vn.api.repository;
import m.com.vn.api.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends Base<Company, Long> {
    public List<Company> findByCode(String code);
}