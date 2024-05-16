package bibim.backend.repository;
import bibim.backend.domain.Post;


public interface PostRepository {
    Post findById(Long id);
    Post save(Post post);
}
