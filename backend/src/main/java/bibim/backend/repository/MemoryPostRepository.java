package bibim.backend.repository;
import bibim.backend.domain.Post;
import org.springframework.stereotype.Repository;


@Repository
public class MemoryPostRepository implements PostRepository{

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public Post save(Post post) {
        return null;
    }
}
