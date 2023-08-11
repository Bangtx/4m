package m.com.vn.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company extends Base {
    private String code;
    private String name;
    private String address;
    private String search_str;

    public Company() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSearch_str() {
        return search_str;
    }

    public void setSearch_str(String search_str) {
        this.search_str = search_str;
    }

    public Company(String code, String name, String address, String search_str) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.search_str = search_str;
    }
}