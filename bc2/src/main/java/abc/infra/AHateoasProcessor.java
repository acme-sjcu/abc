package abc.infra;

import abc.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<A>> {

    @Override
    public EntityModel<A> process(EntityModel<A> model) {
        return model;
    }
}
