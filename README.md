# HttpClientUtil
The HttpClient Tools based on Apache HttpClient 4.X

HttpClient tools by only one simple class. Provide *GET,POST,PUT,PATCH,DELETE*.

Maven Dependencies:

``` xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.2</version>
</dependency>
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpmime</artifactId>
    <version>4.5.2</version>
</dependency>
```

Demo:

- HttpClientUtil.GET.invoke(uri, headers, Consts.UTF_8).getStatus()
- HttpClientUtil.POST.formData(uri, headers, body, Consts.UTF_8).getStatus()
- HttpClientUtil.POST.formUrlencoded(uri, headers, body, Consts.UTF_8).getStatus()
- HttpClientUtil.PUT.textPlain(uri, headers, bodyAsString, Consts.UTF_8).getStatus()
- HttpClientUtil.PUT.applicationJson(uri, headers, bodyAsString, Consts.UTF_8).getContent()
- HttpClientUtil.PATCH.applicationJavascript(uri, headers, bodyAsString, Consts.UTF_8).getContent()
- HttpClientUtil.PATCH.applicationXml(uri, headers, bodyAsString, Consts.UTF_8).getContent()
- HttpClientUtil.DELETE.textXml(uri, headers, bodyAsString, Consts.UTF_8).getContent()
- HttpClientUtil.DELETE.textHtml(uri, headers, bodyAsString, Consts.UTF_8).getContent()
