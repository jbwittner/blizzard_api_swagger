# BlizzardAPISwagger
A repository where have a swagger specification and where code is generated for the Blizzard API

# Publish

To update source, modify the openapi specification.

Change version of openapi specification.

Change version in package.json (for wow_retail/wow_api_typescript-axios)

In each part, launch :
   - `npm ci`
   - `npm run delete`
   - `npm run generate`
   - `npm run build`
   - `npm run deploy`

# NPM

To publish a npm package you need to register with `npm adduser --registry=https://npm.pkg.github.com --scope=@jbwittner`
The password are a [token](https://github.com/settings/tokens)

# Maven

To publis a maven package you need this settings.xml :

```xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0                  http://maven.apache.org/xsd/settings-1.0.0.xsd">
   <profiles>
      <profile>
         <id>GitHub</id>
         <repositories>
            <repository>
               <id>central</id>
               <url>https://repo1.maven.org/maven2</url>
            </repository>
            <repository>
               <id>github</id>
               <url>https://maven.pkg.github.com/jbwittner/*</url>
               <snapshots>
                  <enabled>true</enabled>
               </snapshots>
            </repository>
         </repositories>
      </profile>
   </profiles>
   <servers>
      <server>
         <id>github</id>
         <username>USERNAME</username>
         <password>TOKEN</password>
      </server>
   </servers>
   <activeProfiles>
      <activeProfile>GitHub</activeProfile>
   </activeProfiles>
</settings>
```

# WOW Retail

[**README Java**](wow_retail/wow_api_java/README.md)