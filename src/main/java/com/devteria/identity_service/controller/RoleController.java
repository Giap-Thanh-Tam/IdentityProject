package com.devteria.identity_service.controller;

import com.devteria.identity_service.dto.ApiResponse;
import com.devteria.identity_service.dto.request.RoleRequest;
import com.devteria.identity_service.dto.response.RoleResponse;
import com.devteria.identity_service.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    ApiResponse<RoleResponse> create(@RequestBody RoleRequest request){
        ApiResponse<RoleResponse> apiResponse = new ApiResponse<>();
        apiResponse.setResult(roleService.create(request));
        return apiResponse;
    }

    @GetMapping
    ApiResponse<List<RoleResponse>> getAll(){
        ApiResponse<List<RoleResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setResult(roleService.getAll());
        return apiResponse;
    }

    @DeleteMapping("/{roleName}")
    ApiResponse<String> delete(@PathVariable("roleName") String roleName){
        ApiResponse<String> apiResponse = new ApiResponse<>();
        roleService.delete(roleName);
        apiResponse.setResult("role deleted");
        return apiResponse;
    }
}



