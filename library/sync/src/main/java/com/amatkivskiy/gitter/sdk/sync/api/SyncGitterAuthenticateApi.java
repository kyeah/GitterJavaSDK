package com.amatkivskiy.gitter.sdk.sync.api;

import com.amatkivskiy.gitter.sdk.model.response.AccessTokenResponse;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface SyncGitterAuthenticateApi {

  @POST("/login/oauth/token")
  @FormUrlEncoded
  AccessTokenResponse getAccessToken(
      @Field("client_id") String clientId,
      @Field("client_secret") String clientSecret,
      @Field("code") String code,
      @Field("redirect_uri") String redirectUri,
      @Field("grant_type") String grantType
  );
}