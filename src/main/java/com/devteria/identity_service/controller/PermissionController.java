package com.devteria.identity_service.controller;


import com.devteria.identity_service.dto.ApiResponse;
import com.devteria.identity_service.dto.request.PermissionRequest;
import com.devteria.identity_service.dto.response.PermissionResponse;
import com.devteria.identity_service.dto.response.UserResponse;
import com.devteria.identity_service.service.PermissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permissions")
public class PermissionController {
    PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @PostMapping
    ApiResponse<PermissionResponse> create(@RequestBody PermissionRequest request){
        ApiResponse<PermissionResponse> apiResponse = new ApiResponse<>();
        apiResponse.setResult(permissionService.create(request));
        return apiResponse;
    }

    @GetMapping
    ApiResponse<List<PermissionResponse>> getAll(){
        ApiResponse<List<PermissionResponse>> apiResponse = new ApiResponse<>();
        apiResponse.setResult(permissionService.getAll());
        return apiResponse;
    }

    @DeleteMapping("/{permissionName}")
    ApiResponse<String> delete(@PathVariable("permissionName") String permissionName){
        ApiResponse<String> apiResponse = new ApiResponse<>();
        permissionService.delete(permissionName);
        apiResponse.setResult("permission deleted");
        return  apiResponse;
    }
}



