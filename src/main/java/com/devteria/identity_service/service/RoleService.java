package com.devteria.identity_service.service;

import com.devteria.identity_service.dto.request.PermissionRequest;
import com.devteria.identity_service.dto.request.RoleRequest;
import com.devteria.identity_service.dto.response.PermissionResponse;
import com.devteria.identity_service.dto.response.RoleResponse;
import com.devteria.identity_service.entity.Permission;
import com.devteria.identity_service.entity.Role;
import com.devteria.identity_service.mapper.PermissionMapper;
import com.devteria.identity_service.mapper.RoleMapper;
import com.devteria.identity_service.repository.PermissionRepository;
import com.devteria.identity_service.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleService(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    public RoleResponse create(RoleRequest request) {
        Role role = roleMapper.toRole(request);
        roleRepository.save(role);
        RoleResponse roleResponse = roleMapper.toRoleResponse(role);
        return roleResponse;

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