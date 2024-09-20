package com.devteria.identity_service.service;

import com.devteria.identity_service.dto.request.PermissionRequest;
import com.devteria.identity_service.dto.response.PermissionResponse;
import com.devteria.identity_service.entity.Permission;
import com.devteria.identity_service.mapper.PermissionMapper;
import com.devteria.identity_service.repository.PermissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionService {
    private final PermissionRepository permissionRepository;
    private final PermissionMapper permissionMapper;

    public PermissionService(PermissionRepository permissionRepository, PermissionMapper permissionMapper) {
        this.permissionRepository = permissionRepository;
        this.permissionMapper = permissionMapper;
    }

    public PermissionResponse create(PermissionRequest request) {
        Permission permission = permissionMapper.toPermission(request);
        permission = permissionRepository.save(permission);
        PermissionResponse permissionResponse = permissionMapper.toPermissionResponse(permission);
        return permissionResponse;

    }

    public List<PermissionResponse> getAll() {
        var permissions = permissionRepository.findAll();
        return permissionRepository.findAll().stream()
                .map(permissionMapper::toPermissionResponse).toList();
    }

    public void delete(String permission) {
        permissionRepository.deleteById(permission);

    }
}