package m.com.vn.api.dto.company;

public class CompanyCreate extends CompanyRequest{
    public CompanyCreate(String code, String name, String address, String search_str) {
        super(code, name, address, search_str);
    }
}
