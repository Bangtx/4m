package m.com.vn.api.mappers;

import m.com.vn.api.dto.company.CompanyCreate;
import m.com.vn.api.dto.company.CompanyUpdate;
import m.com.vn.api.models.Company;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.Optional;
//@Mapper
@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyMapper MAPPER = Mappers.getMapper(CompanyMapper.class);
    CompanyCreate entityToDto(Company entity);
    Company dtoToEntity(CompanyCreate dto);
    void updateEntityFromDto(CompanyUpdate dto, @MappingTarget Company entity);
}
