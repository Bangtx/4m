package m.com.vn.api.dto.company;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public abstract class CompanyRequest {
    @NotNull
    @NotBlank
    private String code;
    @NotNull
    @NotBlank
    private String name;
    private String address;
    private String searchStr;

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

    public String getSearchStr() {
        return searchStr;
    }

    public void setSearchStr(String search_str) {
        this.searchStr = search_str;
    }

    public CompanyRequest(String code, String name, String address, String searchStr) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.searchStr = searchStr;
    }
}