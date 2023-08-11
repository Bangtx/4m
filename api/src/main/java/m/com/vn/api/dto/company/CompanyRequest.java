package m.com.vn.api.dto.company;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public abstract class CompanyRequest {
    @NotNull
    @NotBlank
    private String code;
    @NotNull
    @NotBlank
    private String name;
    private String address;
    private String search_str;

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

    public CompanyRequest(String code, String name, String address, String search_str) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.search_str = search_str;
    }
}