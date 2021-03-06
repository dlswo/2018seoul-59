package org.coin.coin.c_information;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.coin.coin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CI_Fragment1 extends Fragment {

    private WebView mWebView;

    public CI_Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_ci_fragment1, container, false);
        mWebView = (WebView) v.findViewById(R.id.web_view);
        mWebView.loadUrl("file:///android_asset/c_nowon_course.html");

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());

        return v;

    }

}