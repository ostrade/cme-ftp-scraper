# cme-ftp-scraper

The CME FTP scraper is a helper library for fetching data from CME's FTP server. 

# Building

[Maven wrapper](https://maven.apache.org/wrapper/) is installed. 

To execute unit tests:
```
./mvnw clean test
```

To package and execute integration tests (requires connectivity to ftp.cmegroup.com): 
```
./mvnw clean verify
```

(TODO) To package, execute all tests, and deploy to Maven Central:
```
./mvnw clean deploy
```