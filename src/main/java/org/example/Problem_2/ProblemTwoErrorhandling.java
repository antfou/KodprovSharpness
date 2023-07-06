package org.example.Problem_2;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class ProblemTwoErrorhandling {
    public boolean isValidUrl(String url){

        try {
            new URL(url).toURI();
            return true;
        } catch (MalformedURLException | URISyntaxException e) {
            return false;
        }
    }

    public String normalizeUrl(String url) {
        StringBuilder returnable = new StringBuilder(url);
        if (!url.startsWith("https://") && !url.startsWith("http://")) {
            returnable.insert(0, "https://www.");
        }
        return returnable.toString();
    }
}
