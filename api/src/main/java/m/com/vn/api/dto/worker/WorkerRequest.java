package m.com.vn.api.dto.worker;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class WorkerRequest {
    @NotNull
    @NotBlank
    private String code;
    @NotNull
    private Long company;
    @NotNull
    @NotBlank
    private String name;
    private String address;
    private String searchStr;
    public void setCompany(Long company) {
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

    public void setSearchStr(String search_str) {
        this.searchStr = search_str;
    }

    public WorkerRequest(Long company, String code, String name, String address, String searchStr) {
        this.company = company;
        this.code = code;
        this.name = name;
        this.address = address;
        this.searchStr = searchStr;
    }
}
