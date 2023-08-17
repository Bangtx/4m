package m.com.vn.api.models;
import jakarta.persistence.Entity;
import lombok.*;
import m.com.vn.api.dto.company.CompanyCreate;
import org.hibernate.annotations.Where;

@Entity
@Where(clause = "active = true")
public class Company extends Base {
    private String code;
    private String name;
    private String address;
    private String searchStr;
    public Company() {}

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

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSearchStr(String search_str) {
        this.searchStr = search_str;
    }

    public Company(String code, String name, String address, String search_str) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.searchStr = search_str;
    }
}
