package com.devteria.identity_service.controller;

import com.devteria.identity_service.dto.ApiResponse;
import com.devteria.identity_service.dto.request.AuthenticationRequest;
import com.devteria.identity_service.dto.response.AuthenticationResponse;
import com.devteria.identity_service.service.AuthenticationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/log-in")
    ApiResponse<AuthenticationResponse> authenticate (@RequestBody AuthenticationRequest request){
        boolean result = authenticationService.authenticate(request);
        AuthenticationResponse authResponse = new AuthenticationResponse(result);

        ApiResponse<AuthenticationResponse> apiResponse = new ApiResponse<>();
        apiResponse.setResult(authResponse);
//        apiResponse.setMessage(result ? "Authentication successful" : "Authentication failed");
        return apiResponse;

//        return ApiResponse.<AuthenticationResponse>builder()
//                .result(AuthenticationResponse.builder()
//                        .authenticatedresult()
//                .build())
//                .build();
    }


}
