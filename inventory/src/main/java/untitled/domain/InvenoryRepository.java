package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "invenories",
    path = "invenories"
)
public interface InvenoryRepository
    extends PagingAndSortingRepository<Invenory, Long> {}
