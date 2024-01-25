package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class InvenoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Invenory>> {

    @Override
    public EntityModel<Invenory> process(EntityModel<Invenory> model) {
        return model;
    }
}
