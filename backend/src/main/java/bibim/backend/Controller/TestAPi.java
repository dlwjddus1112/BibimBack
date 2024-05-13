package bibim.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPi {

    @GetMapping("/test/json")
    public ApiResponse testJson() {
        return ApiResponse.create("2주차 세션 테스트 API - JSON");
    }


}
