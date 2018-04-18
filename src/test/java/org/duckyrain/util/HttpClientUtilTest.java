package org.duckyrain.util;

import org.apache.http.Consts;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DuQiyu on 2018/4/18.
 */
public class HttpClientUtilTest {

    private static String uri = "https://github.com/duckyrain/HttpClientUtil";

    private static Map<String, String> headers;

    private static Map<String, String> body;

    private static String bodyAsString;

    static {
        headers = new HashMap<String, String>();
        headers.put("Authorization", "p@ssw0rd");
        body = new HashMap<String, String>();
        body.put("name", "duckyrain");
        body.put("sex", "male");
        bodyAsString = "{\"name\":\"duckyrain\", \"sex\":\"male\"}";
    }

    @Test
    public void invoke() throws Exception {
        System.out.println(HttpClientUtil.GET.invoke(uri, null, Consts.UTF_8));
    }

    @Test
    public void formData() throws Exception {
        System.out.println(HttpClientUtil.POST.formData(uri, headers, body, Consts.UTF_8));
    }

    @Test
    public void formUrlencoded() throws Exception {
        System.out.println(HttpClientUtil.POST.formUrlencoded(uri, headers, body, Consts.UTF_8));
    }

    @Test
    public void textPlain() throws Exception {
        System.out.println(HttpClientUtil.POST.textPlain(uri, headers, bodyAsString, Consts.UTF_8));
    }

    @Test
    public void applicationJson() throws Exception {
        System.out.println(HttpClientUtil.POST.applicationJson(uri, headers, bodyAsString, Consts.UTF_8));
    }

    @Test
    public void applicationJavascript() throws Exception {
        System.out.println(HttpClientUtil.POST.applicationJavascript(uri, headers, bodyAsString, Consts.UTF_8));
    }

    @Test
    public void applicationXml() throws Exception {
        System.out.println(HttpClientUtil.POST.applicationXml(uri, headers, bodyAsString, Consts.UTF_8));
    }

    @Test
    public void textXml() throws Exception {
        System.out.println(HttpClientUtil.POST.textXml(uri, headers, bodyAsString, Consts.UTF_8));
    }

    @Test
    public void textHtml() throws Exception {
        System.out.println(HttpClientUtil.POST.textHtml(uri, headers, bodyAsString, Consts.UTF_8));
    }

}