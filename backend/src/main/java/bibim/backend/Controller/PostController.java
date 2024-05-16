package bibim.backend.Controller;


import bibim.backend.domain.dto.ResponseMemberGetDto;
import bibim.backend.domain.dto.ResponsePostGetDto;
import bibim.backend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import bibim.backend.service.PostService;
import bibim.backend.domain.dto.CreatePostDto;
import bibim.backend.domain.dto.ResponsePostCreateDto;



@RestController
@RequestMapping("/post")
@RequiredArgsConstructor



public class PostController {
    private final PostService postService;

    @PostMapping("/post")
    public ResponsePostCreateDto createPost(
            @RequestBody CreatePostDto createPostDto
    ){
        postService.create(createPostDto);
        return new ResponsePostCreateDto(200, "게시글이 작성됨.");
    }
    @GetMapping("/post/{postId}")
    public ResponsePostGetDto getPost(
            @PathVariable Long postId
    ){
        return postService.findPost(postId);
    }





}
