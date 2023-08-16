package m.com.vn.api.controller;

import m.com.vn.api.dto.worker.WorkerCreate;
import m.com.vn.api.services.company.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class Worker {
    @Autowired
    private WorkerService workerService;

    @GetMapping("/")
    public List<m.com.vn.api.models.Worker> getWorkers(String searchStr) {
        return workerService.getWorkers(searchStr);
    }

    @PostMapping("/")
    public m.com.vn.api.models.Worker createWorker(@RequestBody WorkerCreate worker) {
        return workerService.createWorker(worker);
    }
}
