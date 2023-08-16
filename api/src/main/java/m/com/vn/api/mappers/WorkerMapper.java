package m.com.vn.api.mappers;

import m.com.vn.api.dto.worker.WorkerCreate;
import m.com.vn.api.dto.worker.WorkerUpdate;
import m.com.vn.api.models.Company;
import m.com.vn.api.models.Worker;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface WorkerMapper {

    @Mapping(source = "entity.id", target = "company")
    WorkerCreate entityToDto(Worker entity);
    @Mapping(source = "dto.company", target = "company")
    Worker dtoToEntity(WorkerCreate dto);
    //    @Mapping(source = "company", target = "company.id")
    //    void updateEntityFromDto(WorkerUpdate dto, @MappingTarget Worker entity);
    default Long companyToLong(Company company) {
        return company != null ? company.getId() : null;
    }

    default Company longToCompany(Long companyId) {
        if (companyId == null) {
            return null;
        }
        Company company = new Company();
        company.setId(companyId);
        return company;
    }
}
