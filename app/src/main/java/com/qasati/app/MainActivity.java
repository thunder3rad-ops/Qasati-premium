package com.qasati.app;
import android.app.*;import android.os.*;import android.webkit.*;import android.view.*;import android.graphics.Color;
public class MainActivity extends Activity{ WebView web; public void onCreate(Bundle b){super.onCreate(b); getWindow().setStatusBarColor(Color.rgb(15,26,69)); web=new WebView(this); setContentView(web); WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); s.setAllowContentAccess(true); web.setWebViewClient(new WebViewClient()); web.loadUrl("file:///android_asset/index.html");}
 public void onBackPressed(){ if(web!=null && web.canGoBack()) web.goBack(); else super.onBackPressed(); }}
