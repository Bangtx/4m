package m.com.vn.api.dto.worker;

public class WorkerUpdate extends WorkerRequest{
    public WorkerUpdate(Long company, String code, String name, String address, String searchStr) {
        super(company, code, name, address, searchStr);
    }
}
