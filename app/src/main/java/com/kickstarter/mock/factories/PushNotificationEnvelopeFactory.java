package com.kickstarter.mock.factories;

import android.support.annotation.NonNull;

import com.kickstarter.models.pushdata.GCM;
import com.kickstarter.services.apiresponses.PushNotificationEnvelope;

public final class PushNotificationEnvelopeFactory {
  private PushNotificationEnvelopeFactory() {}

  public static @NonNull PushNotificationEnvelope envelope() {
    final GCM gcm = GCM.builder()
      .alert("You've received a new push notification")
      .title("Hello")
      .build();

    return PushNotificationEnvelope.builder()
      .gcm(gcm)
      .build();
  }
}
