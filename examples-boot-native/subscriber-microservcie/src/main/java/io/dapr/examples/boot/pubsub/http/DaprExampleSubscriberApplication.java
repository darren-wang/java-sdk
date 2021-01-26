/*
 * Copyright (c) Microsoft Corporation.
 * Licensed under the MIT License.
 */

package io.dapr.examples.boot.pubsub.http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaprExampleSubscriberApplication {
  public static void main(String[] args) {
    SpringApplication.run(DaprExampleSubscriberApplication.class, args);
  }
}
