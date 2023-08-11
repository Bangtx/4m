package m.com.vn.api.dto.company;

public class CompanyUpdate extends CompanyCreate{
    public CompanyUpdate(String code, String name, String address, String search_str) {
        super(code, name, address, search_str);
    }
}
