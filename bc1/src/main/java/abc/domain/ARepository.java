package abc.domain;

import abc.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "as", path = "as")
public interface ARepository extends PagingAndSortingRepository<A, Long> {}
