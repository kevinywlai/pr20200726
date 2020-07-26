# Practice of Spring-boot and AngularJS

## Created
	- https://start.spring.io/
	
<br>
<img src="spring-initializr.png"/>

## Reference

### video 
	- https://learning.oreilly.com/videos/spring-mvc-for/9781492036043/9781492036043-video319678

### Common Application properties
	- https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html
	
## Note

### invokeFlushAfterService="false"
	
<img src="Annotation2020-07-26180909.png"/>
	
	- click "open server configuration" to open server.xml
	
	- Add: <webContainer throwExceptionWhenUnableToCompleteOrDispatch="false" invokeFlushAfterService="false"></webContainer>