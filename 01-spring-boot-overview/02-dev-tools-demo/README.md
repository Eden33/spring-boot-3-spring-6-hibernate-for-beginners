`spring-boot-starter-test` enables you to hot replace code in the spring boot application in case you change application code in your working copy. 

To make it work in Visual Studio Code you need to enable java autobuild of "Java Language Support for Visual Studio Code" redhat plugin (https://github.com/redhat-developer/vscode-java): `java.autobuild.enabled": true`

and turn on change detection in spring boot tools plugin (https://marketplace.visualstudio.com/items?itemName=vmware.vscode-spring-boot): `"boot-java.change-detection.on": true`