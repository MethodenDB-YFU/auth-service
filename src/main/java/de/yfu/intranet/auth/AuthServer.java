package de.yfu.intranet.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class AuthServer extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(AuthServer.class, args);
    }

    /*
    Redirect user to:
    http://0.0.0.0:8888/api/oauth/authorize?response_type=code&client_id=acme&redirect_uri=http://example.com&scope=openid

    Login with:
    User: user
    Password: password

    Post to get token
    curl -X POST \
      'http://acme:acmesecret@0.0.0.0:8888/api/oauth/token?grant_type=authorization_code&client_id=acme&redirect_uri=http://example.com&code=Yf3vZB&scope=openid' \
      -H 'Cache-Control: no-cache' \
      -H 'Content-Type: application/x-www-form-urlencoded' \
      -H 'X-CSRF-TOKEN: 91BB2BD16640FD6E731C7C88D54B0528' \
      -d 'scope.read=true&scope.write=true&scope.openid=true'
    */


}