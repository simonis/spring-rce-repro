This is a very basic reproducer for the Spring4Shell (i.e. [CVE-2022-22965](https://tanzu.vmware.com/security/cve-2022-22965)) vulnerabilty.

The [exp.py]() is taken from https://github.com/craig/SpringCore0day/blob/main/exp.py

**Build**

```
mvn package
```

**Deploy**

```
cp target/spring-core-rce-0.0.1-SNAPSHOT.war <tomcat-root>/webapps/ROOT.war
```

**Execute**

```
./exp.py --url http://localhost:8080/
```
