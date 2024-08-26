package com.cbfacademy.eventsapiassessment.eventcreators;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EventCreators")
public class EventCreators {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String username;
  private String email;
  private BigDecimal amountOfEvents;
  private Instant creationDateTime;

  public EventCreators() {
    this(null, null, BigDecimal.ZERO, Instant.now());
  }

  public EventCreators(String username, String email, BigDecimal amountOfEvents, Instant creationDateTime) {
    this.username = username;
    this.email = email;
    this.amountOfEvents = amountOfEvents;
    this.creationDateTime = creationDateTime;
  }

  public UUID getId() {
    return this.id;
  }
  
  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BigDecimal getAmountOfEvents() {
    return this.amountOfEvents;
  }

  public void setAmountOfEvents(BigDecimal amountOfEvents) {
    this.amountOfEvents = amountOfEvents;
  }

  public Instant getCreationDateTime() {
    return this.creationDateTime;
  }

  public void setCreationDateTime(Instant creationDateTime) {
    this.creationDateTime = creationDateTime;
  }
}