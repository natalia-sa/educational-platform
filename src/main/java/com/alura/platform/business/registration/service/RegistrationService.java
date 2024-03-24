package com.alura.platform.business.registration.service;

import com.alura.platform.business.basic.BasicService;
import com.alura.platform.business.registration.dto.RegistrationUserIdCourseIdDto;
import com.alura.platform.business.registration.entity.Registration;

public interface RegistrationService extends BasicService<Registration, Long> {

    Registration save(RegistrationUserIdCourseIdDto dto);
}