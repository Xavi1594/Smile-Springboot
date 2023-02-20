package com.smile.smile.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smile.smile.model.ProfileModel;
import com.smile.smile.repositories.ProfileRepository;

@Service
public class ProfileService {
    

    private ProfileRepository repository;

    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    public List<ProfileModel> getAll() {
        return repository.findAll();
    }

    public ProfileModel getOne(Long idProfile) {
        return null;
    }

    // public PatientModel getOne(String dni) {
    //     return repository.findByDni(dni);

    // }
}

