package com.pluralsight.adapter;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface EmployeeAdapter {
    EmployeeAdapter INSTANCE = Mappers.getMapper(EmployeeAdapter.class);

    @Mapping(target = "id", source = "cn")
    @Mapping(target = "firstName", source = "givenName")
    @Mapping(target = "lastName", source = "surname")
    @Mapping(target = "email", source = "mail")
    Employee toEmployee(EmployeeLdap employeeLdap);

    @InheritInverseConfiguration
    EmployeeLdap toEmployeeLdap(Employee employee);
}
