package com.cbfacademy.eventsapiassessment.eventcreators;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;
public interface EventCreatorsRepository extends ListCrudRepository<EventCreators, UUID> {
    

}
