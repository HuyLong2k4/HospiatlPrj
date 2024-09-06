package com.example.hospital_service.mapper;

import com.example.hospital_service.dto.request.PatientCreateRequest;
import com.example.hospital_service.dto.request.PatientUpdateRequest;
import com.example.hospital_service.dto.response.PatientResponse;
import com.example.hospital_service.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    Patient toPatient(PatientCreateRequest request);
    PatientResponse toPatientResponse(Patient patient);
    void updatePatient(@MappingTarget Patient patient, PatientUpdateRequest request);
}
