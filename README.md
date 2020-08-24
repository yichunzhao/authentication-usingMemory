# demo-memeory-authentication
authentication using memoery

## Spring security auto-configuration

By default, once Security-starter is found in the classpath, Spring automatically configures a username = 'user', and generates a UUID as a login password. 

> 2020-08-24 03:45:22.609  INFO 13652 --- [  restartedMain] .s.s.UserDetailsServiceAutoConfiguration : 
> Using generated security password: 049793af-2291-4277-90dd-f09c4fa0bbe0

## AuthenticationManagerBuilder

Using builder to initiate a `inMemoryAuthentication `
