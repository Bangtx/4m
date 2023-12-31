package m.com.vn.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.annotations.Where;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Where(clause = "active = true")
public class Worker extends Base {
    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company;
    private String code;
    private String name;
    private String address;
    private String searchStr;

    public Company getCompany() {
        return company;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSearchStr() {
        return searchStr;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSearchStr(String searchStr) {
        this.searchStr = searchStr;
    }
}
