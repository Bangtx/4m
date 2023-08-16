package m.com.vn.api.services.company;

import m.com.vn.api.dto.worker.WorkerCreate;
import m.com.vn.api.mappers.WorkerMapper;
import m.com.vn.api.models.Worker;
import m.com.vn.api.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService extends Base {
    private final WorkerRepository workerRepository;
    private final WorkerMapper workerMapper;

    public List<Worker> getWorkers(String searchStr) {
        if (searchStr == null) return workerRepository.findAll();
        return workerRepository.findBySearchStr(searchStr);
    }

    public WorkerService(WorkerRepository workerRepository, WorkerMapper workerMapper) {
        this.workerRepository = workerRepository;
        this.workerMapper = workerMapper;
    }

    public Worker createWorker(WorkerCreate newWorker) {
        return workerRepository.save(workerMapper.dtoToEntity(newWorker));
    }
}
