package bibim.backend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private Long id;
    private String title;
    private String content;
    private Member member;

    @Builder
    private Post(String title, String content, Member member) {
        this.title = title;
        this.content = content;
        this.member = member;
    }

    public static Post post(String title, String content) {
        return Post.builder()
                .title(title)
                .content(content)
                .build();
    }
}