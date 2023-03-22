package com.bilgeadam.manager;

import com.bilgeadam.dto.request.UpdateEmailOrUsernameRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static com.bilgeadam.constants.ApiUrls.FINDBYROLE;

@FeignClient(url = "http://localhost:7071/auth",decode404 = true, name = "userprofile-auth")
public interface IAuthManager {
    @PutMapping("/updateemailorusername")
    public ResponseEntity<Boolean> updateEmailOrUsername(@RequestBody UpdateEmailOrUsernameRequestDto dto);

    @GetMapping(FINDBYROLE)
    public ResponseEntity<List<Long>> findByRole(@RequestParam String role);
}
