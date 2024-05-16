package bibim.backend.repository;
import bibim.backend.domain.Post;


public interface PostRepository {

    Post findById(Long id);
    void save(Post post);
}
