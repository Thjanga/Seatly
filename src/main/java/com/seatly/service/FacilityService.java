package com.seatly.service;

import com.seatly.domain.Facility;
import com.seatly.domain.User;
import com.seatly.dto.facility.FacilityCreateRequest;
import com.seatly.dto.facility.FacilityResponse;
import com.seatly.dto.facility.FacilityUpdateRequest;
import com.seatly.dto.user.UserResponse;
import com.seatly.dto.user.UserUpdateRequest;
import com.seatly.exception.FacilityNotFoundException;
import com.seatly.exception.UserNotFoundException;
import com.seatly.repository.FacilityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FacilityService {

    private final FacilityRepository facilityRepository;

    public FacilityService(FacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }

    public FacilityResponse createFacility(FacilityCreateRequest request) {
        Facility facility = new Facility(
                request.getName(),
                request.getDescription(),
                request.getCapacity()
        );

        Facility savedFacility = facilityRepository.save(facility);

        return new FacilityResponse(savedFacility);
    }

    public FacilityResponse getFacility(Long id){
        // 1. repository에서 id로 Facility 찾기
        Facility facility = facilityRepository.findById(id)
                // 2. 없으면 FacilityNotFoundException 발생
                .orElseThrow(() -> new FacilityNotFoundException("시설을 찾을 수 없습니다."));

        // 3. Facility → FacilityResponse 변환
        return new FacilityResponse(facility);
    }

    public List<FacilityResponse> getFacilities() {
        return facilityRepository.findAll()
                .stream()
                .map(FacilityResponse::new)
                .toList();
    }

    @Transactional
    public FacilityResponse updateFacility(Long id, FacilityUpdateRequest request) {
        Facility facility = facilityRepository.findById(id)
                .orElseThrow(() -> new FacilityNotFoundException("시설을 찾을 수 없습니다."));

        facility.updateFacility(request.getName(),request.getDescription(),request.getCapacity());

        return new FacilityResponse(facility);
    }
}