package m.com.vn.api.dto.worker;

public class WorkerCreate extends WorkerRequest{
    public WorkerCreate(Long company, String code, String name, String address, String searchStr) {
        super(company, code, name, address, searchStr);
    }
}
