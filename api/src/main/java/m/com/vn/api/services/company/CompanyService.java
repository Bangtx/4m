package m.com.vn.api.services.company;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import m.com.vn.api.dto.company.CompanyCreate;
import m.com.vn.api.dto.company.CompanyUpdate;
import m.com.vn.api.mappers.CompanyMapper;
import m.com.vn.api.models.Company;
import m.com.vn.api.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService extends Base {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    public CompanyService(CompanyRepository companyRepository, CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
//        this.companyMapper = companyMapper;
        this.companyMapper = companyMapper;
    }

    public Company create(CompanyCreate newCompany) {
        Company company = CompanyMapper.MAPPER.dtoToEntity(newCompany);
        return companyRepository.save(company);
    }
    public Company update(Long id, CompanyUpdate newCompany) {
        Optional<Company> company = companyRepository.findById(id);
        if (company.isPresent()) {
            Company existingCompanyEntity = company.get();
            companyMapper.updateEntityFromDto(newCompany, existingCompanyEntity);
            return companyRepository.save(existingCompanyEntity);
        } else {
            throw new EntityNotFoundException("Company not found");
        }
//        company.get()
//        company.gecompanyMapper.dtoToEntity(newCompany);
//        company.get().setCode(newCompany.getCode());
//        company.get().setName(newCompany.getName());
//        company.get().setAddress(newCompany.getAddress());
//        company.get().setSearchStr(toSearchString(newCompany.getCode(), newCompany.getName()));
//        return companyRepository.save(company.get());
    }

    public List<Company> getList(String searchStr) {
        System.out.println(searchStr);
        if (searchStr != null) {
            return companyRepository.findBySearchStr(searchStr);
        }
        return companyRepository.findAll();
    }

    @Transactional
    public void sortDelete(Long id) {
        companyRepository.softDelete(id);
    }
}
