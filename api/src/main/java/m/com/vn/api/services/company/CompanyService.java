package m.com.vn.api.services.company;
import m.com.vn.api.dto.company.CompanyUpdate;
import m.com.vn.api.models.Company;
import m.com.vn.api.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService extends Base {
    @Autowired
    private CompanyRepository companyRepository;
    public Company update(Long id, CompanyUpdate newCompany) {
        Optional<Company> company = companyRepository.findById(id);
        company.get().setCode(newCompany.getCode());
        company.get().setName(newCompany.getName());
        company.get().setAddress(newCompany.getAddress());
        company.get().setSearchStr(toSearchString(newCompany.getCode(), newCompany.getName()));
        return companyRepository.save(company.get());
    }

    public List<Company> getList(String searchStr) {
        System.out.println(searchStr);
        if (searchStr != null) {
            return companyRepository.findBySearchStr(searchStr);
        }
        return companyRepository.findAll();
    }
}
