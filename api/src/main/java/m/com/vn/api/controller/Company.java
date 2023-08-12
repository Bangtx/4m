package m.com.vn.api.controller;
import jakarta.validation.Valid;
import m.com.vn.api.dto.company.CompanyUpdate;
import m.com.vn.api.services.company.CompanyService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class Company {
    @Autowired
    private CompanyService companyService;

//    public List<m.com.vn.api.models.Company> getCompanies(@RequestParam(value = "name", defaultValue = "World") String name) {
    @GetMapping("/")
    public List<m.com.vn.api.models.Company> getCompanies(String searchStr) {
        return companyService.getList(searchStr);
    }

//    @PostMapping("/")
//    public m.com.vn.api.models.Company saveCompany(@RequestBody m.com.vn.api.models.Company company) {
//        System.out.println(company.toString());
//        return companyRepository.save(company);
//    }

//    @PutMapping("/{id}")
//    public m.com.vn.api.models.Company editCompany(@PathVariable Long id, @RequestBody m.com.vn.api.models.Company company) {
//        System.out.println(company.toString());
//        Optional<m.com.vn.api.models.Company> cpn = companyRepository.findById(id);
//        cpn.get().setCode(company.getCode());
//        cpn.get().setName(company.getName());
//        cpn.get().setAddress(company.getAddress());
//        return companyRepository.save(cpn.get());
//    }

    @PutMapping("/{id}")
    public m.com.vn.api.models.Company editCompany(@PathVariable Long id, @Valid @RequestBody CompanyUpdate company) {
        return companyService.update(id, company);
    }
}