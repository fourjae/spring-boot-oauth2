package com.oauth2.dto;


import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public abstract class OauthLoginResponse {
    private String accessToken;
}
